package cn.malinkang.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Set<List<Integer>> set = new HashSet<>();
        System.out.println(set.add(Arrays.asList(1,2,3)));;
        System.out.println(set.add(Arrays.asList(1,2,3)));

    }
}
