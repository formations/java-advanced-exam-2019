package ch.hesge.algo.model;

import java.util.*;

public class Super<S extends Super> {

    private final String superName;
    private final int power;
    private final String realName;
    private final Alignment alignment;
    private final S sidekick;
    private final Set<Move> moves;
    private final Set<Vehicle> vehicles;

    public Super(String superName,
                 int power,
                 String realName,
                 Alignment alignment,
                 S sidekick,
                 Collection<Move> moves,
                 Vehicle... vehicles) {
        this.superName = superName;
        this.power = power;
        this.realName = realName;
        this.alignment = alignment;
        this.sidekick = sidekick;
        this.moves = new HashSet<>(moves);
        this.vehicles = new HashSet<>(Arrays.asList(vehicles));
    }

    public Super(String superName,
                 int power,
                 String realName,
                 Alignment alignment,
                 S sidekick,
                 Move move,
                 Vehicle... vehicles) {
        this(superName, power, realName, alignment, sidekick, Collections.singletonList(move), vehicles);
    }

    public Super(String superName,
                 int power,
                 String realName,
                 Alignment alignment,
                 Collection<Move> moves,
                 Vehicle... vehicles) {
        this(superName, power, realName, alignment, null, moves, vehicles);
    }

    public Super(String superName,
                 int power,
                 String realName,
                 Alignment alignment,
                 Move move,
                 Vehicle... vehicles) {
        this(superName, power, realName, alignment, null, Collections.singletonList(move), vehicles);
    }

    public Super(String superName,
                 int power,
                 Alignment alignment,
                 Move move,
                 Vehicle... vehicles) {
        this(superName, power, null, alignment, null, Collections.singletonList(move), vehicles);
    }

    public Alignment getAlignment() {
        return alignment;
    }

    public Set<Move> getMoves() {
        return moves;
    }

    public int getSpeed(TransportMode mode) {
        int intrisicSpeed = 0;
        for (Move move : moves) {
            if (move.getMode() == mode) {
                intrisicSpeed = move.getSpeed();
                break;
            }
        }
        int vehicleSpeed = 0;
        out: for (Vehicle vehicle : vehicles) {
            for (Move move : vehicle.getMoves()) {
                if (move.getMode() == mode) {
                    vehicleSpeed = move.getSpeed();
                    break out;
                }
            }
        }
        return Math.max(intrisicSpeed, vehicleSpeed);
    }

    public String getSuperName() {
        return superName;
    }

    public int getPower() {
        return power;
    }

    public Optional<String> getRealName() {
        return Optional.ofNullable(realName);
    }

    public Optional<S> getSidekick() {
        return Optional.ofNullable(sidekick);
    }

    public Set<Vehicle> getVehicles() {
        return vehicles;
    }
}
