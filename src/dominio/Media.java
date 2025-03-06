package dominio;

import java.util.List;
import java.util.OptionalDouble;

public class Media {
    public static double media (List<Double> listaNumeros) {
        return ((listaNumeros == null || listaNumeros.isEmpty()) ? 0 :
                listaNumeros.stream().
                mapToDouble(Double::doubleValue).
                average().
                orElse(0.0));
    }
}
