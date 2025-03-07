package src.dominio;
import java.util.*;
import java.util.stream.*;



public class SumaParesLista {

    public static int sumaParesLista(List <Integer> lista1){
        return lista1.stream().filter(n->n%2==0).mapToInt(Integer::intValue).sum();
    }
}
