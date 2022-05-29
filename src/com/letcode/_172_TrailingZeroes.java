package com.letcode;

public class _172_TrailingZeroes {
    /**
     * 阶乘
     *
     * nx(n-1)x(n-2)……
     *
     * n! 尾零的数量即为 n! 中因子 10 的个数，而 10=2\times 510=2×5，因此转换成求 n!n! 中质因子 22 的个数和质因子 55 的个数的较小值。
     *
     * 由于质因子 55 的个数不会大于质因子 22 的个数（具体证明见方法二），我们可以仅考虑质因子 55 的个数。
     *
     * 而 n!n! 中质因子 55 的个数等于 [1,n][1,n] 的每个数的质因子 55 的个数之和，我们可以通过遍历 [1,n][1,n] 的所有 55 的倍数求出。
     *
     *
     *
     * @param n
     * @return
     */
    public int trailingZeroes(int n) {
        int ans = 0;
        for (int i = 5; i <= n; i += 5) {
            for (int x = i; x % 5 == 0; x /= 5) {
                ++ans;
            }
        }
        return ans;
    }


    /**
     * 对于一个数的阶乘，就如之前分析的，5 的因子一定是每隔 5 个数出现一次，也就是下边的样子。
     *
     * n! = 1 * 2 * 3 * 4 * (1 * 5) * ... * (2 * 5) * ... * (3 * 5) *... * n
     *
     * 因为每隔 5 个数出现一个 5，所以计算出现了多少个 5，我们只需要用 n/5 就可以算出来。
     *
     * 但还没有结束，继续分析。
     *
     * ... * (1 * 5) * ... * (1 * 5 * 5) * ... * (2 * 5 * 5) * ... * (3 * 5 * 5) * ... * n
     *
     * 每隔 25 个数字，出现的是两个 5，所以除了每隔 5 个数算作一个 5，每隔 25 个数，还需要多算一个 5。
     *
     * 也就是我们需要再加上 n / 25 个 5。
     *
     * 同理我们还会发现每隔 5 * 5 * 5 = 125 个数字，会出现 3 个 5，所以我们还需要再加上 n / 125 。
     *
     * 综上，规律就是每隔 5 个数，出现一个 5，每隔 25 个数，出现 2 个 5，每隔 125 个数，出现 3 个 5... 以此类推。
     *
     * 最终 5 的个数就是 n / 5 + n / 25 + n / 125 ...
     *
     * 写程序的话，如果直接按照上边的式子计算，分母可能会造成溢出。所以算 n / 25 的时候，我们先把 n 更新，n = n / 5，然后再计算 n / 5 即可。后边的同理。
     *
     * 作者：windliang
     * 链接：https://leetcode-cn.com/problems/factorial-trailing-zeroes/solution/xiang-xi-tong-su-de-si-lu-fen-xi-by-windliang-3/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     * @param n
     * @return
     */
    public int xx(int n) {
        int ans = 0;
        while (n != 0) {
            n /= 5;
            ans += n;
        }
        return ans;
    }

    public static void main(String[] args) {
        int num = 5;
        _172_TrailingZeroes trailingZeroes = new _172_TrailingZeroes();
        trailingZeroes.xx(num);
    }
}
