package org.example.hashset;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int num1[] = {1,2,9,7,3,100,99};
        int num2[] = {2,3,4,5,6,7,101,102,103};
        System.out.println(intersectionOfTwoArrays(num1,num2));
    }

    private static Set<Integer> intersectionOfTwoArrays(int[] num1,int[] num2) {
        Set<Integer> set1 = new HashSet<>();

        Set<Integer> intersection = new HashSet<>();
        for(int num:num1){
            set1.add(num);
        }
        for(int num:num2){
            if(set1.contains(num)){
                intersection.add(num);
            }
        }
        return intersection;
    }
}
