package Java8.LambdaExp.Challange2;

//Lambda Challenge 2: Filtering with Lambdas
//Create a functional interface PersonFilter with a method boolean test(Person p).
//Write a method that accepts a List<Person> and a PersonFilter, and returns a list of people who satisfy the filter condition.
//Use lambda expressions to:
//Get all people older than 25.
//Get all people whose names start with "A".
@FunctionalInterface
public interface PersonFilter {

    public boolean test(Person p);

}
