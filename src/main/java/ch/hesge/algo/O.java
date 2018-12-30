package ch.hesge.algo;

import java.util.function.Supplier;

public class O {

    /**
     * En utilisant uniquement Stream.generate(),
     * et StatefulSupplier correctement implémenté
     * implémenter la série H de la question N
     */
    public double computeSerie(int n) {
        return 0.0;
    }

    public static class StatefulSupplier implements Supplier<double[]> {

        private int index = 1;

        @Override
        public double[] get() {
            return new double[]{0.0, 0.0}; // A remplacer par l'implémentation correcte
        }
    }
}
