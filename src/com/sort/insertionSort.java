package com.sort;

import java.util.Arrays;
import java.util.Collections;

public class insertionSort {


    public static void main(String[] args) {
        int[] nums = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        insertionSort(nums);
        System.out.println(Arrays.toString(nums));

    }

    static void insertionSort(int[] nums) {
        if (nums.length <= 1) return;

        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];
            int j = i;
            while (j-1 >= 0 && nums[j-1] > curr) {
                nums[j] = nums[j-1];
                j--;
            }

            nums[j] = curr;
        }
    }
}
