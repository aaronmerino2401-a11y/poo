import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Vehiculo {
    // atributos
    private int peso;
    private String color;
    private int potenciaMaxima;
    private LocalDate fechaPrimeraCarrera;
    private categoria Categoria;
    private static String marca = "cadilac";


    public Vehiculo(int peso, int potenciaMaxima, categoria Categoria, String color) {
        this.peso = peso;
        this.color = color;
        this.Categoria = Categoria;
        this.potenciaMaxima = potenciaMaxima;

    }

    public Vehiculo(String nombredeldueño, String nombremascota, int peso, LocalDate fecha, Especie especie) {
    }


    public int RestanteCarrera() {
        long dias = ChronoUnit.DAYS.between(LocalDate.now(), this.fechaPrimeraCarrera);
        int restante = (int) dias;
        return restante;
    }

    public static void ModificarMarca(String nuevaMarca) {
        marca = nuevaMarca;
    }

    @Override
    public String toString() {
        return marca + "; " + this.Categoria + "; " + this.fechaPrimeraCarrera + "; " + this.color + "; " + this.potenciaMaxima + "; " + this.peso;
    }


}

