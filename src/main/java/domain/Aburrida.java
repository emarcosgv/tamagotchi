package domain;

//1 forma de state
/*


public class Aburrida extends EstadoMascota {


    protected Aburrida(Mascota mascota) {
        super(mascota);
    }

    public void come(Mascota mascota) {
        if (pasaron80Minutos()) {
            mascota.cambiarEstado(new Contenta());
        }
    }

    private boolean pasaron80Minutos() {
        return false;
    }


    public void juga(Mascota mascota) {
        mascota.cambiarEstado(new Contenta());
    }

    public Boolean podesJugar(Mascota mascota) {
        return true;
    }
}
*/
//2 forma por Ezequiel
/*
public class Aburrida extends EstadoMascota {
    public void come(Mascota mascota) {
        if (pasaron80Minutos()) {
            mascota.cambiarEstado(new Contenta());
        }
    }

    private boolean pasaron80Minutos() {
        return false;
    }


    public void juga(Mascota mascota) {
        mascota.cambiarEstado(new Contenta());
    }

    public Boolean podesJugar(Mascota mascota) {
        return true;
    }
}
*/


//3 forma
public class Aburrida implements EstadoMascotaForma3 {
    public void come(Mascota mascota) {
        if (pasaron80Minutos()) {
            mascota.cambiarEstado(new Contenta());
        }
    }

    private boolean pasaron80Minutos() {
        return false;
    }


    public void juga(Mascota mascota) {
        mascota.cambiarEstado(new Contenta());
    }

    public Boolean podesJugar(Mascota mascota) {
        return true;
    }

    public void come() {

    }

    public void juga() {

    }

    public Boolean podesJugar() {
        return null;
    }
}