package src.dominio;

import java.util.stream.IntStream;

public class Factorial {
    public static int factorial (int n) {
        return (IntStream.rangeClosed(1, n).reduce((num1, num2) -> num1 * num2).orElse(0));
    }
}
