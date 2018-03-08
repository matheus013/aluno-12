package br.ufal.ts.app.exercise.exe3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FiltratedListPairLength {
    public List<String> get(List<String> list) {
        FilterByPairLength filterByPairLength = new FilterByPairLength();
        List<String> pairLength = list.stream()                // convert list to stream
                .filter(v -> filterByPairLength.accept(v))     // we dont like mkyong
                .collect(Collectors.toList());

        return pairLength;
    }
}
