package com.letcode;

/**
 * 首先对题目进行建模。观察题目可知，在任意一个时刻，此问题的状态可以由两个数字决定：X 壶中的水量，以及 Y 壶中的水量。
 *
 * 在任意一个时刻，我们可以且仅可以采取以下几种操作：
 *
 * 把 X 壶的水灌进 Y 壶，直至灌满或倒空；
 * 把 Y 壶的水灌进 X 壶，直至灌满或倒空；
 * 把 X 壶灌满；
 * 把 Y 壶灌满；
 * 把 X 壶倒空；
 * 把 Y 壶倒空。
 * 因此，本题可以使用深度优先搜索来解决。搜索中的每一步以 remain_x, remain_y 作为状态，即表示 X 壶和 Y 壶中的水量。
 * 在每一步搜索时，我们会依次尝试所有的操作，递归地搜索下去。这可能会导致我们陷入无止境的递归，因此我们还需要使用一个哈希结合（HashSet）
 * 存储所有已经搜索过的 remain_x, remain_y 状态，保证每个状态至多只被搜索一次。
 *
 * 在实际的代码编写中，由于深度优先搜索导致的递归远远超过了 Python 的默认递归层数（可以使用 sys 库更改递归层数，但不推荐这么做），
 * 因此下面的代码使用栈来模拟递归，避免了真正使用递归而导致的问题。
 *
 * 作者：LeetCode-Solution
 * 链接：https://leetcode.cn/problems/water-and-jug-problem/solution/shui-hu-wen-ti-by-leetcode-solution/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class _365_canMeasureWater {
    public boolean canMeasureWater(int jug1Capacity, int jug2Capacity, int targetCapacity) {
        return false;
    }
}
