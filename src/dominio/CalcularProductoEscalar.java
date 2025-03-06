package dominio;
import java.util.*;
import java.util.stream.*;

public class CalcularProductoEscalar {

    public static int calcularProductoEscalar(List <Integer> vector1, List <Integer> vector2){
        IntStream stream1 = vector1.stream().mapToInt(Integer::intValue);

        IntStream productoEscalar = stream1.map(n->n*vector2.get(n-1));

        return productoEscalar.sum();

    }
}
