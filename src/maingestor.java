import java.time.LocalTime;

public class maingestor {
    public class Main {
        public static void main(String[] args) {
            Gestorasistencia gestor = new Gestorasistencia();

            Funcionario emp1 = new Funcionario("12.345.678-9", "Juan Perez");
            Funcionario emp2 = new Funcionario("98.765.432-1", "Ana Gomez");

            //  Simulancion
            // Juan llega temprano
            gestor.registrarIngreso(emp1, LocalTime.of(8, 15));
            // Ana llega con atraso después de las 08:30
            gestor.registrarIngreso(emp2, LocalTime.of(8, 45));

            gestor.registrarSalida(emp1, LocalTime.of(17, 0));
            // Ana hace horas extra después de las 17:00
            gestor.registrarSalida(emp2, LocalTime.of(18, 20));
        }
    }


}
