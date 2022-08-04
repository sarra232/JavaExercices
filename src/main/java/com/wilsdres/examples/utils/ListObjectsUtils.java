package com.wilsdres.examples.utils;

import java.util.ArrayList;
import java.util.Random;

public class ListObjectsUtils {

    public static ArrayList<Integer> getRandomArrayListNumberOfInteger(int n){
        ArrayList<Integer> list = new ArrayList<Integer>(n);
        Random random = new Random();

        for (int i = 0; i < n; i++)
        {
            list.add(random.nextInt(1000));
        }
        return list;
    }
}
