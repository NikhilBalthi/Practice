package org.example.hashset;

import java.util.HashSet;
import java.util.Set;

public class CountDistinct {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,5,7,8,7};
        System.out.println("actual size is "+nums.length);
        System.out.println("count of distinct elements is "+countDistinct(nums));
    }

    private static int countDistinct(int[] arr) {
        Set<Integer> set1 = new HashSet<>();
        for(int num:arr){
            set1.add(num);
        }
        return set1.size();
    }
}
