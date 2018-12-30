package ch.hesge.algo;

import ch.hesge.algo.model.Group;
import ch.hesge.algo.model.Super;

public class M {

    /**
     * En utilisant uniquement les streams,
     * trouver le vainqueur du combat entre 2 Group de Super.
     * 1. Implémenter la méthode Group.getPower()
     * Le power d'un Group est calculé en ajoutant le power du member qui a le power le plus élevé,
     * puis la moitié du power du member qui a le power le 2ème plus élevé,
     * puis le tiers du power du member qui a le power le 3ème plus élevé,
     * etc. (arrondi à l'entier supérieur).
     * 2. A l'aide de la méthode Group.getPower(), retourner le Group qui a le power le plus élevé.
     *
     * @param a Group A
     * @param b Group B
     * @param <S> Hero ou Villain
     */
    public <S extends Super> Group<S> findWinner(Group<S> a, Group<S> b) {
        return null;
    }
}
