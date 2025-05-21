package Interface;

import java.sql.SQLOutput;

public class Main implements Hello1, Hello2{

    @Override
    public void greet() {
        System.out.println("Hello");
    }

    // accessing same name, same parameter default method
    @Override
    public void sayHello() {
        Hello2.super.sayHello(); // we can also use Hello1.super to access Hello1 class sayHello method
        // we can also add our own implementation
        System.out.println("test");
    }


    public static void main(String[] args) {
        Hello1 main = new Main();
        main.greet();
    }
}
