package Java8.LambdaExp;

import Java8.LambdaExp.Challange1.StringOperation;
import Java8.LambdaExp.Challange2.Person;
import Java8.LambdaExp.Challange2.PersonFilter;
import Java8.LambdaExp.Challenge5.DataTransformer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaMain {

    // Challenge 1
    private String performStringOperation(String str, StringOperation stringOperation) {
        return stringOperation.operator(str);
    }

    // Challenge 2
    private List<Person> performListOperation(List<Person> people, PersonFilter personFilter) {
        // efficient solution
        return people.stream()
                .filter(personFilter::test)
                .toList();
        // non-efficient solution
//        List<Person> resultList = new ArrayList<>();
//        for (Person people1 : people) {
//            if(personFilter.test(people1)) {
//                resultList.add(people1);
//            }
//        }
//        return resultList;
    }

    // Challenge 3
    private String performStringCompose(String str, Function<String, String> functionCompose1, Function<String, String> functionCompose2) {
        Function<String,String> result =  functionCompose1.compose(functionCompose2);
        //Function<String,String> result =  functionCompose1.andThen(functionCompose2); // provide same result as compose
        return result.apply(str);
    }

    // Challenge 5
    public <T> T customDataTransFormer(T input, DataTransformer<T> dataTransformer) {
        return dataTransformer.transform(input);
    }



    public static void main(String[] args) {
        LambdaMain main = new LambdaMain();

        // Challenge 1
        StringOperation upperCase = s -> s.toUpperCase();
        StringOperation removeWhiteSpaces = s -> s.replaceAll(" ", "");
        System.out.println(main.performStringOperation("abc",upperCase));
        System.out.println(main.performStringOperation("x y z",removeWhiteSpaces));

        // Challenge 2
        PersonFilter ageFilter = p -> p.getAge() > 25;
        PersonFilter nameFilter = p -> p.getName().startsWith("A");

        List<Person> personList = List.of(new Person("Vaibhav", 27),new Person("Amit",26), new Person("Vikas",3));
        System.out.println(main.performListOperation(personList,ageFilter));
        System.out.println(main.performListOperation(personList,nameFilter));

        // challenge 3
        Function<String, String> trim = s -> s.trim();
        Function<String, String> toUpperCase = s -> s.toUpperCase();

        System.out.println(main.performStringCompose(" test",trim,toUpperCase));

        // challenge 4
        Predicate<Person> agePredicate = x -> x.getAge() > 18;
        Predicate<Person> namePredicate = x -> x.getName().startsWith("A");

        List<Person> list = personList.stream().filter(agePredicate.and(namePredicate)).toList();
        System.out.println(list);
        List<Person> list1 = personList.stream().filter(agePredicate.or(namePredicate)).toList();
        System.out.println(list1);
        List<Person> list2 = personList.stream().filter(agePredicate.negate()).toList();
        System.out.println(list2);

        // challenge 5
        DataTransformer<String> customStringTransformer = String::toUpperCase;
        DataTransformer<Integer> integerDataTransformer = i -> i * i;
        System.out.println(main.customDataTransFormer("abc",customStringTransformer));
        System.out.println(main.customDataTransFormer(43,integerDataTransformer));


    }


}
