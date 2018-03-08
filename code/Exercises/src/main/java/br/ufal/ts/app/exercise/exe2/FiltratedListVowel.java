package br.ufal.ts.app.exercise.exe2;

import java.util.List;
import java.util.stream.Collectors;

public class FiltratedListVowel {

    public List<String> get(List<String> list) {
        FilterByVowel filterByVowel = new FilterByVowel();
        List<String> beginningVowel = list.stream()                // convert list to stream
                .filter(v -> filterByVowel.accept(v))     // we dont like mkyong
                .collect(Collectors.toList());
        return beginningVowel;
    }

}
