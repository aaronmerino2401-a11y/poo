public class Perro extends Mascotas {
    private String raza;

    public Perro (String nombre , int edad , String raza  ){
        super(nombre, edad);
        this.raza=raza;
    }


    @Override
    public void hacersonido() {
        super.hacersonido();
    }

    @Override
    public void mostrarinfo() {
        super.mostrarinfo();
    }
}
