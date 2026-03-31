import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PacienteMascota {
    private String nombremascota;
    private Especie especie;
    private int pesoideal;
    private String nombredeldueno;
    private LocalDate fechaproximavacuna;
    private  static String  nombreveterinaria = "VetPlus ";
    public PacienteMascota( String nombredeldueno, String nombremascota, int pesoideal,Especie especie ,LocalDate fechaproximavacuna   ){
        this.nombredeldueno= nombredeldueno;
        this.nombremascota= nombremascota;
        this.pesoideal= pesoideal;
        this.especie= especie;


    }
    public int  DiasParaVacuna(){
        long dias = ChronoUnit.DAYS.between(LocalDate.now(), this.fechaproximavacuna);
        int restante = (int) dias;
        return restante;

    }

    public static void  Actualizarnombre(String nombreveterinarianuevo){
        nombreveterinaria=nombreveterinarianuevo;

    }

    @Override
    public String toString() {
        return nombreveterinaria+ "; " + this.nombremascota + "; " + this.fechaproximavacuna + "; " + this.nombredeldueno + "; " + this.especie + "; " + this.pesoideal;

    }
}
