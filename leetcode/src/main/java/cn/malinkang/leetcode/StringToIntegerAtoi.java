package cn.malinkang.leetcode;

public class StringToIntegerAtoi {
    public int myAtoi(String str) {
        if (str == null) {
            return 0;
        }
        str = str.trim();
        if (str.length() == 0) {
            return 0;
        }
        int number = 0;
        char first = str.charAt(0);
        int symbol = 1;
        if ((first >= '0' && first <= '9') || first == '+' || first == '-') {
            if (first == '-') {
                symbol = -1;
            } else if (first == '+') {
                symbol = 1;
            } else {
                number = first - '0';
            }

            for (int i = 1; i < str.length(); i++) {
                char c = str.charAt(i);
                if (c >= '0' && c <= '9') {

                    if (number * symbol > Integer.MAX_VALUE / 10 || (number * symbol == Integer.MAX_VALUE/10 && (c - '0') > 7))
                        return Integer.MAX_VALUE;
                    if (number * symbol < Integer.MIN_VALUE / 10 || (number * symbol == Integer.MIN_VALUE/10 && (c - '0') > 8))
                        return Integer.MIN_VALUE;
                    number = number * 10 + c - '0';
                } else {
                    break;
                }
            }
        }
        return number * symbol;
    }

    public static void main(String[] args) {
        StringToIntegerAtoi stringToIntegerAtoi = new StringToIntegerAtoi();
        System.out.println(stringToIntegerAtoi.myAtoi("   -42"));
        System.out.println(stringToIntegerAtoi.myAtoi("4193 with words"));
        System.out.println(stringToIntegerAtoi.myAtoi("words and 987"));
        System.out.println(stringToIntegerAtoi.myAtoi("-91283472332"));
        System.out.println(stringToIntegerAtoi.myAtoi("+"));
        System.out.println(stringToIntegerAtoi.myAtoi("2147483648"));
        System.out.println(stringToIntegerAtoi.myAtoi("-2147483647"));
    }
}
