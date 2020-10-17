package cn.malinkang.leetcode;

import java.util.HashMap;
import java.util.Map;

public class SatisfiabilityOfEqualityEquations {
    public boolean equationsPossible(String[] equations) {
        Map<Character, Integer> map = new HashMap<>();
        //遍历
        int value = 0;//初始化value
        for (String equation : equations) {
            char a = equation.charAt(0);//第一个变量
            char b = equation.charAt(3);//第二个变量
            char operator = equation.charAt(1);//运算符
            if(a ==b && operator=='!') {
                return false;
            }else if (map.get(a) == null && map.get(b) == null) {
                //第一个变量对应的值
                map.put(a, ++value);

                if (operator == '!') {
                    value++;
                }
                map.put(b, value);
                System.out.println(a + " = " + map.get(a) + "=");
                System.out.println(b + " = " + map.get(b) + "=");
                continue;

            } else if (map.get(a) == null) {
                if (operator == '!') {
                    value++;
                }
                map.put(a, value);
                System.out.println(a + " = " + map.get(a) + "==");
                continue;

            } else if (map.get(b) == null) {
                if (operator == '!') {
                    value++;
                }
                map.put(b, value);
                System.out.println(b + " = " + map.get(a) + "===");
                continue;
            }
            return (operator == '=' && map.get(a).equals(map.get(b))) || (operator == '!' && !map.get(a).equals(map.get(b)));

        }
        return true;
    }

    public static void main(String[] args) {
//        String[] array = {"c==c", "b==d", "x!=z"};
        String[] array = {"a==b","b!=c","c==a"};
//        String[] array = {"a==b","b==c","a==c"};
        SatisfiabilityOfEqualityEquations satisfiabilityOfEqualityEquations = new SatisfiabilityOfEqualityEquations();
        System.out.println(satisfiabilityOfEqualityEquations.equationsPossible(array));
    }
}
