package com.sort5;

import java.util.Arrays;

/**
 * @description 快速排序
 * @author mrjimmylin
 * @date 2019/9/27 8:03
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] nums = {10, 9, 8, 7,6 , 5, 4, 3, 2, 1};
        quickSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    private static void quickSort(int[] nums, int start, int end) {
        if(start >= end) return;
        int pivot = partition(nums, start, end);
        quickSort(nums, start, pivot - 1);
        quickSort(nums, pivot + 1, end);
    }

    private static int partition(int[] nums, int start, int end) {
        int pivotNum = nums[end];
        int i = start;
        for (int j = start; j < nums.length; j++) {
            // 找出该数组中比 pivotNum 大的第一个数，在这之前都比 pivotNum 小
            if (nums[j] < pivotNum) {
                swap(nums, i, j);
                i++;
            }
        }
        swap(nums, i, end);
        return i;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
