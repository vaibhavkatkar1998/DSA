package Java8.Stream;

import java.util.*;
import java.util.stream.*;

public class TestStream {

    public static void main(String[] args) {

        practiceCode();
        //challenge 1
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 30, 60000),
                new Employee("Bob", 24, 45000),
                new Employee("Charlie", 28, 52000),
                new Employee("David", 35, 48000),
                new Employee("Eve", 40, 75000)
        );

        //challenge 1
        List<Employee> empList = employees.stream().filter(x -> x.getSalary() > 50000).collect(Collectors.toList());
        System.out.println(empList);

        //challenge 2
        List<String> empList2 = employees.stream()
                .filter(x -> x.getAge() < 35)
                .map(x->x.getName())
                .collect(Collectors.toList());
        System.out.println(empList2);

        //challenge 3
        Optional<Employee> employee = employees.stream().max(Comparator.comparingDouble(x->x.getSalary()));
        System.out.println(employee.get());

        //challenge 4
        Map<Integer, List<Employee>> collect = employees.stream().collect(Collectors.groupingBy(x -> x.getAge()));
        System.out.println(collect);

        //challenge 5
        Double collect1 = employees.stream().collect(Collectors.averagingDouble(x -> x.getSalary()));
        System.out.println(collect1);

        // challenge 6
        Map<String, Double> collect2 = employees
                .stream()
                .collect(Collectors.toMap(x -> x.getName(),x -> x.getSalary(),(x,y)->x + y));
        System.out.println(collect2);

    }

    private static void practiceCode() {
        // stream of list
        List<String> list = Arrays.asList("a","c","d","i");
        Stream<String> stream = list.stream();
        // stream of array
        String[] array = {"abc","xyz","pkw"};
        Stream<String> stream1 = Arrays.stream(array);
        // Stream by stream
        Stream<Integer> integerStream = Stream.of(1, 4, 6, 8, 8);
        // infinite stream or with limit
        List<Integer> list1 = Stream.generate(() -> 100).limit(100).toList();

        // Parallel Stream works with cpu intensive task, large data set
        // parallel stream cannot be used if stream values are interdependent
        List<Integer> list2 = Stream.iterate(1, x -> x + 1).limit(200000).toList();
        List<Integer> list3 = list2.parallelStream().map(x -> x * 2).toList();

    }
}
