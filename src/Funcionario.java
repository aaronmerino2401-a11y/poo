public class Funcionario{
    String rut;
    String  Nombre;
    public  Funcionario( String rut , String Nombre  ){
        this.Nombre=Nombre;
        this.rut=rut;

    }

    public String getNombre() {
        return Nombre;
    }

    public String getRut() {
        return rut;
    }

}
