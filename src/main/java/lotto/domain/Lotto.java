package lotto.domain;

import java.util.HashSet;
import java.util.List;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException();
        }

        if (new HashSet<>(numbers).size() != numbers.size()) {
            throw new IllegalArgumentException();
        }
    }

    public List<Integer> getLotto() {
        return numbers;
    }

}
