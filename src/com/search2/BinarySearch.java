package com.search2;


/**
 * @description 二分查找
 * @author mrjimmylin
 * @date 2019/9/29 8:37
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int index = binarySearch(nums, nums.length , 1);
        System.out.println(index);
    }

    private static int binarySearch(int[] nums, int length , int value) {
        int low = 0;
        int high = length - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if(nums[mid] == value) return mid;
            else if (nums[mid] > value) high = mid - 1;
            else if(nums[mid] < value) low = mid + 1;
        }
        return -1;
    }
}
