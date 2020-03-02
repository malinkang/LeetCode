package cn.malinkang.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                if (allUnique(s, i, j)) {
                    //字符串取值[i,j)所以长度是j-i
                    ans = Math.max(j - i, ans);
                }
            }
        }
        return ans;
    }


    public boolean allUnique(String s, int start, int end) {
        Set<Character> set = new HashSet<>();
        for (int i = start; i < end; i++) {
            char c = s.charAt(i);
            if (set.contains(c)) return false;
            set.add(c);
        }
        return true;
    }

    public int lengthOfLongestSubstring2(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int ans = 0;
        for (int j = 0, i = 0; j < s.length(); j++) {
            char c = s.charAt(j);
            if (map.containsKey(c))
                i = Math.max(map.get(c), i);
            //j滑动到下一个
            ans = Math.max(j - i + 1, ans);
            map.put(c, j + 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        LengthOfLongestSubstring lengthOfLongestSubstring = new LengthOfLongestSubstring();
        System.out.println("" + lengthOfLongestSubstring.lengthOfLongestSubstring("abcabcbb"));
//        System.out.println("" + lengthOfLongestSubstring.lengthOfLongestSubstring("bbbbb"));
        System.out.println("" + lengthOfLongestSubstring.lengthOfLongestSubstring("pwwkew"));
    }
}
