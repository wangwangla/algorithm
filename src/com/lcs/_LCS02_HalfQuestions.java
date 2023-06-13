package com.lcs;

import java.util.Arrays;

public class _LCS02_HalfQuestions {
    public int halfQuestions(int[] questions) {
        int i = (int) Math.ceil(questions.length / 2);
        Arrays.sort(questions);
        int sum = 0;
        int res = 0;
        for (int i1 = 0; i1 < questions.length; i1++) {
            sum += questions[i1];
            res++;
            if (sum >= i){
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {1,5,1,3,4,5,2,5,3,3,8,6};
        _LCS02_HalfQuestions halfQuestions = new _LCS02_HalfQuestions();
        halfQuestions.halfQuestions(arr);
    }
}
