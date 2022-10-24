package kw.file;

import java.io.*;

public class FileUtils {
    public void writePrintWriter(String dFileName,String value){
//        File file = new File(dFileName);
//        File tempParent = new File(file.getParent());
//        if (!tempParent.exists()) {
//            tempParent.mkdirs();
//        }
//        try (PrintWriter writer = new PrintWriter(file)){
//            writer.write(value);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
    }

    public void writeByte(String dFileName,byte[] b){
//        File file = new File(dFileName);
//        File tempParent = new File(file.getParent());
//        if (!tempParent.exists()) {
//            tempParent.mkdirs();
//        }
//        try (FileOutputStream writer = new FileOutputStream(file)){
//            writer.write(b);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    public String readString (String fileName){
        String output = "";
//        try(BufferedReader reader = new BufferedReader(new FileReader(fileName));) {
//            String nextLine = "";
//            do {
//                output += nextLine;
//                output += File.separator;
//                nextLine = reader.readLine();
//            } while (nextLine != null);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        return output;
    }

    public String xx(){
        return new Printer(getClass(),
                new Printer.Label("Path","xx")).toString();
    }
}
