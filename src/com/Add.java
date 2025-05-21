package com;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Add {
    public static void main(String[] args) throws Exception {
//        File file = new File("l1l");
//        FileInputStream inputStream = new FileInputStream(file);
//        byte[] b = new byte[20];
//        inputStream.read(b);
//        System.out.println(b);
//        int v = -57^53;
//        System.out.println(v);



        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("JavaScript");
        Object eval = engine.eval(new FileReader(new File("F:\\blokie/blokie.js")));
        System.out.println("========================");
    }
}
//53

// -68  -63  -57  -78 86 -38 -5

//-1 -40 -1

//-119 80 78  71