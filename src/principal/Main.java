package principal;

import dominio.*;

public class Main {
    public static void main (String[] argv){

        System.out.println(Suma123n.suma123n(3));
        System.out.println(Factorial.factorial(5));
        System.out.println(PotenciaNesima.potenciaNesima(2, 4));
        System.out.println(Integral.integral(x->Math.exp(Math.pow(x,2)), 0, 1, 100));
    }
}
