package com.trabajo.presentacion;

import com.trabajo.controlador.Logica;
import java.awt.Graphics;

public class Area extends javax.swing.JPanel {

    public Logica controller;

    public Area() {
        controller = new Logica();
        initComponents();

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        controller.paint(g);

    }

    public void rep() {
        repaint();
        System.out.println("Repaint");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 774, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
