   public class  PrototipoLM  extends CochedeCarreras{
    private boolean SistemaHibrido;

    public  PrototipoLM(String marca , String modelo, int VelocidadMaxima, boolean sistemaHibrido){
        super(marca, modelo,VelocidadMaxima);
        this.SistemaHibrido= sistemaHibrido;
    }




       public void competir() {

           System.out.println("El vehículo " + SistemaHibrido + " está compitiendo.");
       }






}
