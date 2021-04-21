package com.company;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String str = "Hi,";
        System.out.println(str);
        str = str.substring(0,str.length()-1);
        System.out.println(str);
       Numbers ten = new Numbers(10,"Ten");
       Numbers two = new Numbers(2,"Two");
       calculator calculator = new calculator(ten.getValue(), two.getValue());


       ArrayList<math> mathStuff = new ArrayList();
       mathStuff.add(ten);
       mathStuff.add(two);
       mathStuff.add(calculator);

       for (math item: mathStuff)
           System.out.println(item.getValue());
    }
}
