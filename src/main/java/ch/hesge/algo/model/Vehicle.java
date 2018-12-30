package ch.hesge.algo.model;

import java.util.Arrays;
import java.util.Collection;

public class Vehicle {

    private final String name;
    private final Collection<Move> moves;

    public Vehicle(String name, Move... move) {
        this.name = name;
        this.moves = Arrays.asList(move);
    }

    public String getName() {
        return name;
    }

    public Collection<Move> getMoves() {
        return moves;
    }
}
