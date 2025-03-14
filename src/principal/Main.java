package src.principal;

import src.dominio.*;
import src.dominio.ejercicio17.Persona;

import java.util.*;

public class Main {
    public static void main (String[] argv){

        System.out.println(Matematicas.sumaNumerosConsecutivos(3));
        System.out.println(Matematicas.factorial(5));
        System.out.println(Matematicas.potencia(2, 4));
        System.out.println(Matematicas.integral(x->Math.exp(Math.pow(x,2)), 0, 1, 100));
        System.out.println(Matematicas.sumaParesHasta(11));

        Integer[] array1 = {0,1,2,3,7,2,34,5};
        List <Integer> lista1 = Arrays.asList(array1);
        System.out.println(Matematicas.sumaParesLista(lista1));
        System.out.println(Matematicas.obtenerListaPar(lista1));

        System.out.println(Matematicas.obtenerListaPar(lista1));

        Integer[] arrayVector1 = {1,2,3};
        List <Integer> vector1 = Arrays.asList(arrayVector1);
        Integer[] arrayVector2 = {2,4,6};
        List <Integer> vector2 = Arrays.asList(arrayVector2);
        System.out.println(Matematicas.productoEscalar(vector1, vector2));

        for (int i = 0; i<5; i++) {
            Persona.annadirPersona();
        }
        System.out.println("El mas joven es "+Persona.elMasJoven().nombre +", cuya edad es de " + Persona.calcularEdadMinima() + " annos.");
        System.out.println("La suma de las edades de las personas annadidas es: "+Persona.calcularSumaEdades() +". La media es: " + Persona.calcularMediaEdad());


    }
}
