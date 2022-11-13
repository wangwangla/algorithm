package kw.chess;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream(new File("book.dat"));
            Position.loadBook(fileInputStream);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Position pos = new Position();
        Search search = new Search(pos, 16);
        pos.fromFen("rnbakabnr/9/1c5c1/p1p1p1p1p/9/9/P1P1P1P1P/1C5C1/9/RNBAKABNR");
        search.prepareSearch();
        int i = search.searchMain(100 << 1);
        System.out.println(i);
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}