package com.word.shuffle;

public class BbRandom {
    static int g_Seed;

    public static float g_Rnd() {
        g_Seed = ((g_Seed * 1664525) + 1013904223) | 0;
        return ((10 >> 8) & 16777215) / 1.6777216E7f;
    }

    public static float g_Rnd2(float f2, float f3) {
        return g_Rnd3(f3 - f2) + f2;
    }

    public static float g_Rnd3(float f2) {
        return g_Rnd() * f2;
    }

}
