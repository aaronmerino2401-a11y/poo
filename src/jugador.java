public abstract class  jugador implements  Puntuable, Clasificable{
    String nombre, String  , alias;
     tipo TipoJugador;
     double puntajeBase;
     double premio;

     public jugador ( String nombre ,  String alias  , tipo TipoJugador , double puntajeBase   ){
         this.nombre=nombre;
         this.alias=alias;
         this.TipoJugador=TipoJugador;
         this.puntajeBase= puntajeBase;

    }

    public void mostrarinfo(){
        System.out.println("nombre " +  " " +  nombre);
        System.out.println("alias " +  " " +  alias);
        System.out.println("tipo jugador " +  " " +  TipoJugador);
        System.out.println(" puntaje base  " +  " " +  puntajeBase);
    }

    public double calcularpremio(){
         return  premio;
    }


    public double getPremio() {
        return premio;
    }




    abstract double calcularpuntaje();


    void  mostrarpunteje() {
        System.out.println(" puntaje " + calcularpuntaje());
    }

    @Override
    public abstract boolean puedeClasificar();

    @Override
    public abstract String getCategoria();

}
