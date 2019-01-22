package ch.hesge.algo;

import ch.hesge.algo.model.Alignment;
import ch.hesge.algo.model.Super;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class K {

    /**
     * En utilisant uniquement les streams,
     * grouper les Sidekick des Super en 2 groupes:
     * l'un contient les Sidekick des Hero, l'autre les Sidekick des Villain.
     * La Map comporte 2 clés, Alignment.GOOD et Alignment.EVIL.
     * Les valeurs sont respectivement le Set des Sidekick des Hero et
     * le Set des Sidekick des Villain.
     *
     * Il ne doit pas y avoir de null dans les valeurs de la liste finale et l'absence de Sidekick ne doit pas lancer d'exception au runtime.
     *
     * @param <S> Hero ou Villain
     */
    public <S extends Super> Map<Alignment, Set<Super>> groupVehiclesByHeroesAndVillains(Collection<S> supers) {
        return supers.stream()
                .filter(s -> s.getSidekick().isPresent())
                .map(s -> new Pair(s.getAlignment(), (Super<?>) s.getSidekick().get()))
                .collect(groupingBy(Pair::getAlignment,
                        Collectors.mapping(Pair::getSidekick, toSet())));
    }

    class Pair {
        private final Alignment alignment;
        private final Super<?> sidekick;

        Pair(Alignment alignment, Super<?> sidekick) {
            this.alignment = alignment;
            this.sidekick = sidekick;
        }

        public Alignment getAlignment() {
            return alignment;
        }

        public Super<?> getSidekick() {
            return sidekick;
        }
    }
}
