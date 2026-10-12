
/**
 * Programa principal del sistema de estudiantes.
 */
public class Main {

    public static void main(String[] args) {

        // Creamos dos objetos de tipo Estudiante
        Estudiante estudiante1 =
                new Estudiante("Reynaldo Ramirez", "105818", 85);

        Estudiante estudiante2 =
                new Estudiante("Ana Garcia", "A002", 65);

        // Mostramos los datos del primer estudiante
        System.out.println("=== ESTUDIANTE 1 ===");
        estudiante1.mostrarDatos();
        System.out.println("Resultado: "
                + estudiante1.obtenerResultado());

        // Mostramos los datos del segundo estudiante
        System.out.println("\n=== ESTUDIANTE 2 ===");
        estudiante2.mostrarDatos();
        System.out.println("Resultado: "
                + estudiante2.obtenerResultado());
    }
}