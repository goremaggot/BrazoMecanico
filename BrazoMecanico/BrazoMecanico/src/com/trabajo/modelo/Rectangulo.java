package com.trabajo.modelo;

/**
 *
 * @author ricardo
 */
public class Rectangulo extends Punto {

    private int ancho;
    private int alto;
    private int rotacion;

    public Rectangulo() {
        this.ancho = 0;
        this.alto = 0;
        this.rotacion = 0;

    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getRotacion() {
        return rotacion;
    }

    public void setRotacion(int rotacion) {
        this.rotacion = rotacion;
    }

}
