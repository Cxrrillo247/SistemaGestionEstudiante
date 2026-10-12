
/**
 * Clase que representa a un estudiante.
 * Guarda sus datos y permite consultar su resultado.
 */
public class Estudiante {

    // Atributos del estudiante
    private String nombre;
    private String matricula;
    private double calificacion;

    /**
     * Constructor para inicializar los datos.
     */
    public Estudiante(String nombre, String matricula,
                      double calificacion) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.calificacion = calificacion;
    }

    /**
     * Muestra los datos del estudiante.
     */
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Matricula: " + matricula);
        System.out.println("Calificacion: " + calificacion);
    }

    /**
     * Indica si el estudiante aprobo o reprobo.
     */
    public String obtenerResultado() {
        if (calificacion >= 70) {
            return "APROBADO";
        } else {
            return "REPROBADO";
        }
    }
}