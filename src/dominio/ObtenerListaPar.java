package src.dominio;
import java.util.*;

public class ObtenerListaPar {

    public static List<Integer> obtenerListaPar(List<Integer> lista1){
        return lista1.stream().filter(n->n%2==0).toList();
    }
}
