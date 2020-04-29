package domain;

// 1 forma de state
/*
public abstract class EstadoMascota {

    private Mascota mascota;

    protected EstadoMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public EstadoMascota() {

    }

    public abstract void come(Mascota mascota);

    public abstract void juga(Mascota mascota);

    public abstract Boolean podesJugar(Mascota mascota);
}
*/
//2 forma por Ezequiel
/*
public abstract class EstadoMascota {

    public abstract void come(Mascota mascota);

    public abstract void juga(Mascota mascota);

    public abstract Boolean podesJugar(Mascota mascota);


}


*/
