package com.pic;

import java.io.*;
import java.util.Base64;

public class App {

    /**
    * 图片加解密工具
    */

    public static final Base64.Encoder encoder = Base64.getEncoder();
    public static final Base64.Decoder decoder = Base64.getDecoder();

    /**
     * 加密
     *
     * @param sourcePath
     * @return
     */
    public static boolean encryption(String sourcePath, String desPath) {
        byte[] fileBytes = getBytesByFile(sourcePath);
        byte[] encryptedBytes = dataEncrypt(fileBytes, '8');//生成加密的字节
        getFileByBytes(encoder.encode(encryptedBytes), desPath);
        return true;
    }

    /**
     * 解密
     *
     * @param sourcePath
     * @param desPath
     * @return
     */
    public static boolean decrypt(String sourcePath, String desPath) {
        byte[] fileBytes = getBytesByFile(sourcePath);
        byte[] encryptedBytes = dataEncrypt(decoder.decode(fileBytes), '8');//生成加密的字节
        getFileByBytes(encryptedBytes, desPath);
        return true;
    }

    /**
     * 解密
     * @param bytes
     * @return
     */
    public static byte[] decrypt(String bytes) {
        byte[] encryptedBytes = dataEncrypt(decoder.decode(bytes), '8');//生成加密的字节
        return encryptedBytes;
    }

    /**
     * 生成加密字节数组
     * @param bytes
     * @return
     */
    public static byte[] encryption(byte[] bytes) {
        byte[] encryptedBytes = dataEncrypt(bytes, '8');//生成加密的字节
        return encoder.encode(encryptedBytes);
    }

    /**
     * 进行加解密异或
     *
     * @param bt
     * @param secret
     * @return
     */
    public static byte[] dataEncrypt(byte[] bt, char secret) {
        int secretCount = 200;
        //字符串转byte数组
        if (bt != null && bt.length > secretCount) {
            //进行遍历加密
            for (int i = 0; i < secretCount; i++) {//从最开始向后异或运算加密
                bt[i] = (byte) (bt[i] ^ (int) secret);  //进行异或运算
            }

            for (int i = bt.length - 1; i >= 0; i--) {//从最后向前异或运算
                bt[i] = (byte) (bt[i] ^ (int) secret);  //进行异或运算
            }

            int middleIndex = bt.length / 3;
            for (int i = middleIndex; i < secretCount; i++) {//从中间异或运算
                bt[i] = (byte) (bt[i] ^ (int) secret);  //进行异或运算
            }
        }
        //将位数组转为String类型
        return bt;
    }

    /**
     * 文件转字节
     *
     * @param pathStr
     * @return
     */
    public static byte[] getBytesByFile(String pathStr) {
        File file = new File(pathStr);
        System.out.println("文件大小为: " + file.length());
        try {
            FileInputStream fis = new FileInputStream(file);
            ByteArrayOutputStream bos = new ByteArrayOutputStream(1024);
            byte[] b = new byte[1024];
            int n;
            while ((n = fis.read(b)) != -1) {
                bos.write(b, 0, n);
            }
            fis.close();
            byte[] data = bos.toByteArray();
            bos.close();
            return data;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 字节转文件
     *
     * @param bytes
     * @param filePath
     */
    public static void getFileByBytes(byte[] bytes, String filePath) {
        BufferedOutputStream bos = null;
        FileOutputStream fos = null;
        File file = null;
        try {
            file = new File(filePath);
            File dir=new File(file.getParent());
            // 判断文件目录是否存在
            if (!dir.exists() && dir.isDirectory()) {
                dir.mkdirs();
            }
            fos = new FileOutputStream(file);
            bos = new BufferedOutputStream(fos);
            bos.write(bytes);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        App app = new App();
        app.test();
    }
    /**
     * 测试实例(通过图片地址)
     */
    public void test() {
        String dirName = "D:\\ImageTest";
        String desName = "D:\\ImageTest\\manke";
        File file = new File(dirName);
        if (file.isDirectory()) {
            String[] list = file.list();
            for (int i = 0; i < list.length; i++) {
                if (list[i].equals("manke")) {
                    continue;
                }
                String fullPath = new File(dirName + "\\" + list[i]).getPath();
                String desPath = desName + "\\" + list[i];
                App.encryption(fullPath, desPath);
            }
        }
        String desName2 = "D:\\ImageTest\\manke\\jiemi";
        //解密
        File file2 = new File(desName);
        if (file2.isDirectory()) {
            String[] list = file2.list();
            for (int i = 0; i < list.length; i++) {
                if (list[i].equals("jiemi")) {
                    continue;
                }
                String fullPath = new File(desName + "\\" + list[i]).getPath();

                String despath = desName2 + "\\" + list[i];
                App.decrypt(fullPath, despath);
            }
        }
    }
    /**
     * 测试实例(图片加密存储)
     * @param base64 图片bytes数组
     * @param fileParentPath 图片父路径
     * @param fileName 图片名称
     * @param fileSuffix 图片后缀
     */
    public String base64EncryptionToImage(byte[] base64, String fileParentPath, String fileName, String fileSuffix){
        try {
            // 1.判断路径参数
//            if (StringUtils.isBlank(fileParentPath) || StringUtils.isEmpty(fileParentPath)){
//                throw new BusinessException(RetCode.RECORD_NOT_FOUND, "图片父路径为空或未找到该路径");
//            }
            // 2.检验文件夹是否存在,创建文件夹
            File file = new File(fileParentPath);
            if (!file.exists()){
                file.mkdirs();
            }
            // 3.获取base64加密
            // base64加密
            byte[] encryption = App.encryption(base64);
            // 加密数组转为正常数组
            byte[] encryptionDecode = Base64.getDecoder().decode(encryption);
            // 4.加密后base64转为图片
            String imagePath = file + "/" + fileName + "." + fileSuffix; // 文件全路径
            File imageFile = new File(imagePath);
            // 图片写出
            FileOutputStream outputStream = new FileOutputStream(imageFile);
            outputStream.write(encryptionDecode);
            outputStream.close();
            return imagePath;
        } catch (Exception e){
            System.err.println("图片加密失败,原因:"+e.getMessage());
            return null;
        }
    }


}
