public class Mascotas {

    protected String nombre;
    protected int edad;

    public Mascotas(String nombre, int edad){
        this.nombre= nombre;
        this.edad=edad;


    }


    public void hacersonido(){
        System.out.println("miau");

    }

    public  void mostrarinfo(){
        System.out.println(nombre);
        System.out.println(edad);
    }


}
