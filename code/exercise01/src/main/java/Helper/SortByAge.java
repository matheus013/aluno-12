package Helper;

import utils.Person;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SortByAge {
    public List<Person> get(List<Person> list) {

        final List<Person> result = list.stream()
                .sorted((n1, n2) -> n2.getAge() - n1.getAge())
                .collect(Collectors.toList());

        return result;
    }

    public Person max(List<Person> list) {
        Optional<Person> last = list.stream().reduce((first, second) -> second);
        return last.get();
    }

    public Person min(List<Person> list) {
        return list.stream().findFirst().get();
    }
}
