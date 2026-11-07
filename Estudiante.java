
public class Estudiante {

    // Atributos de la clase base
    private String nombre;
    private String matricula;
    private double calificacion;

    // Constructor de la clase Estudiante
    public Estudiante(String nombre, String matricula, double calificacion) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.calificacion = calificacion;
    }

    // Método para mostrar los datos del estudiante
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Matricula: " + matricula);
        System.out.println("Calificacion: " + calificacion);
        System.out.println("Resultado: " + obtenerResultado());
    }

    // Método para determinar si aprobó o reprobó
    public String obtenerResultado() {
        if (calificacion >= 70) {
            return "APROBADO";
        } else {
            return "REPROBADO";
        }
    }
}
