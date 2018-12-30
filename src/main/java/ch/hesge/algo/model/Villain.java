package ch.hesge.algo.model;

import java.util.Collection;

import static ch.hesge.algo.model.Alignment.EVIL;

public class Villain extends Super {

    public Villain(String superName, int power, String realName, Villain sidekick, Collection<Move> moves, Vehicle... vehicles) {
        super(superName, power, realName, EVIL, sidekick, moves, vehicles);
    }

    public Villain(String superName, int power, String realName, Villain sidekick, Move move, Vehicle... vehicles) {
        super(superName, power, realName, EVIL, sidekick, move, vehicles);
    }

    public Villain(String superName, int power, String realName, Collection<Move> moves, Vehicle... vehicles) {
        super(superName, power, realName, EVIL, moves, vehicles);
    }

    public Villain(String superName, int power, String realName, Move move, Vehicle... vehicles) {
        super(superName, power, realName, EVIL, move, vehicles);
    }

    public Villain(String superName, int power, Move move, Vehicle... vehicles) {
        super(superName, power, EVIL, move, vehicles);
    }

    @Override
    public Villain getSidekick() {
        return (Villain) super.getSidekick();
    }
}
