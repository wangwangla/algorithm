package com.zhuanti.hash;

public class Trie {
    class Node{
        Node[] node = new Node[26];
        char chars;
        private int starNum;
        private int end;
    }

    private Node head;
    public Trie() {
        head = new Node();
    }


    public void insert(String word) {
        Node cur = head;
        char[] chars = word.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            int z = aChar - 'a';
            cur.chars = aChar;
            if (cur.node[z]==null) {
                cur.node[z] = new Node();
            }
            cur.starNum++;
            if (i == chars.length-1){
                cur.end ++;
            }
            cur = cur.node[z];
        }
    }
    public static void main(String[] args) {
        Trie trie = new Trie();
//        [],["app"],["apple"],["beer"],["add"],["jam"],["rental"],["apps"],["app"]

        trie.insert("app");
        trie.insert("apple");
        trie.insert("beer");
        trie.insert("add");
        trie.insert("jam");
        trie.insert("rental");
        trie.search("apps");
        trie.search("app");
        System.out.println("-------");
    }

    public boolean search(String word) {
        char[] chars = word.toCharArray();
        Node cur = head;
        Node pre = head;
        for (int i = 0; i < chars.length; i++) {
            int ssss = chars[i] - 'a';
            if (cur.node[ssss]!=null) {
                pre = cur;
                cur = cur.node[ssss];
            }else {
                return false;
            }
        }
        if (pre.end != 0){
            return true;
        }else {
            return false;
        }
    }
//["Trie","insert","insert","insert","insert","insert","insert","search","search","search","search","search","search","search","search","search","startsWith","startsWith","startsWith","startsWith","startsWith","startsWith","startsWith","startsWith","startsWith"]
//[[],["app"],["apple"],["beer"],["add"],["jam"],["rental"],["apps"],["app"],["ad"],["applepie"],["rest"],["jan"],["rent"],["beer"],["jam"],["apps"],["app"],["ad"],["applepie"],["rest"],["jan"],["rent"],["beer"],["jam"]]
    public boolean startsWith(String prefix) {
        char[] chars = prefix.toCharArray();
        Node cur = head;
        for (int i = 0; i < chars.length; i++) {
            int ss = chars[i];
            if (cur.node[ss]!=null) {
                cur = cur.node[ss];
            }else {
                return false;
            }
        }
        return true;
    }
}
