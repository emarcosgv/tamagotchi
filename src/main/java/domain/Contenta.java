package domain;

//1 forma
/*

public class Contenta extends EstadoMascota {

    private int cantidadDeVecesQueJugo;

    public Contenta() {
        super();

        this.cantidadDeVecesQueJugo = 0;
    }

    public void come(Mascota mascota) {
        mascota.incrementaNivelDeFelicidadEn(1);
    }

    public void juga(Mascota mascota) {
        mascota.incrementaNivelDeFelicidadEn(2);
        cantidadDeVecesQueJugo++;
        this.cambiarDeEstadoSiEsNecesario(mascota);
    }

    private void cambiarDeEstadoSiEsNecesario(Mascota mascota) {
        if (cantidadDeVecesQueJugo > 5) {
            mascota.cambiarEstado(new Hambrienta());
        }


    }

    public Boolean podesJugar(Mascota mascota) {
        return true;
    }
}

 */

//2 forma por Ezequiel
/*
public class Contenta extends EstadoMascota {

    private int cantidadDeVecesQueJugo;

    public Contenta() {
        this.cantidadDeVecesQueJugo = 0;
    }

    public void come(Mascota mascota) {
        mascota.incrementaNivelDeFelicidadEn(1);
    }

    public void juga(Mascota mascota) {
        mascota.incrementaNivelDeFelicidadEn(2);
        cantidadDeVecesQueJugo++;
        this.cambiarDeEstadoSiEsNecesario(mascota);
    }

    private void cambiarDeEstadoSiEsNecesario(Mascota mascota) {
        if (cantidadDeVecesQueJugo > 5) {
            mascota.cambiarEstado(new Hambrienta());
        }


    }

    public Boolean podesJugar(Mascota mascota) {
        return true;
    }
}
*/


//3 forma

public class Contenta implements EstadoMascotaForma3 {

    private int cantidadDeVecesQueJugo;

    public Contenta() {
        this.cantidadDeVecesQueJugo = 0;
    }

    public void come(Mascota mascota) {
        mascota.incrementaNivelDeFelicidadEn(1);
    }

    public void juga(Mascota mascota) {
        mascota.incrementaNivelDeFelicidadEn(2);
        cantidadDeVecesQueJugo++;
        this.cambiarDeEstadoSiEsNecesario(mascota);
    }

    private void cambiarDeEstadoSiEsNecesario(Mascota mascota) {
        if (cantidadDeVecesQueJugo > 5) {
            mascota.cambiarEstado(new Hambrienta());
        }


    }

    public Boolean podesJugar(Mascota mascota) {
        return true;
    }


}