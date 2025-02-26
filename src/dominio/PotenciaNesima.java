package src.dominio;

import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.*;

public class PotenciaNesima {
    public static int potenciaNesima (int base, int exp) {
        return (IntStream.generate(() -> base).limit(exp).reduce((n1, n2) -> n1 * n2).orElse(1));
    }
}
