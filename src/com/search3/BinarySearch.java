package com.search3;

/**
 * @author mrjimmylin
 * @description 二分查找
 * @date 2019/10/8 9:48
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int result = binarySearch(nums, 0, 1);
        System.out.println(result);
    }

    private static int binarySearch(int[] nums, int start, int value) {
        int low = start;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (nums[mid] == value) return mid;
            else if (nums[mid] > value) high = mid - 1;
            else if (nums[mid] < value) low = mid + 1;
        }
        return -1;
    }
}
