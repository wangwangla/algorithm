package kw.data;

import java.io.*;

public class App {

    WordStorage storage;
    public static void main(String[] args) {
        App main = new App();
        main.test03();
    }

    /**
     * 1 1 1 1 1
     * 1 2 4 8 16
     *
     *
     * 5位存储一个值
     *
     */
    public void test03(){
        storage = new WordStorage();
        String word = "zymologies";
        try {
            File file = new File("word.txt");
            FileOutputStream fos = new FileOutputStream("words.bin");
            DataOutputStream dos = new DataOutputStream(fos);
            BufferedReader re = new BufferedReader(new FileReader(file));
            String str = null;
            while ((str=re.readLine())!= null) {
                System.out.println(str);
                long numberRepresentation = storage.wordToNumber(str);
                dos.writeUTF(numberRepresentation+" ");
            }
            dos.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
