package ch.hesge.algo;

import ch.hesge.algo.model.Group;
import ch.hesge.algo.model.Super;

import java.util.Collection;
import java.util.HashSet;

public class H {

    /**
     * En utilisant uniquement l'API de Collections (sans les streams),
     * retourner la liste des membres qui appartiennent à la fois aux Group a & b.
     *
     * @param a Group a
     * @param b Group b
     * @param <S> Hero ou Villain
     */
    public <S extends Super> Collection<S> findCommonMembers(Group<S> a, Group<S> b) {
        return new HashSet<>();
    }
}
