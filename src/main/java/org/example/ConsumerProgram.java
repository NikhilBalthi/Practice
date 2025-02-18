package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerProgram {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hari","ram","sam");
        Consumer<String> s1= (name)-> System.out.println(name);
        list.forEach(s1);

        int n = 24; //
        //16 8 4 2 1
        //1 1 0 0  0
        // 1 1 0 0 0
        System.out.println(n<<0);
        System.out.println(n>>0);
        System.out.println(n<<1);
        System.out.println(n>>1);
    }
}
