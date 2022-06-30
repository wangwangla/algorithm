package com.letcode;

/**
 *
 * 效验前序
 * 二叉树  出度 等于  入度
 */
public class _331_isValidSerialization {
    public boolean isValidSerialization(String preorder) {
        int indegress = 0;
        int outdegress = 0;
        String[] split = preorder.split(",");
        int len = split.length;
        //跟为null ，只有一个节点
        if (len == 1 && split[0].equals("#"))return true;
        //跟为null，但是节点大于1
        if (len > 1 && split[0].equals("#")){
            return false;
        }
        for (int i = 0; i < len; i++) {
            if (i == 0){
                outdegress += 2;
            }else if (split[i].equals("#")){
                indegress+=1;
            }else {
                indegress+=1;
                outdegress+=2;
            }
            if (i!=len && indegress >= outdegress){
                return false;
            }
        }
        return indegress == outdegress;
    }
}
