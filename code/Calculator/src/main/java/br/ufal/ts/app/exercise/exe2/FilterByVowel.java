package br.ufal.ts.app.exercise.exe2;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.util.Arrays;
import java.util.List;

public class FilterByVowel implements DirectoryStream.Filter {

    final List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');

    @Override
    public boolean accept(Object entry) throws IOException {
        String str = (String) entry;
        return vowels.contains(first(str));
    }

    private char first(String str) {
        return str.charAt(0);
    }
}
