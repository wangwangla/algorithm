package com.shuati.letcode;
//
//小扣打算给自己的 VS code 安装使用插件，初始状态下带宽每分钟可以完成 1 个插件的下载。假定每分钟选择以下两种策略之一:
//
//        使用当前带宽下载插件
//        将带宽加倍（下载插件数量随之加倍）
//        请返回小扣完成下载 n 个插件最少需要多少分钟。
//
//        注意：实际的下载的插件数量可以超过 n 个
//
//        来源：力扣（LeetCode）
//        链接：https://leetcode.cn/problems/Ju9Xwi
//        著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
public class _LSC_leastMinutes {
    /**
     * 1 22
     * 1 1 4 4
     * @param n
     * @return
     */
    public int leastMinutes(int n) {
        int per = 1; //每分钟下载的个数
        int ans = 0; // 用的时间
        while(n > 0){
            if(n <= per){
                ans += 1;
                n -= per;
            }else{
                ans += 1;
                per *= 2;
            }
        }
        return ans;
    }

    public int leastMinutes1(int n) {
        if(n <= 2) return n;
        return (int)Math.ceil(Math.log(n)/Math.log(2))+1;
    }

    public static void main(String[] args) {
        _LSC_leastMinutes lsc_leastMinutes = new _LSC_leastMinutes();
        System.out.println(lsc_leastMinutes.leastMinutes1(3));
    }
}
