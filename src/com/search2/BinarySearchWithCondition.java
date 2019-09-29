package com.search2;

/**
 * @author mrjimmylin
 * @description 指定元素的二分查找
 * @date 2019/9/29 8:51
 */
public class BinarySearchWithCondition {
    public static void main(String[] args) {
        int[] nums = {1, 3, 3, 5, 7, 9, 11};
        int index1 = findFirstEqualValue(nums, nums.length, 3);
        int index2 = findLastEqualValue(nums, nums.length, 3);
        int index3 = findFirstGreaterEqualValue(nums, nums.length, 6);
        int index4 = findLastLessEqualValue(nums, nums.length, 6);
        System.out.println(index1);
        System.out.println(index2);
        System.out.println(index3);
        System.out.println(index4);
    }

    private static int findLastLessEqualValue(int[] nums, int length, int value) {
        int low = 0;
        int high = length - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if(nums[mid] > value) high = mid - 1;
            else if(nums[mid] <= value) {
                if(mid == length - 1 || nums[mid + 1] > value) return mid;
                else low = mid + 1;
            }
        }
        return -1;
    }

    private static int findFirstGreaterEqualValue(int[] nums, int length, int value) {
        int low = 0;
        int high = length - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (nums[mid] >= value) {
                if (mid == 0 || nums[mid - 1] < value) return mid;
                else high = mid - 1;
            } else if (nums[mid] < value) low = mid + 1;
        }
        return -1;
    }

    private static int findLastEqualValue(int[] nums, int length, int value) {
        int low = 0;
        int high = length - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (nums[mid] == value) {
                if (mid == length - 1 || nums[mid + 1] != value) return mid;
                else low = mid + 1;
            } else if (nums[mid] > value) high = mid - 1;
            else if (nums[mid] < value) low = mid + 1;
        }
        return -1;
    }

    private static int findFirstEqualValue(int[] nums, int length, int value) {
        int low = 0;
        int high = length - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (nums[mid] == value) {
                if (mid == 0 || nums[mid - 1] != value) return mid;
                else high = mid - 1;
            } else if (nums[mid] < value) low = mid + 1;
            else if (nums[mid] > value) high = mid - 1;
        }

        return -1;
    }
}
