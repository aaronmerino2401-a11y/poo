public class demoperrogato {
    public static void main ( String[] args){
        Perro miPerro = new Perro("ola " , 3 ,"galgo"  );
        Gato miGato = new Gato(  true  , "ola ", 3 );


        System.out.println("--- Información de las Mascotas ---");
        miPerro.mostrarinfo();
        miGato.mostrarinfo();
    }
}
