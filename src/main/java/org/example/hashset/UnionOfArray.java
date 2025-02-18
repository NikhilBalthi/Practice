package org.example.hashset;

import java.util.HashSet;
import java.util.Set;

public class UnionOfArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {3,4,5,6,7,8,100};
        System.out.println(unionOfArray(arr1,arr2));
    }

    private static Set<Integer> unionOfArray(int[] arr1, int[] arr2) {
        Set<Integer> result = new HashSet<>();
        for(int num:arr1){
            result.add(num);
        }
        for(int num:arr2){
            result.add(num);
        }
        return result;
    }
}
