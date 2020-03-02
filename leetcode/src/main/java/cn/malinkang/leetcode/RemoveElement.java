package cn.malinkang.leetcode;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j++] = nums[i];
            }
        }
        return j;
    }

    public static void main(String[] args) {
        RemoveElement removeElement = new RemoveElement();
        System.out.println(removeElement.removeElement(new int[]{0,1,2,2,3,0,4,2},2));
        System.out.println(removeElement.removeElement(new int[]{3,2,2,3},2));
    }
}
