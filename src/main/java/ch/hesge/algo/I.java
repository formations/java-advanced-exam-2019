package ch.hesge.algo;

import ch.hesge.algo.model.Group;
import ch.hesge.algo.model.Super;

import java.util.Collection;
import java.util.Comparator;

public class I {

    /**
     * En utilisant uniquement les streams,
     * retourner le Group qui comporte le plus de membres.
     *
     * @param groups Collection de Group
     * @param <S> Hero ou Villain
     */
    public <S extends Super> Group<S> findGroupWithHighestNumberOfMembers(Collection<Group<S>> groups) {
        return groups.stream()
                .max(Comparator.comparing(g -> g.getMembers().size()))
                .get();
    }
}
