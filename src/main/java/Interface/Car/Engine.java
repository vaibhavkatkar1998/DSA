package Interface.Car;

public interface Engine {

    void start();
    void stop();

    default void test() {
        System.out.println("test");
    }

}
