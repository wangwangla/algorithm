package com.algorithm._13_Utils;

public class Trie {
    Trie[] child;
    public Trie(){
        this.child = new Trie[2];
    }

    public void insert(int num){
        Trie cur = this;
        for (int i = 30; i > 0; i--) {
            int bit = (num >> i) & i;
            if (cur.child[bit] == null){
                cur.child[bit] = new Trie();
            }
            cur = cur.child[bit];
        }
    }

    public int search(int num){
        Trie cur = this;
        int ans = 0;
        for (int i = 30; i > 0; i--) {
            int bit = (num >> i) & 1;
            bit = cur.child[bit ^ 1] == null ? bit : bit ^ 1;
            ans += bit << i;
            cur = cur.child[bit];
        }
        return ans;
    }

    public int findMaximumXOR(int[] nums) {
        int max = 0; // 两个非负数的异或必为非负数
        Trie trie = new Trie();
        for(int num : nums){
            trie.insert(num);
            max = Math.max(max, num ^ trie.search(num));
        }
        return max;
    }

    public int xxx(int num){
        int nums = 0;
        while (num!=0){
            int i = num & 1;
            if (i == 1){
                nums ++;
            }
        }
        return nums;
    }

//    for
}
