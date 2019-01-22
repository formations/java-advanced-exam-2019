package ch.hesge.algo;

import ch.hesge.algo.model.Group;
import ch.hesge.algo.model.Super;
import ch.hesge.algo.model.TransportMode;

public class D {

    /**
     * En utilisant uniquement l'API de Collections (sans les streams),
     * trouver dans un Group le membre le plus rapide sur la terre.
     * 1. Implémenter la méthode Super.getSpeed(TransportMode)
     * La vitesse d'un Super est calculée en prenant la speed maximum de ses Move, et des Move de ses Vehicle pour le TransportMode.
     * 2. A l'aide de cette méthode, trouver qui a la speed la plus élevée sur terre (LAND).
     *
     * @param group Group to find fastest member from
     * @param <S> Hero ou Villain
     */
    public <S extends Super> S findFastestMemberOnLand(Group<S> group) {
        S fastestSuperOnLand = null;
        for (S s : group.getMembers()) {
            if (fastestSuperOnLand == null) {
                fastestSuperOnLand = s;
            } else if (s.getSpeed(TransportMode.LAND) > fastestSuperOnLand.getSpeed(TransportMode.LAND)) {
                fastestSuperOnLand = s;
            }
        }
        return fastestSuperOnLand;
    }
}
