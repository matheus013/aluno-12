package br.ufal.ts.utils;

import java.util.List;

public class Helper {

    public static void printFirstLetterByList(List<String> list) {
        System.out.printf("[");
        for (String str : list) {
            System.out.printf(String.valueOf(str.charAt(0)));
            if (list.indexOf(str) != list.size() - 1) {
                System.out.printf(",");
            }
        }
        System.out.println("]");

    }

    public static void printList(List<String> list) {
        list.stream().forEach(System.out::println);

    }
}
