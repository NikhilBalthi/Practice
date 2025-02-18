package org.example.hashset;

import java.util.HashSet;
import java.util.Set;

public class ContainsAll {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);

        set2.add(2);
        set2.add(3);
        set2.add(33);

        System.out.println("contains All or Not "+containsAllCheck(set1,set2));
    }

    private static boolean containsAllCheck(Set<Integer> set1, Set<Integer> set2) {
        return set1.containsAll(set2);
    }
}
