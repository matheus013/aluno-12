package br.ufal.ts.app.exercise.exe6;

import java.util.List;

public class MergeStringList {
    public String get(List<String> list, int start, int end, String separator) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += list.get(i);
            if (i != end) {
                result += separator;
            }
        }
        return result;
    }
}
