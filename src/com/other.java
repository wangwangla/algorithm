package com;

public class other {
    public static void main(String[] args) {
        String musicNamePath = new String("/sjh/sjss/sjjs/sjhs/sd/1.mp3");
        int i = musicNamePath.lastIndexOf("/");
        String musicRootPath = musicNamePath.substring(0, i);
        String musicName = musicNamePath.substring(i+1,musicNamePath.length());
        int i1 = musicName.lastIndexOf(".");
        String name = musicName.substring(0, i1);
        i = musicRootPath.lastIndexOf("/");
        musicRootPath = musicRootPath.substring(0, i)+"/lyric/";
        System.out.println(musicRootPath+name+".lyric");
//        System.out.println(h);
//        System.out.println(substring);
    }
}
