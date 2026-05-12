public abstract class  Vehiculo2  implements Vendible,Asegurable {
    private String marca;
    private String modelo;
    private int aÑO;
    private double precio;

    public  Vehiculo2( String marca, String modelo, int aÑO, double precio ){

        this.marca=marca;
        this.modelo=modelo;
        this.aÑO=aÑO;
        this.precio=precio;

    }

    void mostrarinfo(){
        System.out.println(" Marca" +" " +  marca);
        System.out.println( "Modelo" +" " +  modelo);
        System.out.println(" Año" +" " +  aÑO);
        System.out.println(" Precio" +" " +  precio);

    }




}
