package Java8.Stream;

import java.util.Arrays;
import java.util.List;

public class TestStream {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(3, 5, 45, 84, 3, 7, 9, 4, 2, 54, 0, 1, 0, 1);
        List<Integer> resultList = integerList.stream().map(x -> x * x).toList();
        System.out.println(resultList);

        List<Integer> filteredList = integerList.stream().filter(x -> x % 2 == 0).toList();
        System.out.println(filteredList);

        List<Integer> mapList = filteredList.stream().map(x -> x / 2).toList();
        System.out.println(mapList);

        List<Integer> list = integerList.stream().filter(x -> x % 2 == 0)
                .map(x -> x / 2)
                .distinct()
                .sorted((a, b) -> b - a)
                .toList();

        System.out.println(list);

    }
}
