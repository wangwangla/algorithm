package kw.video;

import java.io.File;

public class VideoParse {
    public static void main(String[] args) {
        String path = "com/test/dir/create";
        File file = new File(path);
        file.mkdirs();
    }
}
