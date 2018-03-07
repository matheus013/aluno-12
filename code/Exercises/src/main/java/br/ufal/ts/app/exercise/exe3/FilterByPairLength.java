package br.ufal.ts.app.exercise.exe3;

import java.io.IOException;

import static java.nio.file.DirectoryStream.Filter;

public class FilterByPairLength implements Filter {
    @Override
    public boolean accept(Object entry) throws IOException {
        String str = (String) entry;
        return str.length() % 2 == 0;
    }
}
