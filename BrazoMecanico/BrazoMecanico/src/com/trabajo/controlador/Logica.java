package com.trabajo.controlador;

import com.trabajo.modelo.Rectangulo;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

/**
 *
 * @author ricardo
 */
public class Logica {

    public Rectangulo brazo1;
    public Rectangulo brazo2;
    public Rectangulo brazo3;
    public Rectangulo pinza;
    public int ctrBrazo = 0;
    public boolean ctrPin = true;

    public Logica() {

        brazo1 = new Rectangulo();
        brazo1.setAlto(90);
        brazo1.setAncho(20);
        brazo1.setX(240);
        brazo1.setY(20);

        brazo2 = new Rectangulo();
        brazo2.setX(240);
        brazo2.setY(110);

        brazo3 = new Rectangulo();
        brazo3.setX(240);
        brazo3.setY(200);

        pinza = new Rectangulo();

    }

    public void EnviarCordenadasXY(int x, int y, int brazo) {

        brazo1.setX(x);
        brazo1.setY(y);

    }

    public void EnviarAnchoAltoXY(int ancho, int alto) {
        brazo1.setAncho(ancho);
        brazo1.setAlto(alto);

    }

    public void EnviarRotacion(int rotacion) {
        if (this.ctrBrazo == 1) {
            brazo1.setRotacion(rotacion);
        }
        if (this.ctrBrazo == 2) {
            brazo2.setRotacion(rotacion);
        }
        if (this.ctrBrazo == 3) {
            brazo3.setRotacion(rotacion);
        }
    }

    public void paint(Graphics g) {

        Graphics2D g2d = (Graphics2D) g.create();
        Rectangle t1 = new Rectangle(brazo1.getX(), brazo1.getY(), brazo1.getAncho(), brazo1.getAlto());
        g2d.rotate(Math.toRadians(brazo1.getRotacion() * -1), brazo1.getX(), brazo1.getY());
        g2d.setColor(Color.RED);
        g2d.draw(t1);
        g2d.fill(t1);
        g2d.dispose();

        //Brazo 2
        g2d = (Graphics2D) g.create();
        g2d.setColor(Color.YELLOW);
        Rectangle t2 = new Rectangle(brazo2.getX(), brazo2.getY(), brazo1.getAncho(), brazo1.getAlto());
        if (this.ctrBrazo == 1) {
            g2d.rotate(Math.toRadians(brazo1.getRotacion() * -1), brazo1.getX(), brazo1.getY());
        }
        if (this.ctrBrazo == 2 || this.ctrBrazo == 0) {
            g2d.rotate(Math.toRadians(brazo2.getRotacion() * -1), brazo2.getX(), brazo2.getY());
        }
        g2d.draw(t2);
        g2d.fill(t2);
        g2d.dispose();

        //Brazo 3
        g2d = (Graphics2D) g.create();
        g2d.setColor(Color.BLUE);
        Rectangle t3 = new Rectangle(brazo3.getX(), brazo3.getY(), brazo1.getAncho(), brazo1.getAlto());
        if (this.ctrBrazo == 1) {
            g2d.rotate(Math.toRadians(brazo1.getRotacion() * -1), brazo1.getX(), brazo1.getY());
        }
        if (this.ctrBrazo == 2) {
            g2d.rotate(Math.toRadians(brazo2.getRotacion() * -1), brazo2.getX(), brazo2.getY());
        }
        if (this.ctrBrazo == 3 || this.ctrBrazo == 0) {
            g2d.rotate(Math.toRadians(brazo3.getRotacion() * -1), brazo3.getX(), brazo3.getY());
        }
        g2d.draw(t3);
        g2d.fill(t3);
        g2d.dispose();
        
        //Pinzas

        g2d = (Graphics2D) g.create();
        Rectangle t0 = new Rectangle(brazo3.getX() - 40, 0, 100, 20);
        g2d.setColor(Color.GREEN);
        g2d.draw(t0);
        g2d.fill(t0);
        g2d.dispose();

        g2d = (Graphics2D) g.create();
        int v0 = 45;
        int v1 = -45;
        if (!ctrPin) {
            v0 = 0;
        }
        Rectangle p1 = new Rectangle(brazo3.getX(), brazo3.getY() + 85, 10, 30);
        if (this.ctrBrazo == 1) {
            g2d.rotate(Math.toRadians(brazo1.getRotacion() * -1), brazo1.getX(), brazo1.getY());
        }
        if (this.ctrBrazo == 2) {
            g2d.rotate(Math.toRadians(brazo2.getRotacion() * -1), brazo2.getX(), brazo2.getY());
        }
        if (this.ctrBrazo == 3) {
            g2d.rotate(Math.toRadians(brazo3.getRotacion() * -1), brazo3.getX(), brazo3.getY());

        } else {
            g2d.rotate(Math.toRadians(v0), brazo3.getX() - 5, brazo3.getY() + 85);
        }
        g2d.setColor(Color.BLACK);
        g2d.draw(p1);
        g2d.fill(p1);
        g2d.dispose();

        g2d = (Graphics2D) g.create();
        if (!ctrPin) {
            v1 = 0;
        }
        Rectangle p2 = new Rectangle(brazo3.getX(), brazo3.getY() + 85, 10, 30);
        if (this.ctrBrazo == 1) {
            g2d.rotate(Math.toRadians(brazo1.getRotacion() * -1), brazo1.getX(), brazo1.getY());
        }
        if (this.ctrBrazo == 2) {
            g2d.rotate(Math.toRadians(brazo2.getRotacion() * -1), brazo2.getX(), brazo2.getY());
        }
        if (this.ctrBrazo == 3) {
            g2d.rotate(Math.toRadians(brazo3.getRotacion() * -1), brazo3.getX(), brazo3.getY());

        } else {
            g2d.rotate(Math.toRadians(v1), brazo3.getX() + 15, brazo3.getY() + 85);
        }
        g2d.setColor(Color.BLACK);
        g2d.draw(p2);
        g2d.fill(p2);
        g2d.dispose();

    }

}
