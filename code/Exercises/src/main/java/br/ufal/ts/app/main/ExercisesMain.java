package br.ufal.ts.app.main;

import br.ufal.ts.app.exercise.exe1.MapByFirst;
import br.ufal.ts.app.exercise.exe2.FiltratedListVowel;
import br.ufal.ts.app.exercise.exe3.FiltratedListPairLength;
import br.ufal.ts.utils.Helper;

import java.io.IOException;
import java.util.Arrays;

public class ExercisesMain {
    public static void main(String[] args) throws IOException {
        MapByFirst map = new MapByFirst(Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot"));
        FiltratedListVowel filtratedListVowel = new FiltratedListVowel();
        FiltratedListPairLength filterByPairLength = new FiltratedListPairLength();

        System.out.println("Exercise 1");
        Helper.printFirstLetterByList(map.getAll());

        System.out.println("Exercise 2");
        Helper.printFirstLetterByList(filtratedListVowel.get(map.getAll()));

        System.out.println("Exercise 3");
        Helper.printList(filterByPairLength.get(map.getAll()));


    }
}
