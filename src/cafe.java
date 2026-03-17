public class cafe {
    // atributos
    private String nombre;
    private  double precio ;
    private  String tamano;

    // contructor
    public  cafe ( String nombre, String tamano, double precio  ){
        this. nombre= nombre ;
        this. precio=precio;
        this.  tamano= tamano;

    }

    public void  mostarticket  ( ){
        System.out.println( "cafe "+ nombre );
        System.out.println( "precio"+ precio );
        System.out.println( " tamano "+ tamano );

    }
    public static  void main(String[] args){

        cafe micafe= new cafe("latte", "grande ", 10000 );

        micafe.mostarticket();
    }
}
