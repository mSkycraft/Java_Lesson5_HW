package ru.geekbrains;

import java.util.TreeMap;
import java.util.ArrayList;
import java.util.List;

public final class HW2 {

    public static String[] input = {"Иван Иванов",
                                    "Светлана Петрова",
                                    "Кристина Белова",
                                    "Анна Мусина",
                                    "Анна Крутова",
                                    "Иван Юрин",
                                    "Петр Лыков",
                                    "Павел Чернов",
                                    "Петр Чернышов",
                                    "Мария Федорова",
                                    "Марина Светлова",
                                    "Мария Савина",
                                    "Ио Савина",
                                    "Мария Рыкова",
                                    "Марина Лугова",
                                    "Анна Владимирова",
                                    "Иван Мечников",
                                    "Петр Петин",
                                    "Иван Ежов"};


    public static TreeMap<Integer,List<String>> treeMaper(String[] ipt){
        TreeMap<Integer,List<String>> tMap = new TreeMap<>();
        
        String[] splitStrings;
        for (String string : ipt) {
            splitStrings = string.split(" ");
            if(!tMap.isEmpty()){
                for(int keys : tMap.keySet())
                    if(tMap.get(keys).contains(splitStrings[0])){
                        tMap.get(keys).remove(splitStrings[0]);
                        if(tMap.get(keys).size()==0){
                            tMap.remove(keys);
                        }
                        keys++;
                        if(tMap.containsKey(keys)){
                            tMap.get(keys).add(splitStrings[0]);
                        } else {
                            tMap.put(keys, new ArrayList(List.of(splitStrings[0])));
                        }
                    } else {
                        if(tMap.containsKey(1)){
                            tMap.get(1).add(splitStrings[0]);
                            break;
                        } else {
                            tMap.put(1, new ArrayList(List.of(splitStrings[0])));
                            break;
                        }
                    }
                } else {
                    tMap.put(1, new ArrayList(List.of(splitStrings[0])));
                }
        }
        return tMap;
    }

    public static void main(String[] args) {
        System.out.println(treeMaper(input));
    }
}
