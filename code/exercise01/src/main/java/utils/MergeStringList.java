package utils;

import java.util.List;
import java.util.stream.Collectors;

public class MergeStringList {
    public String get(List<String> list, int start, int end, String separator) {
        FilterPosition filterPosition = new FilterPosition(list);
        List<String> partialResult = list.stream()
                .filter(v -> filterPosition
                        .setPosition(start, end)
                        .accept(v))
                .collect(Collectors.toList());
        String result = String.join(separator, partialResult);

        return result;
    }
}
