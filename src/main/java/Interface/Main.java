package Interface;

public class Main implements Hello1, Hello2{

    @Override
    public void greet() {
        System.out.println("Hello");
    }


    public static void main(String[] args) {
        Hello1 main = new Main();
        main.greet();
    }
}
