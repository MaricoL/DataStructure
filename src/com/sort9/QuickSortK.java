package com.sort9;

import com.sun.org.apache.bcel.internal.generic.SWAP;

/**
 * @author mrjimmylin
 * @description
 * @date 2019/10/8 9:55
 */
public class QuickSortK {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int result = findNum(nums, 0, nums.length - 1, 2);
        System.out.println(result);
    }

    private static int findNum(int[] nums, int start, int end, int index) {
        if(start >= end)  return -1;
        int pivot = partition(nums, start, end);
        if (pivot + 1 == index) return nums[pivot];
        else if (pivot + 1 < index) return findNum(nums, pivot + 1, end , index);
        else if (pivot + 1 > index) return findNum(nums, start, pivot - 1 , index);
        else return -1;
    }

    private static int partition(int[] nums, int start, int end) {
        int pivotNum = nums[end];
        int i = start;
        for (int j = start; j < nums.length - 1; j++) {
            if(nums[j] > pivotNum){
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
