package ch.hesge.algo.model;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import static ch.hesge.algo.model.Alignment.GOOD;

public class Hero extends Super {

    public Hero(String superName, int power, String realName, Hero sidekick, Collection<Move> moves, Vehicle... vehicles) {
        super(superName, power, realName, GOOD, sidekick, moves, vehicles);
    }

    public Hero(String superName, int power, String realName, Hero sidekick, Move move, Vehicle... vehicles) {
        super(superName, power, realName, GOOD, sidekick, move, vehicles);
    }

    public Hero(String superName, int power, String realName, Collection<Move> moves, Vehicle... vehicles) {
        super(superName, power, realName, GOOD, moves, vehicles);
    }

    public Hero(String superName, int power, String realName, Move move, Vehicle... vehicles) {
        super(superName, power, realName, GOOD, move, vehicles);
    }

    public Hero(String superName, int power, Move move, Vehicle... vehicles) {
        super(superName, power, GOOD, move, vehicles);
    }

    @Override
    public Optional<Hero> getSidekick() {
        return super.getSidekick();
    }
}
