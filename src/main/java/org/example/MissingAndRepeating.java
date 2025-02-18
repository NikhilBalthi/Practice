package org.example;

import java.util.HashSet;

public class MissingAndRepeating {
    public static void findMissingAndRepeating(int[] nums){
        int missing = -1;
        int repeating = -1;
        HashSet<Integer> a = new HashSet<>();
        for(int num:nums){
            if(a.contains(num)){
                repeating = num;
            }else {
                a.add(num);
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,1};
    }
}
