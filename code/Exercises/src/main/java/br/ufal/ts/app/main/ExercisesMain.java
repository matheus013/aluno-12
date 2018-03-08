package br.ufal.ts.app.main;

import br.ufal.ts.app.exercise.exe1.MapByFirst;
import br.ufal.ts.app.exercise.exe2.FiltratedListVowel;
import br.ufal.ts.app.exercise.exe3.FiltratedListPairLength;
import br.ufal.ts.app.exercise.exe5.LowercaseList;
import br.ufal.ts.app.exercise.exe6.MergeStringList;
import br.ufal.ts.utils.Helper;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class ExercisesMain {
    public static void main(String[] args) throws IOException {
        MapByFirst map = new MapByFirst(Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot"));
        List<String> list = Arrays.asList("The", "Quick", "BROWN", "Fox", "Jumped", "Over", "The", "LAZY", "DOG");
        FiltratedListVowel filtratedListVowel = new FiltratedListVowel();
        FiltratedListPairLength filterByPairLength = new FiltratedListPairLength();
        LowercaseList lowercaseList = new LowercaseList();
        MergeStringList mergeStringList = new MergeStringList();

        System.out.println("Exercise 1");
        Helper.printFirstLetterByList(map.getAll());

        System.out.println("Exercise 2");
        Helper.printFirstLetterByList(filtratedListVowel.get(map.getAll()));

        System.out.println("Exercise 3");
        Helper.printList(filterByPairLength.get(map.getAll()));

        System.out.println("Exercise 5");
        Helper.printList(lowercaseList.get(list));

        list = Arrays.asList("The", "quick", "brown", "fox", "jumped", "over", "the", "lazy", "dog");
        System.out.println("Exercise 6");
        System.out.println(mergeStringList.get(list, 2, 4, "-"));


    }
}
