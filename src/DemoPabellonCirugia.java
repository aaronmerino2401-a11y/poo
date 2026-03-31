import java.util.Scanner;

class PabellonCirugia {
    private int numero;
    private boolean ocupado;

    public PabellonCirugia(int numero) {
        this.numero = numero;
        this.ocupado = false;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public int getNumero() {
        return numero;
    }



    @Override
    public String toString() {
        return "Pabellón N°" + numero + " - Estado: " + (ocupado ? "Ocupado" : "Disponible");
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        PabellonCirugia that = (PabellonCirugia) obj;
        return numero == that.numero;
    }
}


    public class DemoPabellonCirugia {

    private PabellonCirugia[] arregloPabellones;

    public DemoPabellonCirugia() {
        arregloPabellones = new PabellonCirugia[6];
    }

    public void procesa() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- INGRESO DE DATOS ---");
        for (int i = 0; i < arregloPabellones.length; i++) {
            int numero = -1;
            boolean datoValido = false;

            while (!datoValido) {
                System.out.print("Ingrese el número de pabellón para la posición [" + i + "] (debe ser mayor a 0): ");
                if (scanner.hasNextInt()) {
                    numero = scanner.nextInt();
                    if (numero > 0) {
                        datoValido = true;
                    } else {
                        System.out.println("Error: El número debe ser positivo.");
                    }
                } else {
                    System.out.println("Error: Debe ingresar un valor numérico entero.");
                    scanner.next();
                }
            }
            arregloPabellones[i] = new PabellonCirugia(numero);
        }

        for (int i = 0; i < arregloPabellones.length; i++) {
            if (i % 2 == 0) {
                arregloPabellones[i].setOcupado(true);
            }
        }

        System.out.println("\n--- DATOS DE LOS PABELLONES ---");
        for (int i = 0; i < arregloPabellones.length; i++) {
            System.out.println("Posición [" + i + "]: " + arregloPabellones[i]);
        }

        System.out.println("\n--- BUSCANDO PABELLONES IGUALES ---");
        boolean hayIguales = false;

        for (int i = 0; i < arregloPabellones.length - 1; i++) {
            for (int j = i + 1; j < arregloPabellones.length; j++) {
                if (arregloPabellones[i].equals(arregloPabellones[j])) {
                    System.out.println("¡Coincidencia! Los pabellones en las posiciones [" + i + "] y [" + j + "] son iguales.");
                    hayIguales = true;
                }
            }
        }

        if (!hayIguales) {
            System.out.println("No se encontraron pabellones con el mismo número.");
        }

        scanner.close();
    }

    public static void main(String[] args) {

        DemoPabellonCirugia demo = new DemoPabellonCirugia();
        demo.procesa();
    }
}