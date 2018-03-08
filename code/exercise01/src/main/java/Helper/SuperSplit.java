package Helper;

import utils.MergeStringList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SuperSplit {

    public String get(List<String> list) {
        List<String> result = list.stream().map(v -> format(v)).collect(Collectors.toList());
        MergeStringList mergeStringList = new MergeStringList();
        return mergeStringList.get(result, 0, result.size(), ",");
    }

    private String format(String str) {
        String[] result = str.split(" ");
        List<String> list = new ArrayList<String>(Arrays.asList(result));

        Optional<String> firstName = list.stream().findFirst();
        Optional<String> lastName = list.stream().reduce((first, second) -> second);
        return firstName.get() + lastName.get();
    }
}
