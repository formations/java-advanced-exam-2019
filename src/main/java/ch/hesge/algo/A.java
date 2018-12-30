package ch.hesge.algo;

import ch.hesge.algo.model.Group;
import ch.hesge.algo.model.Super;

import java.util.Collection;

public class A {

    /**
     * En utilisant uniquement l'API de Collections (sans les streams),
     * retourner le Group qui comporte le plus de membres.
     *
     * @param groups Collection de Group
     * @param <S> Hero ou Villain
     */
    public <S extends Super> Group<S> findGroupWithHighestNumberOfMembers(Collection<Group<S>> groups) {
        return null;
    }
}
