package Abstraction;

public class Main {

    public static void main(String[] args) {
       Vehicle vehicle = new Bike(); // reference of abstract class can be created but not object
       vehicle.start();

       Scotter scotter = new Scotter();
       scotter.start();
    }
}
