package Inheritance;

public class Animal {

    String sound;

    int weight;

    void sound(String specificSound) {
        System.out.println("Animal Sound " + specificSound);
    }

    @Override
    public String toString() {
        return sound + " " + weight;
    }

}
