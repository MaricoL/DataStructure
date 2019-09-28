package com.search;

public class BinarySearchWithCondition {
    public static void main(String[] args) {
        int[] nums1 = {1, 3, 3, 7, 9, 11};
        int index1 = findFirstEqualValue(nums1, 0, nums1.length - 1, 3);
        int index2 = findLastEqualValue(nums1, 0, nums1.length - 1, 3);
        int index3 = findFirstGreaterEqualValue(nums1, 0, nums1.length - 1, 10);
        int index4 = findLastLessEqualValue(nums1, 0, nums1.length - 1, 8);
        System.out.println(index1);
        System.out.println(index2);
        System.out.println(index3);
        System.out.println(index4);
    }

    // 寻找最后一个小于等于给定的元素的下标
    private static int findLastLessEqualValue(int[] nums , int low, int high, int value) {
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (nums[mid] <= value) {
                if(mid == nums.length - 1 || nums[mid + 1] > value) return mid;
                else low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return -1;
    }

    // 寻找第一个大于等于给定的元素的下标
    private static int findFirstGreaterEqualValue(int[] nums, int low, int high, int value) {
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (nums[mid] < value) {
                low = mid + 1;
            }else{
                if(mid == 0 || nums[mid - 1] <value) return mid;
                else high = mid - 1;
            }
        }
        return -1;
    }

    // 寻找最后一个与给定值相同的元素下标
    private static int findLastEqualValue(int[] nums, int low, int high, int value) {
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (nums[mid] < value) {
                low = mid + 1;
            } else if (nums[mid] > value) {
                high = mid - 1;
            }else{
                if(mid == high - 1 || nums[mid + 1] > value) return mid;
                else low = mid + 1;
            }
        }
        return -1;
    }

    // 寻找第一个与给定值相同的元素下表
    private static int findFirstEqualValue(int[] nums, int low, int high, int value) {
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (nums[mid] < value) {
                low = mid + 1;
            } else if (nums[mid] > value) {
                high = mid - 1;
            }else{
                if(mid == 0 || nums[mid - 1] != value) return mid;
                else high = mid - 1;
            }
        }

        return -1;

    }
}
