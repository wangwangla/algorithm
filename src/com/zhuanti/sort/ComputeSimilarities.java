package com.zhuanti.sort;

import java.util.*;

/**
 * 两个(具有不同单词的)文档的交集(intersection)中元素的个数除以并集(union)中元素的个数，就是这两个文档的相似度。例如，{1, 5, 3} 和 {1, 7, 2, 3} 的相似度是 0.4，其中，交集的元素有 2 个，并集的元素有 5 个。给定一系列的长篇文档，每个文档元素各不相同，并与一个 ID 相关联。它们的相似度非常“稀疏”，也就是说任选 2 个文档，相似度都很接近 0。请设计一个算法返回每对文档的 ID 及其相似度。只需输出相似度大于 0 的组合。请忽略空文档。为简单起见，可以假定每个文档由一个含有不同整数的数组表示。
 *
 * 输入为一个二维数组 docs，docs[i] 表示 id 为 i 的文档。返回一个数组，其中每个元素是一个字符串，代表每对相似度大于 0 的文档，其格式为 {id1},{id2}: {similarity}，其中 id1 为两个文档中较小的 id，similarity 为相似度，精确到小数点后 4 位。以任意顺序返回数组均可。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/sparse-similarity-lcci
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class ComputeSimilarities {
    public static void main(String[] args) {
        int aa [][] = {{14, 15, 100, 9, 3},
            {32, 1, 9, 3, 5},
            {15, 29, 2, 6, 8, 7},
            {7, 10}};
        ComputeSimilarities computeSimilarities = new ComputeSimilarities();
        computeSimilarities.computeSimilarities(aa);
    }
    public List<String> computeSimilarities(int[][] docs) {
        //两个for循环对所有的数组进行一次遍历
        List<String> list = new ArrayList<>();
        for (int i = 0; i < docs.length; i++) {
            int src[] = docs[i];
            Arrays.sort(src);
            for (int i1 = i+1; i1 < docs.length; i1++) {
                int cur[] = docs[i1];
                Arrays.sort(cur);
                int xx = 0;
                int max = src.length+cur.length;
                int index1  = 0;
                int index2 =  0;
                while (true){
                    if (index1>=cur.length || index2>=src.length)break;
                    if (cur[index1] == src[index2]){
                        xx++;
                        index1++;
                        index2++;
                    }else if (cur[index1] > src[index2]){
                        index2 ++;
                    }else {
                        index1++;
                    }
                }
                if (xx!=0)
                    list.add(String.format("%d,%d: %.4f", i,i1,xx * 0.1 / max-xx));
//                System.out.println(String.format("%d,%d: %.4f", i,i1,xx * 0.1 / max).toString());
//                System.out.println(xx*0.1/max);
            }
        }
        return list;
    }

    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        int n = nums.length;
        //Long: 防止整型 int 溢出
        TreeSet<Long> set = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            //ceiling: 返回Set中大于/等于e的最小元素
            Long ceiling = set.ceiling((long) nums[i] - (long) t);
            if (ceiling != null && ceiling <= (long) nums[i] + (long) t) {
                return true;
            }
            set.add((long) nums[i]);

            if (i >= k) {
                set.remove((long) nums[i - k]);
            }
        }

        return false;
    }
}
