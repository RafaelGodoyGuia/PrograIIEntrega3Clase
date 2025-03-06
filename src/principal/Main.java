package principal;

import dominio.*;
import java.util.*;

public class Main {
    public static void main (String[] argv){

        System.out.println(Suma123n.suma123n(3));
        System.out.println(Factorial.factorial(5));
        System.out.println(PotenciaNesima.potenciaNesima(2, 4));
        System.out.println(Integral.integral(x->Math.exp(Math.pow(x,2)), 0, 1, 100));
        System.out.println(SumaPares.sumaPares(11));

        Integer[] array1 = {0,1,2,3,7,2,34,5};
        List <Integer> lista1 = Arrays.asList(array1);
        System.out.println(SumaParesLista.sumaParesLista(lista1));
        System.out.println(ObtenerListaPar.obtenerListaPar(lista1));

        System.out.println(ListaPar.listaPar(14));
    }
}
