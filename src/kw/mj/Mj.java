//package kw.mj;
//
//import java.util.*;
//
//public class Mj {
//
//    int MJ_WAN       = 1    ;//万
//    int MJ_TIAO      = 2    ;//条
//    int MJ_BING      = 3    ;//饼
//    int MJ_FENG      = 4    ;//东南西北(1357)
//    int MJ_ZFB       = 5    ;//中发白(135)
//    int Pai_MING     = 0    ;//明
//    int Pai_AN       = 1    ;//暗
//
//    final int Pai_My       = 0    ;//手牌组
//    final int Pai_Chi      = 1    ;//吃牌组
//    final int Pai_Peng     = 2    ;//碰牌组
//    final int Pai_Gang     = 3    ;//杠牌组
//    final int Pai_Ting     = 4    ;//听牌组
//
//    public static void main(String[] args) {
//
////        math.randomseed(tostring(os.time()):reverse():sub(1,6))
//        double random = Math.random();
//
//    }
//
////检查牌的明暗或者空
//    private double CheckSinglePaiMingAn(int pai){
//        return Math.floor(pai%10000/1000);
//    }
//
//    //检查单张牌所属牌组
//    private double CheckSinglePaiGroup(int pai){
//        return Math.floor(pai%1000/100);
//    }
//
////    检查单张牌的类型，万饼筒条
//    double CheckSinglePaiType(int pai){
//        return Math.floor(pai%100/10);
//    }
//
////    --检查单张牌的数值
//    double CheckSinglePaiNum(int pai){
//        return Math.floor(pai%10);
//    }
//
//
////--返回标准牌型数值(包括牌型与数字)
//    double GetPaiTypeNum(int pai){
//        return Math.floor(pai%100);
//    }
//
////--检测一对
//    boolean CheckAAPai(int iValue1,int iValue2){
//        if (iValue1 == iValue2) {
//            return true;
//        }else {
//            return false;
//        }
//    }
//
////--检测三连张
//    boolean CheckABCPai(int iValue1,int iValue2,int iValue3){
//        if ((iValue1 == iValue2-1)&&(iValue2 == iValue3-1)) {
//            return true;
//        } else {
//            return false;
//        }
//    }
////--检测三重张
//    boolean CheckAAAPai(int iValue1,int iValue2,int iValue3){
//        boolean p12 = CheckAAPai(iValue1,iValue2);
//        boolean p23 = CheckAAPai(iValue2,iValue3);
//        if (p12 && p23) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
////-- 将用户的牌分成 万，条，饼，风，中发白五组并排序返回
////    public static final int MJ_WAN = 1;
////    public static final int MJ_TIAO = 2;
////    public static final int MJ_BING = 3;
////    public static final int MJ_FENG = 4;
////    public static final int MJ_ZFB = 5;
////
////    public static final int Pai_My = 1;
////    public static final int Pai_Chi = 2;
////    public static final int Pai_Peng = 3;
////    public static final int Pai_Gang = 4;
////    public static final int Pai_Ting = 5;
//
//    public Map<String, Map<Integer, List<Integer>>> sortByType(List<Integer> userPai) {
//        Map<String, Map<Integer, List<Integer>>> sort_pai = new HashMap<>();
//
//        // Initialize sort_pai with empty lists
//        sort_pai.put("My", initializePaiMap());
//        sort_pai.put("Chi", initializePaiMap());
//        sort_pai.put("Peng", initializePaiMap());
//        sort_pai.put("Gang", initializePaiMap());
//        sort_pai.put("Ting", initializePaiMap());
//
//        // Fill sort_pai based on userPai
//        for (Integer pai : userPai) {
//            int singlePaiGroup = checkSinglePaiGroup(pai);
//            int paiType = checkSinglePaiType(pai);
//            switch (singlePaiGroup) {
//                case Pai_My:
//                    sort_pai.get("My").get(paiType).add(pai);
//                    break;
//                case Pai_Chi:
//                    sort_pai.get("Chi").get(paiType).add(pai);
//                    break;
//                case Pai_Peng:
//                    sort_pai.get("Peng").get(paiType).add(pai);
//                    break;
//                case Pai_Gang:
//                    sort_pai.get("Gang").get(paiType).add(pai);
//                    break;
//                case Pai_Ting:
//                    sort_pai.get("Ting").get(paiType).add(pai);
//                    break;
//                default:
//                    // Handle default case if necessary
//                    break;
//            }
//        }
//
//        // Sort each list within sort_pai
//        for (Map<Integer, List<Integer>> paiMap : sort_pai.values()) {
//            for (List<Integer> paiList : paiMap.values()) {
//                Collections.sort(paiList);
//            }
//        }
//
//        return sort_pai;
//    }
//
//    private Map<Integer, List<Integer>> initializePaiMap() {
//        Map<Integer, List<Integer>> paiMap = new HashMap<>();
//        paiMap.put(MJ_WAN, new ArrayList<>());
//        paiMap.put(MJ_TIAO, new ArrayList<>());
//        paiMap.put(MJ_BING, new ArrayList<>());
//        paiMap.put(MJ_FENG, new ArrayList<>());
//        paiMap.put(MJ_ZFB, new ArrayList<>());
//        return paiMap;
//    }
//
//    private int checkSinglePaiGroup(int pai) {
//        // Implement your logic to determine the group of pai
//        // This is just a placeholder
//        return Pai_My; // Placeholder return value
//    }
//
//    private int checkSinglePaiType(int pai) {
//        // Implement your logic to determine the type of pai
//        // This is just a placeholder
//        return MJ_WAN; // Placeholder return value
//    }
//
//
//
//
//
////        --复制一副牌并返回
////        --提示：由于lua传递table时是传递引用，所以在函数内部修改table会影响到外部的table，因此用此函数拷贝一份table
//    public List<Integer> copyPai(List<Integer> userPai) {
//        List<Integer> t_pai = new ArrayList<>();
//        for (int i = 0; i < userPai.size(); i++) {
//            t_pai.add(userPai.get(i));
//        }
//
//        return t_pai;
//    }
//
////    public void main(String[] args) {
////        // Example usage
////        List<Integer> userPai = new ArrayList<>();
////        userPai.add(1);
////        userPai.add(2);
////        userPai.add(3);
////
////        List<Integer> copiedPai = copyPai(userPai);
////        System.out.println("Copied Pai: " + copiedPai);
////    }
//
////        --测试胡AA牌（将牌）
//    public static boolean validAA(int[] pai, int i, int n) {
//        if (i + 1 <= n && pai[i] == pai[i + 1]) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
////        --测试胡AAA牌（刻子）
//    public static boolean validAAA(int[] pai, int i, int n) {
//        if (i + 2 <= n && pai[i] == pai[i + 1] && pai[i] == pai[i + 2]) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//
////        --测试胡ABC牌（顺子）
////        local function ValidABC(pai,i,n)
////        -- 顺子要避开 1 222 3  这种可能组成 123 22 的情况
////        -- 所以拆成两个列表  (1 2 3)|(22)
////        -- 然后判断 ValidHu(22)
//    public boolean validABC(int[] pai, int i, int n) {
//        // 只有两张牌，必定没顺
//        if (n - i < 2) {
//            return false;
//        }
//
//        // 复制牌组
//        int[] t_pai = Arrays.copyOf(pai, pai.length);
//
//        boolean found_B = false;
//        boolean found_C = false;
//
//        // 查找符合顺子条件的牌
//        for (int j = i + 1; j < t_pai.length; j++) {
//            if (!found_B && t_pai[j] == (t_pai[i] + 1)) {
//                found_B = true;
//                // 交换两张牌的位置
//                int temp = t_pai[i + 1];
//                t_pai[i + 1] = t_pai[j];
//                t_pai[j] = temp;
//            }
//        }
//
//        for (int k = i + 2; k < pai.length; k++) {
//            if (!found_C && t_pai[k] == (t_pai[i] + 2)) {
//                found_C = true;
//                // 交换两张牌的位置
//                int temp = t_pai[i + 2];
//                t_pai[i + 2] = t_pai[k];
//                t_pai[k] = temp;
//            }
//        }
//
//        // 如果能找到顺，判断剩下的牌是否能胡
//        if (found_B && found_C) {
//            // 创建待判断列表
//            List<Integer> new_list = new ArrayList<>();
//            for (int j = i + 3; j < pai.length; j++) {
//                new_list.add(t_pai[j]);
//            }
//            // 对新建数组进行排序
//            new_list.sort(null); // 默认升序排序
//
//            return true;
//        } else {
//            return false;
//        }
//    }
//
////        --测试胡n张牌
////        --IN：用户牌，检测起点，检测总数
////        --OUT：是否胡牌，将牌数
//// 定义麻将类型
////private final int MJ_FENG = 1;
////    private final int MJ_ZFB = 2;
//
//
//    class ValidHuBean{
//        private boolean aBoolean;
//        private int rei;
//    }
//    // 主函数，验证胡牌的方法
//    private ValidHuBean validHu(int[] pai, int i, int n) {
//        ValidHuBean result = new ValidHuBean();
//        // 空牌组直接胡
//        if (n == 0) {
//            result.aBoolean = true;
//            result.rei = 0;
//            return result;
//        }
//
//        // 存在两个将牌或少于两个牌，不可能胡
//        if (n % 3 == 1) {
//            result.aBoolean = false;
//            result.rei = 0;
//            return result;
//        }
//
//        // 检测到末尾，胡
//        if (i > n) {
//            result.aBoolean = true;
//            result.rei = 0;
//            return result;
//        }
//
//        // 测试 AAA
//        if (validAAA(pai, i, n)) {
//            ValidHuBean t;
//            int k = 0;
//            t = validHu(pai, i + 3, n);
//            if (t.aBoolean) {
//                result.aBoolean = true;
//                result.rei = k;
//                return result;
//            }
//        }
//
//        // 测试 AA
//        if (validAA(pai, i, n)) {
//            ValidHuBean t;
//            t = validHu(pai, i + 2, n);
//            if (t.aBoolean && t.rei == 0) {
//                t.aBoolean = true;
//                t.rei = 1;
//                return result;
//            }
//        }
//
//        // 对万，条，饼测试 ABC
//        int paiType = checkSinglePaiType(pai[0]);
//        if (paiType != MJ_FENG && paiType != MJ_ZFB) {
//            int[] new_pai = new int[n - i];
//            boolean t ;
//            t = validABC(pai, i, n);
//            if (t) {
//                ValidHuBean t2;
//                int k = 0;
//                t2 = validHu(new_pai, 1, new_pai.length);
//                if (t2.aBoolean) {
//                    result.aBoolean = true;
//                    result.rei = k;
//                    return result;
//                }
//            }
//        }
//
//        /**
//         *
//         *  // 对万，条，饼测试 ABC
//         *         int paiType = checkSinglePaiType(pai[0]);
//         *         if (paiType != MJ_FENG && paiType != MJ_ZFB) {
//         *             int[] new_pai = new int[n - i];
//         *             boolean t;
//         *             t = validABC(pai, i, n, new_pai);
//         *             if (t) {
//         *                 boolean t2;
//         *                 int k;
//         *                 t2 = validHu(new_pai, 0, new_pai.length);
//         *                 if (t2) {
//         *                     return true;
//         *                 }
//         *             }
//         *         }
//         */
//
//        result.aBoolean = false;
//        result.rei = 0;
//        return result;
//    }
//
//    public static List<List<Integer>> checkChiPai(List<Integer> userPai, int prePai) {
//        // 模拟 SortByType(userPai) 的过程
//        List<Integer> sortedUserPai = new ArrayList<>(userPai);
//        Collections.sort(sortedUserPai);
//
//        List<List<Integer>> chiList = new ArrayList<>();
//
//        // 检测吃牌逻辑
//        for (int i = 0; i < sortedUserPai.size() - 1; i++) {
//            // 上家牌在顺子最左
//            if (sortedUserPai.get(i) == prePai + 1 && sortedUserPai.get(i + 1) == prePai + 2) {
//                List<Integer> shunzi = Arrays.asList(sortedUserPai.get(i), sortedUserPai.get(i + 1));
//                chiList.add(shunzi);
//            }
//            // 上家牌在顺子中间
//            if (sortedUserPai.get(i) == prePai - 1 && sortedUserPai.get(i + 1) == prePai + 1) {
//                List<Integer> shunzi = Arrays.asList(sortedUserPai.get(i), sortedUserPai.get(i + 1));
//                chiList.add(shunzi);
//            }
//            // 上家牌在顺子最右
//            if (sortedUserPai.get(i) == prePai - 2 && sortedUserPai.get(i + 1) == prePai - 1) {
//                List<Integer> shunzi = Arrays.asList(sortedUserPai.get(i), sortedUserPai.get(i + 1));
//                chiList.add(shunzi);
//            }
//            // 下面这块是用在出现AB**BC时吃B的情况
//            if (sortedUserPai.get(i) == prePai - 1 && sortedUserPai.get(i + 1) == prePai) {
//                for (int k = i + 1; k < sortedUserPai.size(); k++) {
//                    if (sortedUserPai.get(k) == prePai + 1) {
//                        List<Integer> shunzi = Arrays.asList(sortedUserPai.get(i), sortedUserPai.get(k));
//                        chiList.add(shunzi);
//                    }
//                }
//            }
//        }
//
//        // 转换至userPai的绝对位置
//        for (List<Integer> shunzi : chiList) {
//            for (int j = 0; j < 2; j++) {
//                for (int k = 0; k < userPai.size(); k++) {
//                    if (shunzi.get(j).equals(userPai.get(k))) {
//                        shunzi.set(j, k + 1); // 转换为序号（从1开始）
//                    }
//                }
//            }
//        }
//
//        return chiList;
//    }
//
//    public static List<List<Integer>> checkPengPai(List<Integer> userPai, int prePai) {
//        // 模拟 SortByType(userPai) 的过程
//        List<Integer> sortedUserPai = new ArrayList<>(userPai);
//        Collections.sort(sortedUserPai);
//
//        List<List<Integer>> pengList = new ArrayList<>();
//
//        // 碰牌逻辑
//        for (int i = 0; i < sortedUserPai.size() - 1; i++) {
//            if (sortedUserPai.get(i).equals(prePai) && sortedUserPai.get(i + 1).equals(prePai)) {
//                List<Integer> peng = Arrays.asList(sortedUserPai.get(i), sortedUserPai.get(i + 1));
//                pengList.add(peng);
//            }
//        }
//
//        // 转换至 userPai 的绝对位置
//        for (List<Integer> peng : pengList) {
//            for (int j = 0; j < 2; j++) {
//                for (int k = 0; k < userPai.size(); k++) {
//                    if (peng.get(j).equals(userPai.get(k))) {
//                        peng.set(j, k + 1); // 转换为序号（从1开始）
//                    }
//                }
//            }
//        }
//
//        return pengList;
//    }
//
////
////    // 定义牌类型常量
////    private static final int PAI_TYPE_MY = 0; // 假设这里使用常量表示牌的类型，My 代表自己的牌
////    private static final int PAI_TYPE_PENG = 1; // Peng 代表碰的牌
//
//    // 方法：检测杠牌
//    public ArrayList<ArrayList<Integer>> checkGangPai(ArrayList<Integer> userPai, int prePai, boolean isNotZiMo) {
//        // 杠牌结果集合
//        ArrayList<ArrayList<Integer>> attributeGang = new ArrayList<>();
//
//        // 对用户牌进行排序（假设 userPai 已经是按照牌的大小排好序的）
//        Collections.sort(userPai);
//
//        // 明杠
//        if (isNotZiMo && userPai.contains(prePai)) {
//            for (int i = 0; i < userPai.size() - 2; i++) {
//                if (userPai.get(i) == prePai && userPai.get(i + 1) == prePai && userPai.get(i + 2) == prePai) {
//                    ArrayList<Integer> gang = new ArrayList<>();
//                    gang.add(userPai.get(i));
//                    gang.add(userPai.get(i + 1));
//                    gang.add(userPai.get(i + 2));
//                    attributeGang.add(gang);
//                }
//            }
//        }
//
//        // 暗杠(自摸)
//        if (!isNotZiMo) {
//            ArrayList<Integer> allPai = new ArrayList<>(userPai);
//            allPai.add(prePai);
//            Collections.sort(allPai);
//            for (int i = 0; i < allPai.size() - 3; i++) {
//                if (allPai.get(i).equals(allPai.get(i + 1)) && allPai.get(i + 1).equals(allPai.get(i + 2)) && allPai.get(i + 2).equals(allPai.get(i + 3))) {
//                    ArrayList<Integer> gang = new ArrayList<>();
//                    gang.add(allPai.get(i));
//                    gang.add(allPai.get(i + 1));
//                    gang.add(allPai.get(i + 2));
//                    attributeGang.add(gang);
//                }
//            }
//        }
//
//        // 加杠
//        if (!isNotZiMo) {
//            for (int i = 0; i < userPai.size() - 2; i += 3) {
//                if (userPai.get(i).equals(prePai) && userPai.get(i + 1).equals(prePai) && userPai.get(i + 2).equals(prePai)) {
//                    ArrayList<Integer> gang = new ArrayList<>();
//                    gang.add(userPai.get(i));
//                    gang.add(userPai.get(i + 1));
//                    gang.add(userPai.get(i + 2));
//                    attributeGang.add(gang);
//                }
//            }
//        }
//
//        // 将结果中的牌转换为绝对位置（序号）
//        for (ArrayList<Integer> gang : attributeGang) {
//            for (int i = 0; i < userPai.size(); i++) {
//                if (gang.get(0).equals(userPai.get(i)) && gang.get(1).equals(userPai.get(i + 1)) && gang.get(2).equals(userPai.get(i + 2))) {
//                    gang.set(0, i);
//                    gang.set(1, i + 1);
//                    gang.set(2, i + 2);
//                }
//            }
//        }
//
//        return attributeGang;
//    }
//
//    public static List<int[]> checkTingPai(int[] userPai) {
//        List<int[]> tingList = new ArrayList<>();
//        boolean foundTing = false;
//
//        // 分组
//        Map<String, List<Integer>> sortPai = sortByType(userPai);
//
//        // 检查听牌
//        boolean[] huInfo = new boolean[5];
//        int[] jiangInfo = new int[5];
//
//        // 统计各分组胡牌及将牌情况
//        for (int i = 0; i < sortPai.get("My").size(); i++) {
//            int[] result = validHu(sortPai.get("My").get(i), 1, sortPai.get("My").get(i).size());
//            huInfo[i] = result[0] == 1;
//            jiangInfo[i] = result[1];
//        }
//
//        // 统计胡，将总数
//        int sumHu = 0;
//        int sumJiang = 0;
//        for (int i = 0; i < 5; i++) {
//            if (huInfo[i]) {
//                sumHu++;
//            }
//            sumJiang += jiangInfo[i];
//        }
//
//        int[][] collection = {
//                {11, 12, 13, 14, 15, 16, 17, 18, 19},
//                {21, 22, 23, 24, 25, 26, 27, 28, 29},
//                {31, 32, 33, 34, 35, 36, 37, 38, 39},
//                {41, 43, 45, 47},
//                {51, 53, 55}
//        };
//
//        // 五组都“胡”，没法听
//        if (sumHu == 5) {
//            return tingList;
//        }
//
//        // 检查是否听 九莲宝灯
//        if (sumHu >= 3 && !foundTing) {
//            Map<Integer, Integer> numCount = new HashMap<>();
//            numCount.put(1, 0);
//            numCount.put(2, 0);
//            numCount.put(3, 0);
//
//            for (int pai : userPai) {
//                int paiType = checkSinglePaiType(pai);
//                if (paiType <= 3) {
//                    numCount.put(paiType, numCount.get(paiType) + 1);
//                }
//            }
//
//            int paiType = 0;
//            for (int i = 1; i <= 3; i++) {
//                if (numCount.get(i) >= 13) {
//                    paiType = i;
//                }
//            }
//
//            if (paiType != 0) {
//                int[] count = new int[9];
//                for (int pai : userPai) {
//                    int mType = checkSinglePaiType(pai);
//                    int mNum = checkSinglePaiNum(pai);
//                    if (mType == paiType) {
//                        count[mNum - 1]++;
//                    }
//                }
//
//                int zeroCount = 0;
//                int zeroNum = 0;
//                int size2Count = 0;
//                int size2Num1 = 0;
//                int size2Num2 = 0;
//                for (int i = 0; i < 9; i++) {
//                    if (count[i] == 0) {
//                        zeroCount++;
//                        zeroNum = i + 1;
//                    }
//                    if (i != 0 && i != 8 && count[i] >= 2) {
//                        size2Count++;
//                        if (size2Num1 == 0) {
//                            size2Num1 = i + 1;
//                        } else {
//                            size2Num2 = i + 1;
//                        }
//                    }
//                }
//
//                int target = 0;
//                int need = 0;
//                if (numCount.get(paiType) == 13) {
//                    for (int pai : userPai) {
//                        if (checkSinglePaiType(pai) != paiType) {
//                            target = pai;
//                        }
//                    }
//                }
//
//                if (zeroCount <= 1 && size2Count <= 1 && numCount.get(paiType) == 13) {
//                    if (zeroCount == 1 && count[0] >= 3 && count[8] >= 3) {
//                        foundTing = true;
//                        need = zeroNum + 10 * paiType;
//                    }
//                    if (zeroNum == 0 && count[0] == 2 && count[8] >= 3) {
//                        foundTing = true;
//                        need = 1 + 10 * paiType;
//                    }
//                    if (zeroNum == 0 && count[0] >= 3 && count[8] == 2) {
//                        foundTing = true;
//                        need = 9 * 10 * paiType;
//                    }
//
//                    if (foundTing) {
//                        int[] tList = {target, need};
//                        tingList.add(tList);
//                    }
//
//                    if (zeroNum == 0 && count[0] >= 3 && count[8] >= 3) {
//                        foundTing = true;
//                        if (count[0] != 4) {
//                            need = 1 + 10 * paiType;
//                            int[] tList = {target, need};
//                            tingList.add(tList);
//                        }
//                        if (count[8] != 4) {
//                            need = 9 + 10 * paiType;
//                            int[] tList = {target, need};
//                            tingList.add(tList);
//                        }
//                    }
//                }
//
//                if (numCount.get(paiType) == 14) {
//                    int midCount = 0;
//                    for (int i = 1; i <= 7; i++) {
//                        midCount += count[i];
//                    }
//                    if (zeroCount == 0 && midCount == 8 && (count[0] + count[8] == 6) && (count[0] == 2 || count[0] == 4)) {
//                        foundTing = true;
//                        if (count[0] == 2) {
//                            target = 9 + 10 * paiType;
//                            need = 1 + 10 * paiType;
//                        } else {
//                            target = 1 + 10 * paiType;
//                            need = 9 + 10 * paiType;
//                        }
//                        int[] tList = {target, need};
//                        tingList.add(tList);
//                    }
//                    if (zeroCount == 0 && midCount == 9 && (count[0] + count[8] == 5) && (count[0] == 2 || count[0] == 3)) {
//                        foundTing = true;
//                        if (count[0] == 2) {
//                            need = 1 + 10 * paiType;
//                        } else {
//                            need = 9 + 10 * paiType;
//                        }
//                        if (size2Count == 1) {
//                            target = size2Num1 + 10 * paiType;
//                            int[] tList = {target, need};
//                            tingList.add(tList);
//                        } else if (size2Count == 2) {
//                            int target1 = size2Num1 + 10 * paiType;
//                            int target2 = size2Num2 + 10 * paiType;
//                            int[] tList1 = {target1, need};
//                            int[] tList2 = {target2, need};
//                            tingList.add(tList1);
//                            tingList.add(tList2);
//                        }
//                    }
//                    if (zeroCount == 1 && midCount == 7 && (count[0] + count[8] == 7) && (count[0] == 3 || count[0] == 4)) {
//                        foundTing = true;
//                        if (count[0] == 4) {
//                            target = 1 + 10 * paiType;
//                        } else {
//                            target = 9 + 10 * paiType;
//                        }
//                        need = zeroNum + 10 * paiType;
//                        int target2 = size2Num1 + 10 * paiType;
//                        int[] tList1 = {target, need};
//                        int[] tList2 = {target2, need};
//                        tingList.add(tList1);
//                        tingList.add(tList2);
//                    }
//                    if (zeroCount == 1 && midCount == 8 && (count[0] == 3 && count[8] == 3)) {
//                        foundTing = true;
//                        need = zeroNum + 10 * paiType;
//                        if (size2Count == 1) {
//                            target = size2Num1 + 10 * paiType;
//                            int[] tList = {target, need};
//                            tingList.add(tList);
//                        } else if (size2Count == 2) {
//                            int target1 = size2Num1 + 10 * paiType;
//                            int target2 = size2Num2 + 10 * paiType;
//                            int[] tList1 = {target1, need};
//                            int[] tList2 = {target2, need};
//                            tingList.add(tList1);
//                            tingList.add(tList2);
//                        }
//                    }
//                }
//            }
//        }
//
//        // 四组“胡”且将 == 0 或 1
//        if (sumHu == 4 && sumJiang < 2 && !foundTing) {
//            int jiangNeed =
//
//                    1 - sumJiang;
//            int target = 0;
//            for (int i = 0; i < huInfo.length; i++) {
//                if (!huInfo[i]) {
//                    target = i;
//                }
//            }
//
//            for (int i = 0; i < sortPai.get("My").get(target).size(); i++) {
//                int tPai = sortPai.get("My").get(target).get(i);
//                for (int j = 0; j < collection[target].length; j++) {
//                    sortPai.get("My").get(target).set(i, collection[target][j]);
//                    int[] result = validHu(sortPai.get("My").get(target), 1, sortPai.get("My").get(target).size());
//                    if (result[0] == 1 && result[1] == jiangNeed) {
//                        foundTing = true;
//                        int[] tList = {tPai, collection[target][j]};
//                        tingList.add(tList);
//                    }
//                }
//                sortPai.get("My").get(target).set(i, tPai);
//            }
//        }
//
//        // 三组“胡” 且将 == 0 或 1
//        if (sumHu == 3 && sumJiang < 2 && !foundTing) {
//            int target1 = 0;
//            int target2 = 0;
//            for (int i = 0; i < huInfo.length; i++) {
//                if (!huInfo[i]) {
//                    if (target1 == 0) {
//                        target1 = i;
//                    } else {
//                        target2 = i;
//                    }
//                }
//            }
//
//            int jiangNeed = 1 - sumJiang;
//            for (int i = 0; i < sortPai.get("My").get(target1).size(); i++) {
//                int tPai = sortPai.get("My").get(target1).get(i);
//                sortPai.get("My").get(target1).remove(i);
//                int[] result1 = validHu(sortPai.get("My").get(target1), 1, sortPai.get("My").get(target1).size());
//                if (result1[0] == 1) {
//                    for (int k = 0; k < collection[target2].length; k++) {
//                        List<Integer> tPai2 = new ArrayList<>(sortPai.get("My").get(target2));
//                        tPai2.add(collection[target2][k]);
//                        Collections.sort(tPai2);
//                        int[] result2 = validHu(tPai2, 1, tPai2.size());
//                        if (result2[0] == 1 && result2[1] + result1[1] == jiangNeed) {
//                            foundTing = true;
//                            int[] tList = {tPai, collection[target2][k]};
//                            tingList.add(tList);
//                        }
//                    }
//                }
//                sortPai.get("My").get(target1).add(i, tPai);
//            }
//
//            for (int i = 0; i < sortPai.get("My").get(target2).size(); i++) {
//                int tPai = sortPai.get("My").get(target2).get(i);
//                sortPai.get("My").get(target2).remove(i);
//                int[] result1 = validHu(sortPai.get("My").get(target2), 1, sortPai.get("My").get(target2).size());
//                if (result1[0] == 1) {
//                    for (int k = 0; k < collection[target1].length; k++) {
//                        List<Integer> tPai2 = new ArrayList<>(sortPai.get("My").get(target1));
//                        tPai2.add(collection[target1][k]);
//                        Collections.sort(tPai2);
//                        int[] result2 = validHu(tPai2, 1, tPai2.size());
//                        if (result2[0] == 1 && result2[1] + result1[1] == jiangNeed) {
//                            foundTing = true;
//                            int[] tList = {tPai, collection[target1][k]};
//                            tingList.add(tList);
//                        }
//                    }
//                }
//                sortPai.get("My").get(target2).add(i, tPai);
//            }
//        }
//
//        // 检查是否听 十三幺
//        if (sumHu < 3 && !foundTing) {
//            int[] ssyList = {11, 19, 21, 29, 31, 39, 41, 43, 45, 47, 51, 53, 55};
//            Map<Integer, Integer> ssyCount = new HashMap<>();
//            for (int ssy : ssyList) {
//                ssyCount.put(ssy, 0);
//            }
//
//            for (int pai : userPai) {
//                for (int ssy : ssyList) {
//                    if (pai == ssy) {
//                        ssyCount.put(ssy, ssyCount.get(ssy) + 1);
//                    }
//                }
//            }
//
//            int sum = 0;
//            int zero = 0;
//            for (int ssy : ssyList) {
//                if (ssyCount.get(ssy) == 0) {
//                    zero++;
//                }
//                sum += ssyCount.get(ssy);
//            }
//
//            if ((zero == 0 || zero == 1) && sum == 13) {
//                int target = 0;
//                for (int pai : userPai) {
//                    boolean found = false;
//                    for (int ssy : ssyList) {
//                        if (pai == ssy) {
//                            found = true;
//                        }
//                    }
//                    if (!found) {
//                        target = pai;
//                    }
//                }
//                foundTing = true;
//                int[] tList = {target, ssyList[0]};
//                tingList.add(tList);
//            }
//            if (zero == 1 && sum == 14) {
//                int paiNeed = 0;
//                for (int ssy : ssyList) {
//                    if (ssyCount.get(ssy) == 0) {
//                        paiNeed = ssy;
//                    }
//                }
//                for (int ssy : ssyList) {
//                    if (ssyCount.get(ssy) > 1) {
//                        foundTing = true;
//                        int[] tList = {ssy, paiNeed};
//                        tingList.add(tList);
//                    }
//                }
//            }
//        }
//
//        // 过滤掉相同的组
//        List<int[]> uniqueList = new ArrayList<>();
//        for (int[] ting : tingList) {
//            boolean foundSame = false;
//            for (int[] unique : uniqueList) {
//                if (ting[0] == unique[0] && ting[1] == unique[1]) {
//                    foundSame = true;
//                    break;
//                }
//            }
//            if (!foundSame) {
//                uniqueList.add(ting);
//            }
//        }
//
//        return uniqueList;
//    }
//}
