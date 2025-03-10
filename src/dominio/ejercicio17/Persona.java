package src.dominio.ejercicio17;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Scanner;
import java.util.stream.*;
import java.util.*;

public class Persona {
    //Nombre, Fecha nacimiento (localdate)
    public String nombre;
    public LocalDate fechaNacimiento;

    public int getEdad () {
        return (Period.between(fechaNacimiento, LocalDate.now()).getYears());
    }

    public static ArrayList<Persona> personas = new ArrayList<>();

    //Método añadir persona
    public static void annadirPersona () {

        Persona persona = new Persona();

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el nombre: ");
        persona.nombre = sc.nextLine();
        System.out.print("Introduce la fecha en formato: yyyy-MM-dd: ");
        persona.fechaNacimiento = LocalDate.parse(sc.nextLine());
        personas.add(persona);
        System.out.println("Se ha annadido a " + persona.nombre);

    }

    //Método
    public static Persona elMasJoven () {
        return personas.stream().min((persona1, persona2)-> persona1.getEdad()-persona2.getEdad()).orElse(new Persona());
    }

    //Método
    public static long calcularSumaEdades () {
        return (
                personas.
                        stream().
                        mapToLong(Persona::getEdad).
                        sum()
        );
    }

    public static long calcularEdadMinima () {
        return personas.stream().mapToInt(persona->persona.getEdad()).min().orElse(0);
    }

    public static double calcularMediaEdad () {
        return ((double)calcularSumaEdades() / personas.size());
    }
}
