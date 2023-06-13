package com.letcode;

public class _223_ComputeArea {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area1 = (ax2 - ax1) * (ay2 - ay1);
        int area2 = (bx2 - bx1) * (by2 - by1);
        int overX1 = Math.max(bx1,ax1);
        int overY1 = Math.min(by1,ay1);
        int overX2 = Math.max(bx2,ax2);
        int overY2 = Math.min(by2,ay2);
        int over = (overX2 - overX1) * (overY2 - overY1);
        return area1 + area2 - over;
    }

    public int computeArea1(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area1 = (ax2 - ax1) * (ay2 - ay1), area2 = (bx2 - bx1) * (by2 - by1);
        int overlapWidth = Math.min(ax2, bx2) - Math.max(ax1, bx1), overlapHeight = Math.min(ay2, by2) - Math.max(ay1, by1);
        int overlapArea = overlapWidth * overlapHeight;
        return area1 + area2 - overlapArea;
    }
}
