package ch.hesge.algo;

import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class N {

    /**
     * En utilisant uniquement les streams sauf Stream.generate(),
     * retourner pour un entier n, la série H suivante:
     * pour 1, H(1) = 1
     * pour 2, H(1) + 1/2 = 1.5
     * pour 3, H(1) + H(2) + 1/3 = 1.83333
     * pour un terme i quelconque, H(1) + H(2) ... + H(i - 1) + 1/i
     */
    public double computeSerie(int n) {
        return Stream.iterate(new Pair(1, 1), p -> new Pair(p.index + 1, 1.0 / (p.index + 1)))
                .limit(n)
                .mapToDouble(p -> p.value)
                .sum();
    }

    class Pair {
        private final int index;
        private final double value;

        Pair(int index, double value) {
            this.index = index;
            this.value = value;
        }
    }
}
