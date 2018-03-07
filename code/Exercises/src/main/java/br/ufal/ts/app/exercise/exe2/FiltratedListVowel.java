package br.ufal.ts.app.exercise.exe2;

import br.ufal.ts.app.exercise.Exercise;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FiltratedListVowel {

    public List<String> get(List<String> list) throws IOException {
        FilterByVowel filterByVowel = new FilterByVowel();
        List<String> beginningVowel = new ArrayList<String>();
        for (String str : list) {
            if (filterByVowel.accept(str)) {
                beginningVowel.add(str);
            }
        }
        return beginningVowel;
    }

}
