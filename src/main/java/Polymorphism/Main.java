package Polymorphism;

public class Main {

    public static void main(String[] args) {
        // Method overloading, compile time, static
        // same class, same name, different type of arguments
        // type of arguments, number of arguments
        Numbers numbers = new Numbers();
        // it automatically defines which method to call on the basis of arguments we provides
        numbers.sum(2,3,6);
        numbers.sum(4.5,6); // even though "a" is double it also accepts int value as java cast it internally

        // --------------------------- //

        //Method overriding, runtime, dynamic
        // diff class, same name, same arguments
        Shapes shapes = new Circle();
        shapes.area(3);
        Circle circle = new Circle();
        circle.text(); // static method can be inherited but cannot be override
        Shapes.text(); // more correct way to access static methods

    }
}
