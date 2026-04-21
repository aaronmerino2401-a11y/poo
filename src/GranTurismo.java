public class GranTurismo extends CochedeCarreras {

    private int pesoExtraLastre ;

    public  GranTurismo(String marca , String modelo, int VelocidadMaxima, int pesoExtraLastre){
        super(marca, modelo,VelocidadMaxima);
        this.pesoExtraLastre=pesoExtraLastre;
    }




    public void competir() {

        System.out.println("como gestina la  " + pesoExtraLastre + " conduccion .");
    }




}
