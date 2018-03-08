package utils;

import Helper.SortByVowel;

import java.util.List;
import java.util.stream.Collectors;

public class ToPerson {

    public List<Person> get(List<String> list) {
        List<Person> result = list.stream().map(v -> new Person(v, getAge(v))).collect(Collectors.toList());
        return result;
    }

    private int getAge(String name) {
        return (name.length() - SortByVowel.countVowel(name)) * 3;
    }
}
