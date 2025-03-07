package src.dominio.ejercicio17;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Scanner;
import java.util.stream.*;

public class Persona {
    //Nombre, Fecha nacimiento (localdate)
    public String nombre;
    public LocalDate fechaNacimiento;

    public long getEdad () {
        return (Period.between(fechaNacimiento, LocalDate.now()).getYears());
    }
    //Método añadir persona
    public void annadirPersona (Persona persona) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el nombre: ");
        persona.nombre = sc.nextLine();
        System.out.print("Introduce la fecha en formato: yyyy-MM-dd: ");
        persona.fechaNacimiento = LocalDate.parse(sc.nextLine());
    }
    //Método calcular edad
    public Persona elMasJoven (List<Persona> personas) {

    }

    //Método
    public long calcularSumaEdades (List<Persona> personas) {
        return (
                personas.
                        stream().
                        mapToLong(Persona::getEdad).
                        sum()
        );
    }

    public long calcularEdadMinima (List<Persona> personas) {

    }

    public double calcularMediaEdad (List<Persona> personas) {
        return ((double)calcularSumaEdades(personas) / personas.size());
    }
}
