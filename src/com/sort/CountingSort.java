package com.sort;

import java.util.Arrays;

/**
 * @description 基数排序
 * @author mrjimmylin
 * @date 2019/9/24 10:11
 */
public class CountingSort {
    public static void main(String[] args) {
        int[] nums = {2,5,3,0,2,3,0,3};
        countingSort(nums, nums.length);
        System.out.println(Arrays.toString(nums));
    }

    private static void countingSort(int[] nums, int length) {
        if(length < 1) return;
        // 查找数组中数据的范围
        int max = nums[0];
        for (int i = 1; i < length; i++) {
            if (nums[i] > max) max = nums[i];
        }

        // 申请一个计数数组
        int[] c = new int[max + 1];

        // 计算每个元素的个数
        for (int i = 0; i < length; i++) {
            c[nums[i]]++;
        }

        // 对 计数数组 顺序求和
        for (int i = 1; i < c.length; i++) {
            c[i] = c[i - 1] + c[i];
        }

        // 临时数组 r，存储排序之后的结果
        int[] r = new int[length];
        // 计算排序的关键步骤
        for (int i = length - 1; i >= 0; i--) {
            int index = c[nums[i]] - 1;
            r[index] = nums[i];
            c[nums[i]]--;
        }

        // 将临时数组 r 拷贝到 原数组中
        for (int i = 0; i < length; i++) {
            nums[i] = r[i];
        }

    }
}
