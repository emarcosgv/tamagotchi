package domain;

//1 forma de state
/*

public class Hambrienta extends EstadoMascota {

    protected Hambrienta(Mascota mascota) {
        super(mascota);
    }

    public Hambrienta() {

    }

    @Override
    public void come(Mascota mascota) {
        mascota.cambiarEstado(new Contenta());

    }

    @Override
    public void juga(Mascota mascota) {

    }

    @Override
    public Boolean podesJugar(Mascota mascota) {
        return false;
    }
}
*/

//2 forma Ezequiel
/*
public class Hambrienta extends EstadoMascota {
    @Override
    public void come(Mascota mascota) {
        mascota.cambiarEstado(new Contenta());

    }

    @Override
    public void juga(Mascota mascota) {

    }

    @Override
    public Boolean podesJugar(Mascota mascota) {
        return false;
    }
}
*/

//3 forma
public class Hambrienta implements EstadoMascotaForma3 {

    public void come(Mascota mascota) {
        mascota.cambiarEstado(new Contenta());

    }


    public void juga(Mascota mascota) {

    }


    public Boolean podesJugar(Mascota mascota) {
        return false;
    }


}