package ru.geekbrains;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;


public final class HW1 {
    public static void main(String[] args) {
        HashMap<String,List<String>> hMap = new HashMap<>();
        Scanner scn = new Scanner(System.in);
        int i = 0;
        while(i<10){
            String[] str = scn.nextLine().split(" ");
            if(hMap.containsKey(str[0])&&(str.length == 2)){
                hMap.get(str[0]).add(str[1]);
            } else {
                hMap.put(str[0], new ArrayList<>(List.of(str[1])));
            }
            i++;
        }
        System.out.println(hMap);
    }
}
