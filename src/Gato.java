public class Gato extends  Mascotas  {
    private boolean esdelinterior;

    public Gato( boolean esdelinterior, String nombre, int  edad ){
        super( nombre, edad);
        this.esdelinterior = esdelinterior;

    }


    @Override
    public void mostrarinfo() {
        super.mostrarinfo();
    }

    @Override
    public void hacersonido() {
        super.hacersonido();
    }
}
