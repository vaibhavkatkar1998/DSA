package Interface;

public interface Hello2 {

    void greet();

    default void sayHello() {
        System.out.println("Hello from 2");
    }

}
