package ch.hesge.algo;

import ch.hesge.algo.model.Alignment;
import ch.hesge.algo.model.Super;
import ch.hesge.algo.model.Vehicle;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C {

    /**
     * En utilisant uniquement l'API de Collections (sans les streams),
     * grouper les Vehicle des Super en 2 groupes:
     * l'un contient les Vehicle des Hero, l'autre les Vehicle des Villain.
     * La Map comporte 2 clés, Alignment.GOOD et Alignment.EVIL.
     * Les valeurs sont respectivement le Set des Vehicle qui appartiennent aux Hero et
     * le Set des Vehicle qui appartiennent aux Villain.
     */
    public <S extends Super> Map<Alignment, Set<Vehicle>> groupVehiclesByHeroesAndVillains(Collection<S> supers) {
        return new HashMap<>();
    }
}
