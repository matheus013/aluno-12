package br.ufal.ts.app.exercise.exe1;

import br.ufal.ts.app.exercise.Exercise;
import br.ufal.ts.utils.Helper;

import java.util.ArrayList;
import java.util.List;

public class MapByFirst implements Exercise {
    protected ArrayList<String> list;

    public MapByFirst(List<String> list) {
        this.list = init(list.size());
        for (String str : list) {
            this.list.set(toIndex(str), str);
        }

    }

    private int toIndex(String str) {
        char c = str.charAt(0);
        return c - 'a';
    }

    private int toIndex(char c) {
        return c - 'a';
    }

    private ArrayList<String> init(int size) {
        ArrayList<String> array = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            array.add("");
        }
        return array;
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


    @Override
    public void result() {
        Helper.printFirstLetterByList(this.list);
    }
}
