public class rectangulo {

    // atributos
    private    int ancho, largo;


    // contructor

    public rectangulo( int ancho , int  largo ) {
       this. ancho = ancho ;
        this.largo = largo;

    }

    public int  area (){
        return ancho*largo;


    }
    public int perimetro(){
        return 2*ancho+ 2*largo;

    }



}
