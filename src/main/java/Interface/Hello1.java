package Interface;

public interface Hello1 {

    public static final String TYPE = "abc";

    void greet();

    default void sayHello() {
        System.out.println("Hello from 1");
    }

}
