package org.example.dsa;


public class PracticeOne {
    public static void main(String[] args) {
        String name = "Hey i am nikhil";
        String[] split = name.split(" ");
        System.out.println();

//        StringBuilder result = new StringBuilder();
//        int spaces[] = new int[]{5,7};
//        int currentIndex = 0;
//        for(int i=0;i< spaces.length;i++){
//            while(currentIndex < spaces[i]){
//                result.append(name.charAt(i));
//            }
//        }

        StringBuilder a = new StringBuilder();
        a.append("a");
        a.append("b");
        a.append("z");
        System.out.println("Value of a  is "+a);

    }
}
