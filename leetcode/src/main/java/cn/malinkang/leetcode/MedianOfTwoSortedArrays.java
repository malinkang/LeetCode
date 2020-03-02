package cn.malinkang.leetcode;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = 0, n = 0;
        int length = nums1.length + nums2.length;
        int[] nums3 = new int[length];
        while (m < nums1.length || n < nums2.length) {
            if (m < nums1.length && n < nums2.length) {
                if(nums1[m]>nums2[n]){
                    nums3[m+n] = nums2[n];
                    n++;
                }else{
                    nums3[m+n] = nums1[m];
                    m++;
                }
            }else if(m<nums1.length){
                nums3[m+n] = nums1[m];
                m++;
            }else {
                nums3[m+n] = nums2[n];
                n++;
            }
        }
        if(length % 2 == 0){
            System.out.println(Arrays.toString(nums3));
            return (nums3[length/2]+nums1[length/2-1])/2.0;
        }else{
            return nums3[length/2]/2.0;
        }
    }

    public static void main(String[] args) {
        MedianOfTwoSortedArrays medianOfTwoSortedArrays = new MedianOfTwoSortedArrays();
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        System.out.println(medianOfTwoSortedArrays.findMedianSortedArrays(nums1,nums2));
    }
}
