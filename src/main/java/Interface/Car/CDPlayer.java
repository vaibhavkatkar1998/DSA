package Interface.Car;

public class CDPlayer implements MediaPlayer{
    @Override
    public void start() {
        System.out.println("CD player starts");
    }

    @Override
    public void stop() {
        System.out.println("CD player stops");
    }
}
