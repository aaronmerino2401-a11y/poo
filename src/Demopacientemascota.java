import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Scanner;

public class Demopacientemascota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<PacienteMascota> pacientes = new ArrayList<>();

        int anioActual = LocalDate.now().getYear();
        LocalDate pacientecanino = LocalDate.of(anioActual, Month.APRIL, 15);
        LocalDate pacientefe = LocalDate.of(anioActual, Month.MAY, 10);
        LocalDate exoticos = LocalDate.of(anioActual, Month.JUNE, 5);

        Especie[] especies = Especie.values();
        LocalDate[] fechas = {pacientecanino, pacientefe, exoticos};

        System.out.println("--- Registro de pacientes mascota ---");

        for (int i = 0; i < especies.length; i++) {
            System.out.println("\nIngrese los datos para el paciente " + especies[i] + ":");

            System.out.print("Nombre de la mascota: ");
            String nombremascota = scanner.nextLine();

            System.out.print("Peso (kg): ");
            int peso = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            System.out.print("Nombre del dueño: ");
            String nombredeldueno = scanner.nextLine();

            pacientes.add(new PacienteMascota(nombredeldueno, nombremascota, peso, especies[i], fechas[i]));
        }

        boolean salir = false;
        while (!salir) {
            System.out.println("\n======= MENÚ PRINCIPAL =======");
            System.out.println("1. Listar pacientes");
            System.out.println("2. Días para vacunas");
            System.out.println("3. Actualizar nombre de la veterinaria");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\n--- Lista de pacientes ---");
                    for (PacienteMascota p : pacientes) {
                        System.out.println(p.toString());
                    }
                    break;
                case 2:
                    System.out.println("\n--- Tiempo Restante para vacunas ---");
                    for (PacienteMascota p : pacientes) {
                        System.out.println("Faltan " + p.DiasParaVacuna() + " días para la vacuna de la mascota.");
                    }
                    break;
                case 3:
                    // Método estático llamado correctamente
                    PacienteMascota.Actualizarnombre("SuperVet");
                    System.out.println("\n[!] El nombre de la veterinaria ha sido actualizado a SuperVet.");
                    break;
                case 4:
                    salir = true;
                    System.out.println("\nCerrando el sistema...");
                    break;
                default:
                    System.out.println("\nOpción inválida. Intente de nuevo.");
            }
        }

    }
}
