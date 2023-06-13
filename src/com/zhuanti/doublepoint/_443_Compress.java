package com.zhuanti.doublepoint;

import java.util.HashMap;

/**
 * 给你一个字符数组 chars ，请使用下述算法压缩：
 *
 * 从一个空字符串 s 开始。对于 chars 中的每组 连续重复字符 ：
 *
 * 如果这一组长度为 1 ，则将字符追加到 s 中。
 * 否则，需要向 s 追加字符，后跟这一组的长度。
 * 压缩后得到的字符串 s 不应该直接返回 ，需要转储到字符数组 chars 中。需要注意的是，如果组长度为 10 或 10 以上，则在 chars 数组中会被拆分为多个字符。
 *
 * 请在 修改完输入数组后 ，返回该数组的新长度。
 *
 * 你必须设计并实现一个只使用常量额外空间的算法来解决此问题。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：chars = ["a","a","b","b","c","c","c"]
 * 输出：返回 6 ，输入数组的前 6 个字符应该是：["a","2","b","2","c","3"]
 * 解释："aa" 被 "a2" 替代。"bb" 被 "b2" 替代。"ccc" 被 "c3" 替代。
 * 示例 2：
 *
 * 输入：chars = ["a"]
 * 输出：返回 1 ，输入数组的前 1 个字符应该是：["a"]
 * 解释：唯一的组是“a”，它保持未压缩，因为它是一个字符。
 * 示例 3：
 *
 * 输入：chars = ["a","b","b","b","b","b","b","b","b","b","b","b","b"]
 * 输出：返回 4 ，输入数组的前 4 个字符应该是：["a","b","1","2"]。
 * 解释：由于字符 "a" 不重复，所以不会被压缩。"bbbbbbbbbbbb" 被 “b12” 替代。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/string-compression
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class _443_Compress {
//    public int compress(char[] chars) {
//        HashMap<Character,Integer> hashMap = new HashMap<>();
//        for (int i = 0; i < chars.length; i++) {
//            hashMap.put(chars[i],hashMap.getOrDefault(chars[i],0)+1);
//        }
//        int index = 0;
//        for (char a = 'a';a < 'z';a++){
//            Integer integer1 = hashMap.get(a);
//            if (integer1 == null) {
//                continue;
//            }
//            int integer = integer1;
//            if (integer == 0)continue;
//            if (integer==1){
//                chars[index] = a;
//                index ++;
//            }else if (integer >= 2){
//                if (integer<10) {
//                    chars[index] = a;
//                    index++;
//                    chars[index] = (char) (integer + '0');
//                    index++;
//                }else {
//                    chars[index++] = (char) (integer / 10 + '0');
//                    chars[index++] = (char) (integer % 10 + '0');
//                }
//            }
//        }
//        return index;
//    }


    public int compress(char[] chars) {
        if(chars.length <= 1)return chars.length;

        int count = 1;
        int index = 0;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i-1] == chars[i]) {
                count++;
            }else {
                if (count == 1){
                    chars[index++] = chars[i - 1];
                }else {
                    chars[index++] = chars[i - 1];
                    if(count<10){
                        chars[index++] = (char) (count + '0');
                    }else{
                        chars[index++] = (char) (count / 10 + '0');
                        chars[index++] = (char) (count % 10 + '0');

                    }
                    count = 1;
                }
            }
        }
        chars[index ++] = chars[chars.length-1];
        if (count<10) {
            chars[index++] = (char) (count + '0');
        }else {
            chars[index++] = (char) (count / 10 + '0');
            chars[index++] = (char) (count % 10 + '0');

        }
        return index;
    }

    public static void main(String[] args) {
        char str[] = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        _443_Compress compress = new _443_Compress();
        compress.compress(str);
    }
}