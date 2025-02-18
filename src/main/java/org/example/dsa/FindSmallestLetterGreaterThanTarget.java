package org.example.dsa;

import java.util.Arrays;

public class FindSmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] chars = {'b','d','a','z','f'};
        char target = 'c';

        char result = nextGreaterLetter(chars,target);
    }

    public static char nextGreaterLetter(char arr[] ,char target){

        Arrays.sort(arr);
        System.out.println(arr);
        return 'a';
    }
}
