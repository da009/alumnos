import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Write a description of class Alumnos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alumnos
{
    private double random;
    // Almacena el nombre del alumno.
    private String nombre;
    // Almacena el identificador del alumno.
    private int id;
    private ArrayList<String> alumno;

    /**
     * Constructor for objects of class Alumnos
     */
    public Alumnos()
    {
        alumno = new ArrayList<String>();
        this.nombre = nombre;
        id = numRandom();
    }
    
    /**
     * Asigna un valor aleatorio a cada alumno.
     */
    public int numRandom()
    {
        random = Math.random() * ( 9999 - 1000 );
        
        // Solo usa la parte entera del valor double de la variable "random".
        Double d = random;
        Integer i = d.intValue();
        return i;
    }

    public void añadirAlumnosAuto()
    {
        alumno.add("Adeva Tranche, Adrián" + "\\" + id);
        alumno.add("\n Aller González, Francisco Javier" + "\\" + id);
        alumno.add("\n Álvarez Prieto, Noelia" + "\\" + id);
        alumno.add("\n Barrionuevo Pérez, Manuel" + "\\" + id);
        alumno.add("\n Bóveda del Río, José Antonio" + "\\" + id);
        alumno.add("\n de la Viuda Crespo, Ignacio" + "\\" + id);
        alumno.add("\n Encina Maestro, David" + "\\" + id);
        alumno.add("\n Felix Nañez, Kevin" + "\\" + id);
        alumno.add("\n Fernández Diez, Daniel" + "\\" + id);
        alumno.add("\n Fernández González, Javier" + "\\" + id);
        alumno.add("\n Fernández Rincón, Jesús" + "\\" + id);
        alumno.add("\n Fuentes Álvarez, Francisco José" + "\\" + id);
        alumno.add("\n García Juárez, David" + "\\" + id);
        alumno.add("\n García Serrano, Rubén" + "\\" + id);
        alumno.add("\n González Álvarez, David" + "\\" + id);
        alumno.add("\n López Beltrán, Víctor" + "\\" + id);
        alumno.add("\n Lora García, Sandra" + "\\" + id);
        alumno.add("\n Melcón Diez, Víctor" + "\\" + id);
        alumno.add("\n Menéndez Pouso, Francisco José" + "\\" + id);
        alumno.add("\n Pérez Bayón, Álvaro" + "\\" + id);
        alumno.add("\n Pradera San José, Daniel" + "\\" + id);
        alumno.add("\n Prieto Mediavilla, Gabriel" + "\\" + id);
        alumno.add("\n Robles González, Miguel Ángel" + "\\" + id);
        alumno.add("\n Sánchez Manzano, Adán" + "\\" + id);
        alumno.add("\n Serrano García, Verónica" + "\\" + id);
        alumno.add("\n Tascón González, Anibal" + "\\" + id);
    }
    
    public void mostrarAlumnos()
    {
        System.out.println(alumno);
    }
    
    public void deshordenar()
    {
        Collections.shuffle(alumno);
    }
}
