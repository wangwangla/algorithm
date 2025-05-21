package com.base64;

import java.io.*;
import java.util.Base64;

public class App {
    public static void main(String[] args) throws Exception {
        byte[] bytesByFile = getBytesByFile("draft_content.json");
        byte[] decode = decoder.decode(bytesByFile);
//        String s = new String(decode);
//        System.out.println(s);
//
        FileOutputStream fileOutputStream = new FileOutputStream(new File("xxx"));
        fileOutputStream.write(decode);
    }


    public static final Base64.Decoder decoder = Base64.getDecoder();

    public static boolean decrypt(String sourcePath, String desPath) {
        byte[] fileBytes = getBytesByFile(sourcePath);
        byte[] encryptedBytes = dataEncrypt(decoder.decode(fileBytes), '8');//生成加密的字节
        getFileByBytes(encryptedBytes, desPath);
        return true;
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
}
