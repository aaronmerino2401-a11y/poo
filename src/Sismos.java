import java.util.ArrayList;

public class Sismos {
    private String Region;
    private  String epicentro;
    private  float magnitud;
    public Sismos(String Region, String epicentro, float magnitud) {
        this.Region = Region;
        this.epicentro = epicentro;
        this.magnitud = magnitud;
    }

  public static class   SismoInvalidoException extends Exception{
        public SismoInvalidoException(String mensaje){
        super(mensaje);
        }

  }

    public static class SistemaSismos {
        private ArrayList<Sismos> listaSismos = new ArrayList<>();

        public void registrarSismo(Object region, Object epicentro, Object magnitud) throws SismoInvalidoException {
            if (!(region instanceof String) || !(epicentro instanceof String)) {
                throw new SismoInvalidoException("Error: Región y Epicentro deben ser cadenas de texto (String).");
            }
            if (!(magnitud instanceof Float)) {
                throw new SismoInvalidoException("Error: La magnitud debe ser un número flotante (Float).");
            }

            listaSismos.add(new Sismos((String) region, (String) epicentro, (Float) magnitud));
            System.out.println("Sismo registrado exitosamente.");


        }

}}
