package src.dominio;
import java.util.function.*;

public class Integral {

    public static double integral(DoubleUnaryOperator funcion, double limInf, double limSup, int numeroIntervalos){

        double h = (limSup-limInf)/numeroIntervalos;
        return integralCualquiera(funcion, limInf, limSup, h);

    }

    public static double integralCualquiera(DoubleUnaryOperator funcion, double limInf, double limSup, double h){
        if (Math.abs(limSup-limInf)<0.0001){
            return 0;
        }
        else {
            return integralCualquiera(funcion, limInf+h, limSup, h)+funcion.applyAsDouble(limInf)*h;
        }
    }
}
