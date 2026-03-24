import java.util.Objects;
public class PabellonCirujia {

    private int numero;
    private String especialidad;
    private Estado estado;

    public PabellonCirujia(int numero, String especialidad) {
        this.numero = numero;
        this.especialidad = especialidad;

    }

    public int getNumero() {
        return numero;
    }


    public String getEspecialidad() {
        return especialidad;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        String nuevonumero = Integer.toString(this.numero);
        String nuevoesMinuscula = this.estado.name().toLowerCase();
        // se retorna
        return nuevonumero + especialidad;

    }

    public boolean equals(Object otro) {
        if (this == otro) return true;
        if (otro == null || getClass() != otro.getClass()) return false;

        PabellonCirujia nuevopabellon = (PabellonCirujia) otro;
        return Objects.equals( numero, PabellonCirujia. this. numero )  ;
    }
}



