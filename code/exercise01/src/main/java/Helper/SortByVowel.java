package Helper;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortByVowel {
    final static List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');

    public List<String> get(List<String> list) {

        final List<String> result = new ArrayList<>(list);
        result.sort((n1, n2) -> countVowel(n1) - countVowel(n2));

        return result;
    }

    public String max(List<String> list) {
        Optional<String> last = list.stream().reduce((first, second) -> second);
        return last.get();
    }

    public String min(List<String> list) {
        return list.stream().findFirst().get();
    }

    public static int countVowel(String str) {
        List<Character> charList = str.chars().mapToObj(e -> (char) e).collect(Collectors.toList());
        List<Character> vowelList = charList.stream()
                .filter(v -> vowels.contains(v))
                .collect(Collectors.toList());
        return vowelList.size();
    }
}
