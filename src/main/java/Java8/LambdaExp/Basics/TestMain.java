package Java8.LambdaExp.Basics;

import Interface.Main;
import Java8.LambdaExp.Challange2.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.function.Predicate;

public class TestMain {

    public static void main(String[] args) {
        TestMain main = new TestMain();

        // Lambda Exp with functional interface
        TestFunctionalInterface testFunctionalInterface = s -> System.out.println(s);
        testFunctionalInterface.printName("Vaibhav");
        testFunctionalInterface.printName("Ganesh");

        //  Thread with lambda
        Runnable runnable = () -> {
            for (int i = 0; i <= 10; i++) {
                System.out.println(i);
            }
        };
        Thread thread = new Thread(runnable);;
        thread.start();

        // Comparator using lambda exp
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(7);
        list.add(9);
        list.add(2);
        Collections.sort(list, (a,b) -> b-a); // same can be use with all collection
        System.out.println(list);

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Vaibhav", 27));
        personList.add(new Person("Amit",26));
        personList.add(new Person("Vikas",3));

        Collections.sort(personList, (a,b) -> b.getAge() - a.getAge());
        System.out.println(personList);

        // predicate
        Predicate<String> stringPredicate = s -> s.startsWith("V");
        Predicate<Integer> integerPredicate = i -> i.equals(12);
        Predicate<String> stringPredicate1 = s -> s.endsWith("V".toLowerCase(Locale.ROOT));
        Predicate<String> andPredicate = stringPredicate.and(stringPredicate1); // and, or predicate
        System.out.println(andPredicate.test("Vaibhav"));
        System.out.println(integerPredicate.test(13));

        // function
        Function<String, String> stringFunction = s -> s.substring(0,3);
        Function<String, String> stringFunction1 = s -> s.toUpperCase();

        Function<String, String> stringStringFunction = stringFunction.andThen(stringFunction1); // run in sequence
        Function<String, String> stringStringFunction1 = stringFunction.compose(stringFunction1); // stringFunction1 runs first and then stringFunction
        System.out.println(stringStringFunction.apply("Vaibhav"));
        System.out.println(stringStringFunction1.apply("Vaibhav"));

    }
}
