package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pascal {


    public static void main(String[] args) {
        System.out.println(compute(4));
    }

    private static List<Integer> compute(int n) {
        if (n == 1) {
            return new ArrayList<>(Arrays.asList(1));
        }
       
        List<Integer> subProblem = compute(n - 1);
        List<Integer> ans = new ArrayList<>();

        ans.add(1);
        for (int index = 0; index < subProblem.size() - 1; index++) {
            ans.add(subProblem.get(index) + subProblem.get(index + 1));
        }
        ans.add(1);
        return ans;
    }
}
