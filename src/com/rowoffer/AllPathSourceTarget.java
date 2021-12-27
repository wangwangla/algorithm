package com.rowoffer;

import java.util.List;

/**
 * 给定一个有 n 个节点的有向无环图，用二维数组 graph 表示，请找到所有从 0 到 n-1 的路径并输出（不要求按顺序）。
 *
 * graph 的第 i 个数组中的单元都表示有向图中 i 号节点所能到达的下一些结点（译者注：有向图是有方向的，即规定了 a→b 你就不能从 b→a ），若为空，就是没有下一个节点了
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/bP4bmD
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * 输入：graph = [[1,2],[3],[3],[]]
 * 输出：[[0,1,3],[0,2,3]]
 * 解释：有两条路径 0 -> 1 -> 3 和 0 -> 2 -> 3
 *
 *
 * 使用二维数组绘制查看结果， 是有向图的深度遍历
 * （1）将二维数组变为一个有向图
 * （2）深度遍历
 */
public class AllPathSourceTarget {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {

        return null;
    }
}
