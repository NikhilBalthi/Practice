package org.example.hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] nums = {1,99,101,100,101,33,4,44,44};
        System.out.println(findDuplicates(nums));
        System.out.println("hi another check");
    }

    private static Set<Integer> findDuplicates(int[] nums) {
        Set<Integer> duplicates = new HashSet<>();
        Set<Integer> a = new HashSet<>();
        for(int num:nums){
            if(a.contains(num)){
                duplicates.add(num);
            }else {
                a.add(num);
            }
        }
        return duplicates;
    }
}
