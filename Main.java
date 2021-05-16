package hwNumbers;

import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4));
        numbers.removeIf(x -> x <= 0);
        numbers.removeIf(x -> x%2 != 0);
        numbers.sort(Comparator.naturalOrder());
        System.out.println(Arrays.asList(numbers));
    }
}