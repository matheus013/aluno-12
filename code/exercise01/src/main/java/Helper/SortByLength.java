package Helper;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SortByLength {

    public List<String> get(List<String> list) {

        final List<String> result = list.stream()
                .sorted((n1, n2) -> n2.length() - n1.length())
                .collect(Collectors.toList());

        return result;
    }

    public String max(List<String> list) {
        Optional<String> last = list.stream().reduce((first, second) -> second);
        return last.get();
    }

    public String min(List<String> list) {
        return list.stream().findFirst().get();
    }
}
