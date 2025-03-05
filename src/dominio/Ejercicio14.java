package src.dominio;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.Random;

public class Ejercicio14 {
    public static IntStream generarStreamNumerosConOf() {
        return (IntStream.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)); //Genera IntStream del 0 al 9
    }

    public static IntStream generarStreamNumerosConRange() {
        return (IntStream.range(0, 10)); //Genera IntStream del 0 al 9
    }

    public static IntStream generarStreamNumerosConIterate() {
        return (IntStream.iterate(0, n-> n+ 1).limit(9)); //Genera IntStream del 0 al 9
    }

    public static DoubleStream generarStreamNumerosConRandom() {
        Random random = new Random()
        return (random.doubles(10, 0, 9)); //Genera DoubleStream con números ale
    }
}
