package src.dominio;
import java.util.Comparator;
import java.util.stream.*;

public class Fibonacci {

    public long act;
    public long sig;
    public int n;

    public Fibonacci(){
        act = 0;
        sig = 1;
        n = 0;
    }

    public Fibonacci next (){

        Fibonacci f = new Fibonacci();

        sig = sig + act;
        act = sig;
        n = n + 1;

        return f;
    }

    public void generarSucesion(int n){
        //f es el objeto de la expresión lambda, y provocamos, para que sea una expresión lambda, que sea un objeto Fibonacci con next
        //Como tenemos evaluación perezosa, no se genera el stream, pero TAMPOCO se desborda la pila, ya que no se genera hasta llegar al final.
        Stream.iterate(new Fibonacci(), f->f.next()).limit(n+1).forEach(f->System.out.print(f.act));
        //Otra opción
        long term = Stream.iterate(new Fibonacci(), f->f.next()).limit(n+1).mapToLong(f->f.act).max().orElse(0);
        System.out.println(term);
        //Otra opción
        long term1 = Stream.iterate(new Fibonacci(), f->f.next()).limit(n+1).skip(n).findFirst().get().act;
        System.out.println(term1);
    }

    /*
     * public void generarSucesionConArray(){
     *         Stream.iterate(long[] array1 = {0,1}, t->long[] array 2 = {t[1], t[0]+t[1]})
     *     }
     */



}
