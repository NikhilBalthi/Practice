package org.example.hashset;

import java.util.HashSet;
import java.util.Hashtable;

public class DuplicatesInAnArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,1};
        System.out.println("Does it contain duplicate value "+containsDuplicate(arr));
    }

    private static boolean containsDuplicate(int[] arr) {

        HashSet<Integer> a = new HashSet<>();
        for(int num:arr){
            if(a.contains(num)){
                return true;
            }else{
                a.add(num);
            }
        }
        return false;
    }
}
