package com.recursive;

import java.util.HashMap;
import java.util.Map;

public class Test1 {
    private static Map<Integer, Integer> hasResolvedList = new HashMap<>();

    public static int louti(int n) {
        if(n == 1) return 1;
        if(n == 2) return 2;

        if (hasResolvedList.containsKey(n)) {
            return hasResolvedList.get(n);
        }

        int result = louti(n - 1) + louti(n - 2);
        hasResolvedList.putIfAbsent(n, result);
        return result;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(louti(45));
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
