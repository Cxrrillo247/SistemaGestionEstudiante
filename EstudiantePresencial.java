
public class EstudiantePresencial extends Estudiante {

    // Atributo exclusivo de esta clase
    private String aula;

    // Constructor que utiliza el constructor de la clase base
    public EstudiantePresencial(String nombre, String matricula,
                                double calificacion, String aula) {

        super(nombre, matricula, calificacion);
        this.aula = aula;
    }

    // Sobrescritura del método mostrarDatos
    @Override
    public void mostrarDatos() {

        System.out.println("--- ESTUDIANTE PRESENCIAL ---");

        // Reutilizar el método de la clase base
        super.mostrarDatos();

        System.out.println("Aula: " + aula);
    }

    // Método exclusivo de estudiante presencial
    public void asistirClase() {
        System.out.println("El estudiante asiste a clases presenciales.");
    }
}
