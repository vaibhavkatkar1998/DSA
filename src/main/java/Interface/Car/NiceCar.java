package Interface.Car;

public class NiceCar {

    private Engine engine;
    private MediaPlayer mediaPlayer;

    public NiceCar() {
        this.engine = new PowerEngine();
        this.mediaPlayer = new CDPlayer();
    }

    public NiceCar(Engine engine, MediaPlayer mediaPlayer) {
        this.engine = engine;
        this.mediaPlayer = mediaPlayer;
    }


    public void start() {
        this.engine.start();
    }

    public void stop() {
        this.engine.stop();
    }

    public void mediaStart() {
        this.mediaPlayer.start();
    }

    public void mediaStop() {
        this.mediaPlayer.stop();
    }


    public void upgradeEngine() {
        this.engine = new ElectricEngine();
    }

    public static void main(String[] args) {
        NiceCar niceCar = new NiceCar();
        niceCar.start();
        niceCar.stop();
        niceCar.mediaStart();
        niceCar.mediaStop();

        niceCar.upgradeEngine();
        niceCar.start();
        niceCar.stop();
        niceCar.mediaStart();
        niceCar.mediaStop();

        Engine engine1 = new PowerEngine();
        MediaPlayer mediaPlayer1 = new CDPlayer();
        NiceCar niceCar1 = new NiceCar(engine1,mediaPlayer1);
        niceCar1.start();
        niceCar1.stop();
        niceCar1.mediaStart();
        niceCar1.mediaStop();
    }
}
