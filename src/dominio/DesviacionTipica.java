package dominio;

import java.util.List;
import java.util.stream.DoubleStream;

import java.lang.Math;

public class DesviacionTipica {
    public static double desviacionTipica(List<Double> listaNumeros) {
        double media = Media.media(listaNumeros);
        DoubleStream streamNumeros = listaNumeros.stream().mapToDouble(Double::doubleValue);
        DoubleStream streamDesviaciones = streamNumeros.map(n -> n - media);
        DoubleStream streamCuadrados = streamDesviaciones.map(n -> Math.pow(n, 2));
        return (Math.sqrt(streamCuadrados.sum() / streamCuadrados.count()));
    }
}
