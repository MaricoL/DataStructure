package com.sort2;

import com.sun.org.apache.bcel.internal.generic.SWAP;

/**
 * @description 在O(n)内找出第K大的元素
 * @author mrjimmylin
 * @date 2019/9/24 8:18
 */
public class QuickSortKth {

    public static void main(String[] args) {
        int[] nums = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int result = findNum(nums, 0, nums.length - 1, 10);
        System.out.println(result);
    }

    private static int findNum(int[] nums, int start, int end, int k) {
        if(start >= end || k <= 0) throw new IllegalArgumentException();

        int pivot = partition(nums, start, end);
        if(pivot + 1 == k) return nums[pivot];
        else if(pivot + 1 > k) return findNum(nums, start, pivot - 1, k);
        else if(pivot + 1 < k) return findNum(nums, pivot + 1, end, k);
        else{
           throw new IllegalArgumentException();
        }
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
        swap(nums,i,end);
        return i;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
