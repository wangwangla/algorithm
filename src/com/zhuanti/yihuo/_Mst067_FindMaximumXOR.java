package com.zhuanti.yihuo;

/**
 * 给你一个整数数组 nums ，返回 nums[i] XOR nums[j] 的最大运算结果，其中 0 ≤ i ≤ j < n 。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：nums = [3,10,5,25,2,8]
 * 输出：28
 * 解释：最大运算结果是 5 XOR 25 = 28.
 * 示例 2：
 *
 * 输入：nums = [14,70,53,83,49,91,36,80,92,51,66,70]
 * 输出：127
 *  
 *
 * 提示：
 *
 * 1 <= nums.length <= 2 * 105
 * 0 <= nums[i] <= 231 - 1
 *  
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/ms70jA
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class _Mst067_FindMaximumXOR {
    public static void main(String[] args) {
//        _Mst067_FindMaximumXOR findMaximumXOR = new _Mst067_FindMaximumXOR();
//        int[] nums = {3,10,5,25,2,8};
//        int maximumXOR = findMaximumXOR.findMaximumXOR(nums);
//        System.out.println(maximumXOR);
        int a = 10;
        System.out.println(10 ^ 10);
    }
    static class TrieNode{
        public TrieNode[] children;

        public TrieNode() {
            children = new TrieNode[2];
        }
    }
    //    由于整数都是32位的，前缀树对应的路径长度是一样的
    public TrieNode buildTrie(int[] nums){
        TrieNode root = new TrieNode();
        for (int num : nums) {
            TrieNode node = root;
            for (int i = 31; i >=0 ; i--) {
//                bit相当于一个数字的32位通过循环依次从第1位到第32位的数字
                int bit = (num >> i)&1;
                if (node.children[bit] == null){
                    node.children[bit] = new TrieNode();
                }
                node = node.children[bit];
            }
        }
        return root;
    }
    public int findMaximumXOR(int[] nums){
        TrieNode root = buildTrie(nums);
        int max = 0;
        for (int num :nums){
            TrieNode node = root;
//            xor为异或值
            int xor = 0;
//            从高位开始扫描整数num的每个数位
            for (int i = 31; i >= 0; i--) {
                //bit是num的一个数位
                int bit = (num >> i)&1;
//                如果前缀树中存在某个整数的相同位置的数位和num的数位相反，则优先选择相反的数位
//                这是因为两个相反的数位异或的结果为1
                if (node.children[1-bit] !=null){
                    xor = (xor<<1) + 1;
                    node = node.children[1-bit];
                }else {
                    xor = xor<<1;
                    node = node.children[bit];
                }
                max = Math.max(max,xor);
            }
        }
        return max;
    }
    /**
     * 异或的最大值    他们1 和 0的值  不相同的最多
     *
     * 同为0  不同为1
     * @param args
     */
}
