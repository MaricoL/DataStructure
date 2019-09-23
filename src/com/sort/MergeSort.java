package com.sort;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {

        int[] nums = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        mergeSort(nums, 0 , nums.length - 1);
        System.out.println(Arrays.toString(nums) );
    }

    private static void mergeSort(int[] nums,int start , int end) {
        if(start >= end) return;
        mergeSort(nums , start , (start + end) /2);
        mergeSort(nums , (start + end) /2 + 1 , end);

        merge(nums, start, (start + end) / 2, end);
    }

    private static void merge(int[] nums, int start, int mid, int end) {
        int[] arr = new int[end - start + 1];
        int p1 = start;
        int p2 = mid + 1;
        int i = 0;
        while (p1 <= mid && p2 <= end) {
            arr[i++] = nums[p1] <= nums[p2] ? nums[p1++] : nums[p2++];
        }

        while (p1 <= mid) {
            arr[i++] = nums[p1++];
        }

        while (p2 <= end) {
            arr[i++] = nums[p2++];
        }

        for (i = 0; i < arr.length; i++) {
            nums[start + i] = arr[i];
        }
    }
}
