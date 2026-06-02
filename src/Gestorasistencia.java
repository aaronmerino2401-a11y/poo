import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class Gestorasistencia {
    private String obtenerFechaFormateada() {
        LocalDate hoy = LocalDate.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd_MM_yyyy");
        return hoy.format(formato);
    }

    public void registrarIngreso(Funcionario funcionario, LocalTime horaIngreso) {
        String nombreArchivo = "Ingreso Empleados Fecha_" + obtenerFechaFormateada() + ".txt";
        String linea = "Rut: [" + funcionario.getRut() + "] | Nombre: [" + funcionario.getNombre() +
                "] | Hora de ingreso: [" + horaIngreso.toString() + "]";

        LocalTime horaLimite = LocalTime.of(8, 30);
        if (horaIngreso.isAfter(horaLimite)) {
            linea += " ATRASO";
        }

        escribirEnArchivo(nombreArchivo, linea);
    }

    public void registrarSalida(Funcionario funcionario, LocalTime horaSalida) {
        String nombreArchivo = "Salida_Empleados_Fecha_" + obtenerFechaFormateada() + ".txt";
        String linea = "Rut: [" + funcionario.getRut() + "] | Nombre: [" + funcionario.getNombre() +
                "] | Hora de salida: [" + horaSalida.toString() + "]";

        LocalTime horaSalidaOficial = LocalTime.of(17, 0);
        if (horaSalida.isAfter(horaSalidaOficial)) {
            Duration extra = Duration.between(horaSalidaOficial, horaSalida);
            long horasExtra = extra.toHours();
            long minutosExtra = extra.toMinutesPart();
            linea += " (TIEMPO EXTRA: " + horasExtra + "h " + minutosExtra + "m)";
        }

        escribirEnArchivo(nombreArchivo, linea);
    }

    private void escribirEnArchivo(String nombreArchivo, String contenido) {
        try (FileWriter fw = new FileWriter(nombreArchivo, true);
             PrintWriter pw = new PrintWriter(fw)) {

            pw.println(contenido);
            System.out.println("Registro exitoso en: " + nombreArchivo);

        } catch (IOException e) {
            System.err.println("Error al intentar escribir en el archivo: " + e.getMessage());
        }
    }
}








