public abstract class jugadorCasual extends  jugador {
    private  int horasjugadas;

    public  jugadorCasual(  String nombre ,  String alias  , tipo TipoJugador , double puntajeBase , int horasjugadas ){
        super( nombre ,  alias  ,  TipoJugador ,  puntajeBase );
        this.horasjugadas= horasjugadas;

    }
    @Override
    public  double  calcularPuntaje(){
        return puntajeBase + (horasjugadas*0.5);

    }

    public boolean  puedeClasificar( double calcularpuntaje){
        if( calcularpuntaje>100){
            return true;
        }
        return false;
    }

    public String getCategoria( double calcularpuntaje){
        if(calcularpuntaje<80 ){
            return "principiante " ;
        } else if (calcularpuntaje>= 80 &&  calcularpuntaje<= 100){
            return "Intermedio ";

        }else{
            return "Avanzado";
        }


    }

}


