package Inheritance;

public class Tiger extends Animal {
    String pattern;

    public Tiger () {
    }

    public Tiger(String sound, int weight, String pattern) {
        this.sound = sound;
        this.weight = weight;
        this.pattern = pattern;
    }

    void genericSound() {
        super.sound("Growl");
    }

    @Override
    public String toString() {
        // return super.sound + " " + super.weight + " " + pattern; // this will also work
        return super.toString() + " " + pattern; // this will directly call parent class to string method
    }


}
