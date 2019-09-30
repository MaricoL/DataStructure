package com.sort6;

public class QuickSort {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int result = findNum(nums, 0, nums.length - 1 , 1);
        System.out.println(result);

    }

    private static int findNum(int[] nums, int start, int end, int index) {
        if(start >= end) return -1;
        int pivot = partition(nums , start , end);
        if(pivot + 1 == index) return nums[pivot];
        else if(pivot + 1 < index) return partition(nums, pivot + 1, end);
        else if(pivot + 1 > index) return partition(nums , start , pivot - 1);
        else return -1;
    }

    private static int partition(int[] nums, int start, int end) {
        int pivotNum = nums[end];
        int i = start;
        for (int j = start; j < nums.length; j++) {
            if (nums[j] > pivotNum) {
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
