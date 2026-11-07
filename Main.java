
public class Main {

    public static void main(String[] args) {

        // Crear un estudiante presencial
        EstudiantePresencial presencial =
                new EstudiantePresencial(
                        "Carlos Lopez",
                        "1001",
                        85,
                        "Aula 3"
                );

        // Crear un estudiante en línea
        EstudianteEnLinea enLinea =
                new EstudianteEnLinea(
                        "Ana Martinez",
                        "1002",
                        95,
                        "Moodle"
                );

        // Mostrar datos del estudiante presencial
        presencial.mostrarDatos();
        presencial.asistirClase();

        System.out.println();

        // Mostrar datos del estudiante en línea
        enLinea.mostrarDatos();
        enLinea.ingresarPlataforma();
    }
}
