package com.letcode;

/**
 * 有 n 个筹码。第 i 个芯片的位置是 position[i] 。
 *
 * 我们需要把所有筹码移到同一个位置。在一步中，我们可以将第 i 个芯片的位置从 position[i] 改变为:
 *
 * position[i] + 2 或 position[i] - 2 ，此时 cost = 0
 * position[i] + 1 或 position[i] - 1 ，此时 cost = 1
 * 返回将所有筹码移动到同一位置上所需要的 最小代价 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/minimum-cost-to-move-chips-to-the-same-position
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * 移动的目标是，需要求出几次有价值的，那么就是奇数到偶数，或者偶数到奇数需要多少次移动
 */
public class _1217_MinCostToMoveChips {
    public int minCostToMoveChips(int[] position) {
        int ji = 0;
        for (int i : position) {
            if (i%2!=0){
                ji++;
            }
        }
        return Math.min(ji,position.length - ji);
    }
}
