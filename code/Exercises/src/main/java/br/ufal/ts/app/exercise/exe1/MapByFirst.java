package br.ufal.ts.app.exercise.exe1;

import java.util.ArrayList;
import java.util.List;

public class MapByFirst {
    protected ArrayList<String> list;

    public MapByFirst(List<String> list) {
        final ArrayList<String> result = new ArrayList<>();
        list.stream().forEach((v) -> result.add(String.valueOf(v.charAt(0))));
        this.list = result;
    }

    private int toIndex(char c) {
        return c - 'a';
    }


    public String get(char c) {
        return this.list.get(toIndex(c));
    }

    public int size() {
        return this.list.size();
    }

    public ArrayList<String> getAll() {
        return this.list;
    }

}
