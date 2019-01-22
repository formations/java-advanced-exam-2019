package ch.hesge.algo;

import ch.hesge.algo.model.Super;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class B {

    /**
     * En utilisant uniquement l'API de Collections (sans les streams),
     * retourner dans une collection uniquement les Super qui ont un sidekick.
     *
     * @param supers Collection de supers
     * @param <S>    Hero ou Villain
     */
    public <S extends Super> Collection<S> findSupersWithSidekicks(Collection<S> supers) {
        List<S> supersWithSidekick = new ArrayList<>();
        for (S s : supers) {
            if (s.getSidekick().isPresent()) {
                supersWithSidekick.add(s);
            }

        }
        return supersWithSidekick;
    }
}
