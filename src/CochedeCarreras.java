public  abstract class CochedeCarreras {
    private String marca;
    private String modelo;
    private int VelocidadMaxima;

    public CochedeCarreras( String marca, String modelo , int VelocidadMaxima ){
        this.marca= marca;
        this.modelo= modelo;
        this.VelocidadMaxima= VelocidadMaxima;
    }

    public abstract void competir();

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVelocidadMaxima() {
        return VelocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        VelocidadMaxima = velocidadMaxima;
    }


    public void  mostrarinfo(){
        System.out.println("Modelo" +  modelo);
        System.out.println("Marca " + marca);
        System.out.println("Velocidad Maxima" + VelocidadMaxima);


    }



}


