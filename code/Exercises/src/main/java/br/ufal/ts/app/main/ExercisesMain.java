package br.ufal.ts.app.main;

import br.ufal.ts.app.exercise.exe1.MapByFirst;
import br.ufal.ts.app.exercise.exe2.FiltratedListVowel;
import br.ufal.ts.app.exercise.exe3.FiltratedListPairLength;
import br.ufal.ts.app.exercise.exe5.LowercaseList;
import br.ufal.ts.app.exercise.exe6.MergeStringList;
import br.ufal.ts.utils.Helper;

import java.util.Arrays;
import java.util.List;

public class ExercisesMain {
    public static void main(String[] args) {
        List<Integer> listTwo = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<String> list = Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot");
        MapByFirst map = new MapByFirst(list);
        FiltratedListVowel filtratedListVowel = new FiltratedListVowel();
        FiltratedListPairLength filterByPairLength = new FiltratedListPairLength();
        LowercaseList lowercaseList = new LowercaseList();
        MergeStringList mergeStringList = new MergeStringList();

        System.out.println("Exercise 1");
        Helper.printList(map.getAll());

        System.out.println("Exercise 2");
        Helper.printList(filtratedListVowel.get(list));

        System.out.println("Exercise 3");
        Helper.printList(filterByPairLength.get(list));

        list = Arrays.asList("The", "Quick", "BROWN", "Fox", "Jumped", "Over", "The", "LAZY", "DOG");
        System.out.println("Exercise 5");
        Helper.printList(lowercaseList.get(list));

        list = Arrays.asList("The", "quick", "brown", "fox", "jumped", "over", "the", "lazy", "dog");
        System.out.println("Exercise 6");
        System.out.println(mergeStringList.get(list, 2, 4, "-"));

        Runnable runnable = () -> {
            System.out.println("Exercise 4");
            listTwo.stream().forEach(System.out::println);
        };

        new Thread(runnable).start();

    }
}
