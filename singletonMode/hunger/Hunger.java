package singletonMode.hunger;

public class Hunger {
    private static Hunger instance = new Hunger();

    private Hunger() {
    }

    public static Hunger getInstance() {
        return instance;
    }
}