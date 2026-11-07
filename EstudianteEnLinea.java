
public class EstudianteEnLinea extends Estudiante {

    // Atributo exclusivo de esta clase
    private String plataforma;

    // Constructor que utiliza el constructor de la clase base
    public EstudianteEnLinea(String nombre, String matricula,
                             double calificacion, String plataforma) {

        super(nombre, matricula, calificacion);
        this.plataforma = plataforma;
    }

    // Sobrescritura del método mostrarDatos
    @Override
    public void mostrarDatos() {

        System.out.println("--- ESTUDIANTE EN LINEA ---");

        // Reutilizar el método de la clase base
        super.mostrarDatos();

        System.out.println("Plataforma: " + plataforma);
    }

    // Método exclusivo de estudiante en línea
    public void ingresarPlataforma() {
        System.out.println("El estudiante ingresa a su plataforma virtual.");
    }
}
