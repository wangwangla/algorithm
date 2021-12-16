package com.shuati.hash;

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
            cur.node[z] = new Node();
            cur.starNum++;
            if (i == chars.length-1){
                cur.end ++;
            }
            cur = cur.node[i];
        }
    }

    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("word");
        System.out.println("-------");
    }

    public boolean search(String word) {
        char[] chars = word.toCharArray();
        Node cur = head;
        Node pre = head;
        for (int i = 0; i < chars.length; i++) {
            if (cur.node[i]!=null) {
                pre = cur;
                cur = cur.node[i];
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
//
    public boolean startsWith(String prefix) {
        char[] chars = prefix.toCharArray();
        Node cur = head;
        for (int i = 0; i < chars.length; i++) {
            if (cur.node[i]!=null) {
                cur = cur.node[i];
            }else {
                return false;
            }
        }
        return true;
    }
}
