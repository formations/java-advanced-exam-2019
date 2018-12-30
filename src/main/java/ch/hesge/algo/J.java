package ch.hesge.algo;

import ch.hesge.algo.model.Super;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class J {

    /**
     * En utilisant uniquement les streams,
     * retourner dans une collection uniquement les Super qui ont un sidekick.
     *
     * @param supers Collection de supers
     * @param <S>    Hero ou Villain
     */
    public <S extends Super> Collection<S> findSupersWithSidekicks(Collection<S> supers) {
        return new ArrayList<>();
    }
}
