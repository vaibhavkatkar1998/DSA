package Inheritance;

public class Main {

    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        tiger.sound = "abc";
        tiger.pattern = "xyz";
        System.out.println(tiger);
        tiger.genericSound();


        Animal animal = new Tiger(); // it will have only fields from animal that is parent, because object is created from animal
    }
}
