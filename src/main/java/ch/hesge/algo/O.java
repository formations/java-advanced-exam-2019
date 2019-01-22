package ch.hesge.algo;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class O {

    /**
     * En utilisant uniquement Stream.generate(),
     * et StatefulSupplier correctement implémenté
     * implémenter la série H de la question N
     */
    public double computeSerie(int n) {
        return Stream.generate(new StatefulSupplier())
                .limit(n)
                .mapToDouble(d -> d[1])
                .sum();
    }

    public static class StatefulSupplier implements Supplier<double[]> {

        private int index = 1;

        @Override
        public double[] get() {
            double[] value = new double[]{ index, 1.0 / index};
            index += 1.0;
            return value;
        }
    }
}
