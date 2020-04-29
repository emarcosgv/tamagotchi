package domain;

//1 forma
/*
public class Mascota {

    private Integer gradoDeFelicidad;
    private EstadoMascota estado;

    public Mascota() {
        this.gradoDeFelicidad = 10;
        this.estado = new Contenta();
    }

    public void come() {
        this.estado.come(this);//ver este this
    }

    public void juga() {
        this.estado.juga(this);
    }

    public Boolean podesJugar() {
        return this.estado.podesJugar(this);
    }

    public Integer getGradoDeFelicidad() {
        return gradoDeFelicidad;
    }

    public void cambiarEstado(EstadoMascota estado) {
        this.estado = estado;
    }

    public void incrementaNivelDeFelicidadEn(Integer numero) {
        this.gradoDeFelicidad = gradoDeFelicidad + numero;
    }
}
 */

//2 forma de state por Ezequiel
/*
public class Mascota {

    private Integer gradoDeFelicidad;
    private EstadoMascota estado;

    public Mascota() {
        this.gradoDeFelicidad = 10;
        this.estado = new Contenta();
    }

    public void come() {
        this.estado.come(this);//ver este this
    }

    public void juga() {
        this.estado.juga(this);
    }

    public Boolean podesJugar() {
        return this.estado.podesJugar(this);
    }

    public Integer getGradoDeFelicidad() {
        return gradoDeFelicidad;
    }

    public void cambiarEstado(EstadoMascota estado) {
        this.estado = estado;
    }

    public void incrementaNivelDeFelicidadEn(Integer numero) {
        this.gradoDeFelicidad = gradoDeFelicidad + numero;
    }
}
*/

//3 forma
public class Mascota {

    private Integer gradoDeFelicidad;
    private EstadoMascotaForma3 estado;

    public Mascota() {
        this.gradoDeFelicidad = 10;
        this.estado = new Contenta();
    }

    public void come() {
        this.estado.come(this);//ver este this
    }

    public void juga() {
        this.estado.juga(this);
    }

    public Boolean podesJugar() {
        return this.estado.podesJugar(this);
    }

    public Integer getGradoDeFelicidad() {
        return gradoDeFelicidad;
    }

    public void cambiarEstado(EstadoMascotaForma3 estado) {
        this.estado = estado;
    }

    public void incrementaNivelDeFelicidadEn(Integer numero) {
        this.gradoDeFelicidad = gradoDeFelicidad + numero;
    }
}