package com.rowoffer;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 基本算是理解了
 */
public class LargestRectangleArea {
    public int largestRectangleArea(int[] heights) {
        Deque<Integer> stack = new LinkedList<>();
        int max = 0;
        stack.push(-1);
        for (int i = 0; i < heights.length; i++) {
            while (stack.peek()!=-1 && heights[stack.peek()] >= heights[i]) {
                Integer pop = stack.pop();
                int height1 = heights[pop];
                max = Math.max(height1 * (i - stack.peek()-1), max);
            }
            stack.push(i);
        }

        if (stack.peek() != -1){

//            int height = heights[stack.pop()];
//            //每个柱子右侧没有比它矮的柱子，宽度直接从heights.length计算
//            int width = heights.length - stack.peek() - 1;
//            maxArea = Math.max(maxArea, height * width);
            int height = heights[stack.pop()];
            int width = heights.length - stack.peek() - 1;
            max = Math.max(max,height*width);
        }
        return max;
    }

    public int largestRectangleArea1(int[] heights) {
        //用栈存柱子的下标，并保持栈中的柱子高度是递增的
        Deque<Integer> stack = new LinkedList<>();
        //栈中先存入一个柱子，当栈中无柱子时，它代表一个较矮的柱子
        stack.push(-1);

        int maxArea = 0;
        //从左向右遍历直方图，依次找到每个柱子作为矩形高度时的面积，即要找到左右两侧比栈顶柱子矮的柱子
        for (int i = 0; i < heights.length; i++) {
            //stack.peek() != -1表示栈中还有实际的柱子，并且当前柱子比栈顶柱子矮时
            while (stack.peek() != -1 && heights[stack.peek()] >= heights[i]) {
                //此时表示找到了栈顶左右两侧均比它矮的最近的柱子，栈顶柱出栈
                int height = heights[stack.pop()];
                //若stack.peek() == -1，即左侧没有比它矮的柱子，则宽度直接从头计算，-(-1)即可
                int width = i - stack.peek() - 1;
                //以栈顶的柱子为高度时的矩形面积，是两侧均比它矮的最近的柱子距离作为宽度与它高度的乘积
                maxArea = Math.max(maxArea, height * width);
            }
            //当前柱子比栈顶柱子高时，没有找到栈顶右侧的矮柱，入栈。
            stack.push(i);
        }
//        //遍历结束后若栈中还有柱子，继续计算
//        while (stack.peek() != -1) {
//            int height = heights[stack.pop()];
//            //每个柱子右侧没有比它矮的柱子，宽度直接从heights.length计算
//            int width = heights.length - stack.peek() - 1;
//            maxArea = Math.max(maxArea, height * width);
//        }

        return maxArea;
    }

    public static void main(String[] args) {
        int [] arr ={2,1,5,6,2,3};
        LargestRectangleArea area = new LargestRectangleArea();
        area.largestRectangleArea(arr);
    }
}
