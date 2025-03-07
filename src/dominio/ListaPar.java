package src.dominio;
import java.util.*;
import java.util.stream.*;

public class ListaPar {

    public static List<Integer> listaPar(int hasta){
        return IntStream.range(0, hasta+1).filter(n->n%2==0).boxed().toList();
    }
}
