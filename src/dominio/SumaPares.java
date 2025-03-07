package src.dominio;

import java.util.stream.IntStream;

public class SumaPares {
    public static int sumaPares(int hasta) {
        return (
                IntStream.iterate(0, n -> n + 2).limit((hasta+2)/2).reduce((int num1, int num2) -> (num1+num2)).orElse(0));
    }
}
