package org.example.hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int nums[] = {1,2,2,3,4,5,6,5,99,99,99};
        System.out.println(removeDuplicates(nums));
    }

    private static List<Integer> removeDuplicates(int[] nums) {
        Set<Integer> s1 = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        for(int num:nums){
            if(!s1.contains(num)){
                result.add(num);
                s1.add(num);
            }
        }
        return result;
    }
}
