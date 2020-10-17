package cn.malinkang.leetcode;

public class Solution45 {

    public int translateNum(int num) {
        if (num == 0) {
            return 0;
        }
        int result = ((num%100 > 9 && num%100 < 26) ? translateNum(num / 100) + 1 : 0) + (translateNum(num / 10) + 1 );
        System.out.println(num+","+result);
        return result;

    }

    public static void main(String[] args) {
        Solution45 solution45 = new Solution45();
        System.out.println(solution45.translateNum(12258));;
    }
}
