package src.dominio;

import java.util.stream.IntStream;

public class SumaPares {
    public static int sumaPares(int hasta) {
        return (
                (n < 2) ? 0 :
                    IntStream.iterate(2, n -> n + 2).
                            limit(hasta).
                            reduce(0, Integer::sum)
                );
    }
}
