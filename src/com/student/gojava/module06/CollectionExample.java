package com.student.gojava.module06;

import com.student.gojava.module05.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionExample {
    public static void main(String[] args) {
        Integer [] intArray = {3,4,8,6,78,89,-67};
        ArrayList<Integer>arrayList = new ArrayList<>(Arrays.asList(intArray));
        arrayList.add(100);
        System.out.println("ArrayList elements: ");
        for (Integer elements : arrayList){
            System.out.println(elements);
        }


    }
}
