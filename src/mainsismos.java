
    public class mainsismos   {
        public static void main(String[] args) {
            Sismos.SistemaSismos sistema = new Sismos.SistemaSismos();

            try {
                System.out.println("Intento 1: Registro correcto");
                sistema.registrarSismo("Biobío", "Concepción", 5.8f);

                System.out.println("\nIntento 2: Registro con dato erróneo (Magnitud como Integer)");
                sistema.registrarSismo("Valparaíso", "Costa", 7);

            } catch (Sismos.SismoInvalidoException e) {
                System.err.println("Capturada: " + e.getMessage());
            }
        }
    }




