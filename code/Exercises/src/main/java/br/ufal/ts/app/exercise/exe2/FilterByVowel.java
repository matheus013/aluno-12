package br.ufal.ts.app.exercise.exe2;

import java.nio.file.DirectoryStream.Filter;
import java.util.Arrays;
import java.util.List;

public class FilterByVowel implements Filter {

    final List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');

    @Override
    public boolean accept(Object entry) {
        String str = (String) entry;
        return vowels.contains(first(str));
    }

    private char first(String str) {
        return str.charAt(0);
    }
}
