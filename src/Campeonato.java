import java.util.ArrayList;

public class Campeonato {
    public static void main(String [] args ){
        ArrayList<CochedeCarreras> listaCochesCarreas = new ArrayList<>();

        listaCochesCarreas.add( new PrototipoLM( "kaka","ferrari",100, false));
        listaCochesCarreas.add( new PrototipoLM("pipi", "mercedes", 90, true));
        listaCochesCarreas.add( new GranTurismo("nn","chevrolet",100,555));
        listaCochesCarreas.add(new GranTurismo("hh", "xiaomi", 9,30));

        for ( CochedeCarreras v : listaCochesCarreas ) {
            v.mostrarinfo();
            v.competir();
            System.out.println("-----------------");
        }






    }



}
