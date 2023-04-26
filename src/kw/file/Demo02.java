package kw.file;

import java.io.*;

public class Demo02 {
    public static void main(String[] args) {
        File file = new File("word.txt");
        try {
            BufferedReader re = new BufferedReader(new FileReader(file));
            String str = null;
            FileOutputStream fos = new FileOutputStream("words.bin");
            DataOutputStream dos = new DataOutputStream(fos);
            StringBuilder builder = new StringBuilder();
            while ((str=re.readLine())!= null) {
                System.out.println(str);
                builder.append(str);
                dos.writeUTF(str);
            }
            dos.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
