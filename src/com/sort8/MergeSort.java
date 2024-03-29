package com.sort8;

import java.util.Arrays;

/**
 * @author mrjimmylin
 * @description 归并排序
 * @date 2019/9/30 8:40
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] nums = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        mergeSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    private static void mergeSort(int[] nums, int start, int end) {
        if (start >= end) return;
        int mid = start + ((end - start) >> 1);
        mergeSort(nums, start, mid);
        mergeSort(nums, mid + 1, end);
        merge(nums, start, mid, end);
    }

    private static void merge(int[] nums, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];
        int i = 0, p1 = start, p2 = mid + 1;
        while (p1 <= mid && p2 <= end) temp[i++] = nums[p1] <= nums[p2] ? nums[p1++] : nums[p2++];
        while (p1 <= mid) temp[i++] = nums[p1++];
        while (p2 <= end) temp[i++] = nums[p2++];
        i = 0;
        while (i < temp.length) nums[start + i] = temp[i++];
    }
}
