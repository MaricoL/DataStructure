package com.search;

/**
 * @description 二分查找
 * @author mrjimmylin
 * @date 2019/9/27 8:55
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int index = binarySearch(nums,0,nums.length - 1,8);
        int index = binarySearchRecursion(nums,0,nums.length - 1,8);
        System.out.println(index);
    }

    private static int binarySearchRecursion(int[] nums, int low, int high, int value) {
        if (low > high) return -1;
        int mid = low + ((high - low) >> 1);
        if(value == nums[mid]) return mid;
        else if (value < nums[mid]) return binarySearchRecursion(nums , low , mid - 1 , value);
        else if (value > nums[mid]) return binarySearchRecursion(nums , mid + 1 , high, value);
        else return -1;
    }

    private static int binarySearch(int[] nums , int low , int high , int value) {
        while (low <= high) {
//            int mid = (low + high) / 2;
//            int mid = low + (high - low) / 2;
            int mid = low + ((high - low) >> 1);
            if (value == nums[mid] ) {
                return mid;
            } else if (value < nums[mid]) {
                high = mid - 1;
            } else if(value > nums[mid]) {
                low = mid + 1;
            }
        }
        return -1;
    }


}
