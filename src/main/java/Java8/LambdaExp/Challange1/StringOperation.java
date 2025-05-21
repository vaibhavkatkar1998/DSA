package Java8.LambdaExp.Challange1;


//Question:
//Lambda Challenge 1: Basic Functional Interface Usage
//Create a functional interface called StringOperation that has a method operate(String str).
//Then, write a Java method that accepts a StringOperation and a string, and applies the operation.
//
//Use a lambda expression to:
//
//Convert a given string to uppercase.
//
//Remove all spaces from a given string.
public interface StringOperation {

    public String operator(String str);
}
