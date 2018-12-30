package ch.hesge.algo.model;

public class Move {

    private final String name;
    private final int speed;
    private final TransportMode mode;

    public Move(String name, TransportMode mode, int speed) {
        this.name = name;
        this.speed = speed;
        this.mode = mode;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public TransportMode getMode() {
        return mode;
    }
}