package kw.mj;
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class X {
    public  int checkSinglePaiMingAn(int pai) {
        return (pai % 10000) / 1000;
    }

    public  int checkSinglePaiGroup(int pai) {
        return (pai % 1000) / 100;
    }

    public  int checkSinglePaiType(int pai) {
        return (pai % 100) / 10;
    }

    public  int checkSinglePaiNum(int pai) {
        return pai % 10;
    }

    public  int getPaiTypeNum(int pai) {
        return pai % 100;
    }

    public  boolean checkAAPai(int value1, int value2) {
        return value1 == value2;
    }

    public  boolean checkABCPai(int value1, int value2, int value3) {
        return (value1 == value2 - 1) && (value2 == value3 - 1);
    }

    public  boolean checkAAAPai(int value1, int value2, int value3) {
        return (value1 == value2) && (value2 == value3);
    }
    public  final int MJ_WAN = 1;
    public  final int MJ_TIAO = 2;
    public  final int MJ_BING = 3;
    public  final int MJ_FENG = 4;
    public  final int MJ_ZFB = 5;

    public  final int PAI_MY = 0;
    public  final int PAI_CHI = 1;
    public  final int PAI_PENG = 2;
    public  final int PAI_GANG = 3;
    public  final int PAI_TING = 4;

    public  Map<String, List<List<Integer>>> sortByType(int[] userPai) {
        Map<String, List<List<Integer>>> sortPai = new HashMap<>();
        sortPai.put("My", new ArrayList<>());
        sortPai.put("Chi", new ArrayList<>());
        sortPai.put("Peng", new ArrayList<>());
        sortPai.put("Gang", new ArrayList<>());
        sortPai.put("Ting", new ArrayList<>());

        for (int i = 0; i < 5; i++) {
            sortPai.get("My").add(new ArrayList<>());
            sortPai.get("Chi").add(new ArrayList<>());
            sortPai.get("Peng").add(new ArrayList<>());
            sortPai.get("Gang").add(new ArrayList<>());
            sortPai.get("Ting").add(new ArrayList<>());
        }

        for (int pai : userPai) {
            int group = checkSinglePaiGroup(pai);
            int type = checkSinglePaiType(pai);
            if (group == PAI_MY) {
                sortPai.get("My").get(type).add(pai);
            } else if (group == PAI_CHI) {
                sortPai.get("Chi").get(type).add(pai);
            } else if (group == PAI_PENG) {
                sortPai.get("Peng").get(type).add(pai);
            } else if (group == PAI_GANG) {
                sortPai.get("Gang").get(type).add(pai);
            } else if (group == PAI_TING) {
                sortPai.get("Ting").get(type).add(pai);
            }
        }

        for (int i = 0; i < 5; i++) {
            sortPai.get("My").get(i).sort(Integer::compareTo);
            sortPai.get("Chi").get(i).sort(Integer::compareTo);
            sortPai.get("Peng").get(i).sort(Integer::compareTo);
            sortPai.get("Gang").get(i).sort(Integer::compareTo);
            sortPai.get("Ting").get(i).sort(Integer::compareTo);
        }

        return sortPai;
    }
    public List<Integer> copyPai(List<Integer> userPai) {
        return new ArrayList<>(userPai);
    }
    public boolean checkKe(List<Integer> userPai, int i, int n) {
        if (i > n) return true;
        if (n - i < 2) return false;
        return checkAAAPai(userPai.get(i), userPai.get(i + 1), userPai.get(i + 2)) &&
                checkKe(userPai, i + 3, n);
    }

    public boolean checkShun(List<Integer> userPai, int i, int n) {
        if (i > n) return true;
        if (n - i < 2) return false;
        return checkABCPai(userPai.get(i), userPai.get(i + 1), userPai.get(i + 2)) && checkShun(userPai, i + 3, n);
    }
    
    public Result validHu(List<Integer> pai, int i, int n) {
        if (n == 0) return new Result(true, 0);
        if (n % 3 == 1) return new Result(false, 0);
        if (i > n) return new Result(true, 0);
    
        if (validAAA(pai, i, n)) {
            Result t = validHu(pai, i + 3, n);
            if (t.canHu) return t;
        }
    
        if (validAA(pai, i, n)) {
            Result t = validHu(pai, i + 2, n);
            if (t.canHu) return t;
        }
    
        if (checkSinglePaiType(pai.get(0)) != MJ_FENG && checkSinglePaiType(pai.get(0)) != MJ_ZFB) {
            List<Integer> newPai = copyPai(pai);
            boolean t = validABC(newPai, i, n);
            if (t) {
                Result t2 = validHu(newPai, 1, newPai.size());
                if (t2.canHu) return t2;
            }
        }
    
        return new Result(false, 0);
    }
//
//    private  boolean validAA(List<Integer> pai, int i, int n) {
//        return i + 1 <= n && pai.get(i).equals(pai.get(i + 1));
//    }
//
//    private  boolean validAAA(List<Integer> pai, int i, int n) {
//        return i + 2 <= n && pai.get(i).equals(pai.get(i + 1)) && pai.get(i).equals(pai.get(i + 2));
//    }

//    private  boolean validABC(List<Integer> pai, int i, int n) {
//        if (n - i < 2) return false;
//
//        List<Integer> tPai = copyPai(pai);
//        boolean foundB = false;
//        boolean foundC = false;
//        for (int j = i + 1; j < tPai.size(); j++) {
//            if (!foundB && tPai.get(j) == tPai.get(i) + 1) {
//                foundB = true;
//                int t = tPai.get(i + 1);
//                tPai.set(i + 1, tPai.get(j));
//                tPai.set(j, t);
//            }
//        }
//
//        for (int k = i + 2; k < tPai.size(); k++) {
//            if (!foundC && tPai.get(k) == tPai.get(i) + 2) {
//                foundC = true;
//                int t = tPai.get(i + 2);
//                tPai.set(i + 2, tPai.get(k));
//                tPai.set(k, t);
//            }
//        }
//
//        if (foundB && foundC) {
//            List<Integer> newList = new ArrayList<>();
//            for (int j = i + 3; j < tPai.size(); j++) {
//                newList.add(tPai.get(j));
//            }
//            newList.sort(Integer::compareTo);
//            return true;
//        } else {
//            return false;
//        }
//    }
    private  boolean validAA(List<Integer> pai, int i, int n) {
        if (i + 1 <= n && pai.get(i).equals(pai.get(i + 1))) {
            return true;
        } else {
            return false;
        }
    }

    private  boolean validAAA(List<Integer> pai, int i, int n) {
        if (i + 2 <= n && pai.get(i).equals(pai.get(i + 1)) && pai.get(i).equals(pai.get(i + 2))) {
            return true;
        } else {
            return false;
        }
    }

    private  boolean validABC(List<Integer> pai, int i, int n) {
        if (n - i < 2) return false;

        List<Integer> tPai = copyPai(pai);
        boolean foundB = false;
        boolean foundC = false;
        for (int j = i + 1; j < tPai.size(); j++) {
            if (!foundB && tPai.get(j) == tPai.get(i) + 1) {
                foundB = true;
                int t = tPai.get(i + 1);
                tPai.set(i + 1, tPai.get(j));
                tPai.set(j, t);
            }
        }

        for (int k = i + 2; k < tPai.size(); k++) {
            if (!foundC && tPai.get(k) == tPai.get(i) + 2) {
                foundC = true;
                int t = tPai.get(i + 2);
                tPai.set(i + 2, tPai.get(k));
                tPai.set(k, t);
            }
        }

        if (foundB && foundC) {
            List<Integer> newList = new ArrayList<>();
            for (int j = i + 3; j < tPai.size(); j++) {
                newList.add(tPai.get(j));
            }
            newList.sort(Integer::compareTo);
            return true;
        } else {
            return false;
        }
    }

    class Result {
        public boolean canHu;
        public int jiangCount;

        public Result(boolean canHu, int jiangCount) {
            this.canHu = canHu;
            this.jiangCount = jiangCount;
        }
    }
    public  List<int[]> checkTingPai(int[] userPai) {
        List<int[]> tingList = new ArrayList<>();
        boolean foundTing = false;

        // 分组
        Map<String, List<List<Integer>>> sortPai = sortByType(userPai);

        // 检查听牌
        boolean[] huInfo = new boolean[5];
        int[] jiangInfo = new int[5];

        // 统计各分组胡牌及将牌情况
        for (int i = 0; i < sortPai.get("My").size(); i++) {
            Result result = validHu(sortPai.get("My").get(i), 1, sortPai.get("My").get(i).size());
            huInfo[i] = result.canHu;
            jiangInfo[i] = result.jiangCount;
        }

        // 统计胡，将总数
        int sumHu = 0;
        int sumJiang = 0;
        for (int i = 0; i < 5; i++) {
            if (huInfo[i]) {
                sumHu++;
            }
            sumJiang += jiangInfo[i];
        }

        int[][] collection = {
                {11, 12, 13, 14, 15, 16, 17, 18, 19},
                {21, 22, 23, 24, 25, 26, 27, 28, 29},
                {31, 32, 33, 34, 35, 36, 37, 38, 39},
                {41, 43, 45, 47},
                {51, 53, 55}
        };

        // 五组都“胡”，没法听
        if (sumHu == 5) {
            return tingList;
        }

        // 检查是否听 九莲宝灯
        if (sumHu >= 3 && !foundTing) {
            Map<Integer, Integer> numCount = new HashMap<>();
            numCount.put(1, 0);
            numCount.put(2, 0);
            numCount.put(3, 0);

            for (int pai : userPai) {
                int paiType = checkSinglePaiType(pai);
                if (paiType <= 3) {
                    numCount.put(paiType, numCount.get(paiType) + 1);
                }
            }

            int paiType = 0;
            for (int i = 1; i <= 3; i++) {
                if (numCount.get(i) >= 13) {
                    paiType = i;
                }
            }

            if (paiType != 0) {
                int[] count = new int[9];
                for (int pai : userPai) {
                    int mType = checkSinglePaiType(pai);
                    int mNum = checkSinglePaiNum(pai);
                    if (mType == paiType) {
                        count[mNum - 1]++;
                    }
                }

                int zeroCount = 0;
                int zeroNum = 0;
                int size2Count = 0;
                int size2Num1 = 0;
                int size2Num2 = 0;
                for (int i = 0; i < 9; i++) {
                    if (count[i] == 0) {
                        zeroCount++;
                        zeroNum = i + 1;
                    }
                    if (i != 0 && i != 8 && count[i] >= 2) {
                        size2Count++;
                        if (size2Num1 == 0) {
                            size2Num1 = i + 1;
                        } else {
                            size2Num2 = i + 1;
                        }
                    }
                }

                int target = 0;
                int need = 0;
                if (numCount.get(paiType) == 13) {
                    for (int pai : userPai) {
                        if (checkSinglePaiType(pai) != paiType) {
                            target = pai;
                        }
                    }
                }

                if (zeroCount <= 1 && size2Count <= 1 && numCount.get(paiType) == 13) {
                    if (zeroCount == 1 && count[0] >= 3 && count[8] >= 3) {
                        foundTing = true;
                        need = zeroNum + 10 * paiType;
                    }
                    if (zeroNum == 0 && count[0] == 2 && count[8] >= 3) {
                        foundTing = true;
                        need = 1 + 10 * paiType;
                    }
                    if (zeroNum == 0 && count[0] >= 3 && count[8] == 2) {
                        foundTing = true;
                        need = 9 * 10 * paiType;
                    }

                    if (foundTing) {
                        int[] tList = {target, need};
                        tingList.add(tList);
                    }

                    if (zeroNum == 0 && count[0] >= 3 && count[8] >= 3) {
                        foundTing = true;
                        if (count[0] != 4) {
                            need = 1 + 10 * paiType;
                            int[] tList = {target, need};
                            tingList.add(tList);
                        }
                        if (count[8] != 4) {
                            need = 9 + 10 * paiType;
                            int[] tList = {target, need};
                            tingList.add(tList);
                        }
                    }
                }

                if (numCount.get(paiType) == 14) {
                    int midCount = 0;
                    for (int i = 1; i <= 7; i++) {
                        midCount += count[i];
                    }
                    if (zeroCount == 0 && midCount == 8 && (count[0] + count[8] == 6) && (count[0] == 2 || count[0] == 4)) {
                        foundTing = true;
                        if (count[0] == 2) {
                            target = 9 + 10 * paiType;
                            need = 1 + 10 * paiType;
                        } else {
                            target = 1 + 10 * paiType;
                            need = 9 + 10 * paiType;
                        }
                        int[] tList = {target, need};
                        tingList.add(tList);
                    }
                    if (zeroCount == 0 && midCount == 9 && (count[0] + count[8] == 5) && (count[0] == 2 || count[0] == 3)) {
                        foundTing = true;
                        if (count[0] == 2) {
                            need = 1 + 10 * paiType;
                        } else {
                            need = 9 + 10 * paiType;
                        }
                        if (size2Count == 1) {
                            target = size2Num1 + 10 * paiType;
                            int[] tList = {target, need};
                            tingList.add(tList);
                        } else if (size2Count == 2) {
                            int target1 = size2Num1 + 10 * paiType;
                            int target2 = size2Num2 + 10 * paiType;
                            int[] tList1 = {target1, need};
                            int[] tList2 = {target2, need};
                            tingList.add(tList1);
                            tingList.add(tList2);
                        }
                    }
                    if (zeroCount == 1 && midCount == 7 && (count[0] + count[8] == 7) && (count[0] == 3 || count[0] == 4)) {
                        foundTing = true;
                        if (count[0] == 4) {
                            target = 1 + 10 * paiType;
                        } else {
                            target = 9 + 10 * paiType;
                        }
                        need = zeroNum + 10 * paiType;
                        int target2 = size2Num1 + 10 * paiType;
                        int[] tList1 = {target, need};
                        int[] tList2 = {target2, need};
                        tingList.add(tList1);
                        tingList.add(tList2);
                    }
                    if (zeroCount == 1 && midCount == 8 && (count[0] == 3 && count[8] == 3)) {
                        foundTing = true;
                        need = zeroNum + 10 * paiType;
                        if (size2Count == 1) {
                            target = size2Num1 + 10 * paiType;
                            int[] tList = {target, need};
                            tingList.add(tList);
                        } else if (size2Count == 2) {
                            int target1 = size2Num1 + 10 * paiType;
                            int target2 = size2Num2 + 10 * paiType;
                            int[] tList1 = {target1, need};
                            int[] tList2 = {target2, need};
                            tingList.add(tList1);
                            tingList.add(tList2);
                        }
                    }
                }
            }
        }

        // 四组“胡”且将 == 0 或 1
        if (sumHu == 4 && sumJiang < 2 && !foundTing) {
            int jiangNeed = 1 - sumJiang;
            int target = 0;
            for (int i = 0; i < huInfo.length; i++) {
                if (!huInfo[i]) {
                    target = i;
                }
            }

            for (int i = 0; i < sortPai.get("My").get(target).size(); i++) {
                int tPai = sortPai.get("My").get(target).get(i);
                for (int j = 0; j < collection[target].length; j++) {
                    sortPai.get("My").get(target).set(i, collection[target][j]);
                    Result result = validHu(sortPai.get("My").get(target), 1, sortPai.get("My").get(target).size());
                    if (result.canHu && result.jiangCount == jiangNeed) {
                        foundTing = true;
                        int[] tList = {tPai, collection[target][j]};
                        tingList.add(tList);
                    }
                }
                sortPai.get("My").get(target).set(i, tPai);
            }
        }

        // 三组“胡” 且将 == 0 或 1
        if (sumHu == 3 && sumJiang < 2 && !foundTing) {
            int target1 = 0;
            int target2 = 0;
            for (int i = 0; i < huInfo.length; i++) {
                if (!huInfo[i]) {
                    if (target1 == 0) {
                        target1 = i;
                    } else {
                        target2 = i;
                    }
                }
            }

            int jiangNeed = 1 - sumJiang;
            for (int i = 0; i < sortPai.get("My").get(target1).size(); i++) {
                int tPai = sortPai.get("My").get(target1).get(i);
                sortPai.get("My").get(target1).remove(i);
                Result result1 = validHu(sortPai.get("My").get(target1), 1, sortPai.get("My").get(target1).size());
                if (result1.canHu) {
                    for (int k = 0; k < collection[target2].length; k++) {
                        List<Integer> tPai2 = new ArrayList<>(sortPai.get("My").get(target2));
                        tPai2.add(collection[target2][k]);
                        Collections.sort(tPai2);
                        Result result2 = validHu(tPai2, 1, tPai2.size());
                        if (result2.canHu && result2.jiangCount + result1.jiangCount == jiangNeed) {
                            foundTing = true;
                            int[] tList = {tPai, collection[target2][k]};
                            tingList.add(tList);
                        }
                    }
                }
                sortPai.get("My").get(target1).add(i, tPai);
            }

            for (int i = 0; i < sortPai.get("My").get(target2).size(); i++) {
                int tPai = sortPai.get("My").get(target2).get(i);
                sortPai.get("My").get(target2).remove(i);
                Result result1 = validHu(sortPai.get("My").get(target2), 1, sortPai.get("My").get(target2).size());
                if (result1.canHu) {
                    for (int k = 0; k < collection[target1].length; k++) {
                        List<Integer> tPai2 = new ArrayList<>(sortPai.get("My").get(target1));
                        tPai2.add(collection[target1][k]);
                        Collections.sort(tPai2);
                        Result result2 = validHu(tPai2, 1, tPai2.size());
                        if (result2.canHu && result2.jiangCount + result1.jiangCount == jiangNeed) {
                            foundTing = true;
                            int[] tList = {tPai, collection[target1][k]};
                            tingList.add(tList);
                        }
                    }
                }
                sortPai.get("My").get(target2).add(i, tPai);
            }
        }

        // 检查是否听 十三幺
        if (sumHu < 3 && !foundTing) {
            int[] ssyList = {11, 19, 21, 29, 31, 39, 41, 43, 45, 47, 51, 53, 55};
            Map<Integer, Integer> ssyCount = new HashMap<>();
            for (int ssy : ssyList) {
                ssyCount.put(ssy, 0);
            }

            for (int pai : userPai) {
                for (int ssy : ssyList) {
                    if (pai == ssy) {
                        ssyCount.put(ssy, ssyCount.get(ssy) + 1);
                    }
                }
            }

            int sum = 0;
            int zero = 0;
            for (int ssy : ssyList) {
                if (ssyCount.get(ssy) == 0) {
                    zero++;
                }
                sum += ssyCount.get(ssy);
            }

            if ((zero == 0 || zero == 1) && sum == 13) {
                int target = 0;
                for (int pai : userPai) {
                    boolean found = false;
                    for (int ssy : ssyList) {
                        if (pai == ssy) {
                            found = true;
                        }
                    }
                    if (!found) {
                        target = pai;
                    }
                }
                foundTing = true;
                int[] tList = {target, ssyList[0]};
                tingList.add(tList);
            }
            if (zero == 1 && sum == 14) {
                int paiNeed = 0;
                for (int ssy : ssyList) {
                    if (ssyCount.get(ssy) == 0) {
                        paiNeed = ssy;
                    }
                }
                for (int ssy : ssyList) {
                    if (ssyCount.get(ssy) > 1) {
                        foundTing = true;
                        int[] tList = {ssy, paiNeed};
                        tingList.add(tList);
                    }
                }
            }
        }

        // 过滤掉相同的组
        List<int[]> uniqueList = new ArrayList<>();
        for (int[] ting : tingList) {
            boolean foundSame = false;
            for (int[] unique : uniqueList) {
                if (ting[0] == unique[0] && ting[1] == unique[1]) {
                    foundSame = true;
                    break;
                }
            }
            if (!foundSame) {
                uniqueList.add(ting);
            }
        }

        return uniqueList;
    }

    public static void main(String[] args) {
        int[] userPai = {11, 12, 13, 14, 15, 16, 17, 18, 19};
        X x = new X();
        List<int[]> result = x.checkTingPai(userPai);
        for (int[] ting : result) {
            System.out.println("丢的牌: " + ting[0] + ", 听的牌: " + ting[1]);
        }
    }
}
