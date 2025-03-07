package src.dominio;

import java.util.stream.IntStream;

public class Suma123n {
    public static int suma123n (int n) {
        return (IntStream.rangeClosed(1,n).sum());
    }
}
