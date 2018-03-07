package br.ufal.ts.app.exercise.exe3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FiltratedListPairLength {
    public List<String> get(List<String> list) throws IOException {
        FilterByPairLength filterByPairLength = new FilterByPairLength();
        List<String> pairLength = new ArrayList<String>();
        for (String str : list) {
            if (filterByPairLength.accept(str)) {
                pairLength.add(str);
            }
        }
        return pairLength;
    }
}
