package com.trabajo.presentacion;

import com.trabajo.controlador.SocketServer;
import java.io.IOException;

/**
 *
 * @author Ricardo
 */
public class VistaServer extends javax.swing.JFrame {

 private boolean ctrPin = true;
    private SocketServer serverInit = null;

    public VistaServer() throws IOException {

        initComponents();
        serverInit = new SocketServer();
        serverInit.muevearea(area1);
        serverInit.mueveBrazo(jSlider1,jSlider2 , jSlider3);
        serverInit.start();

    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        area1 = new com.trabajo.presentacion.Area();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSlider1 = new javax.swing.JSlider();
        jSlider2 = new javax.swing.JSlider();
        jSlider3 = new javax.swing.JSlider();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Trabajo clase");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        area1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 51)));
        area1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(area1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 400));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Mover Brazo 2");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 80, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Mover Brazo 3");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 130, -1, -1));

        jSlider1.setMaximum(90);
        jSlider1.setMinimum(-90);
        jSlider1.setValue(0);
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });
        jPanel1.add(jSlider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, -1, -1));

        jSlider2.setMaximum(90);
        jSlider2.setMinimum(-90);
        jSlider2.setSnapToTicks(true);
        jSlider2.setToolTipText("");
        jSlider2.setValue(0);
        jSlider2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider2StateChanged(evt);
            }
        });
        jPanel1.add(jSlider2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, -1, -1));

        jSlider3.setMaximum(90);
        jSlider3.setMinimum(-90);
        jSlider3.setValue(0);
        jSlider3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider3StateChanged(evt);
            }
        });
        jPanel1.add(jSlider3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Mover Brazo 1");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 30, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jButton1.setText("Pinzas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 190, 150, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged

        area1.controller.ctrBrazo = 1;
        area1.controller.EnviarRotacion(jSlider1.getValue());
        area1.rep();
    }//GEN-LAST:event_jSlider1StateChanged

    private void jSlider2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider2StateChanged
        area1.controller.ctrBrazo = 2;
        area1.controller.EnviarRotacion(jSlider2.getValue());
        area1.rep();
    }//GEN-LAST:event_jSlider2StateChanged

    private void jSlider3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider3StateChanged
        area1.controller.ctrBrazo = 3;
        area1.controller.EnviarRotacion(jSlider3.getValue());
        area1.rep();
    }//GEN-LAST:event_jSlider3StateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if(ctrPin){
            ctrPin=false;
        }else{
            ctrPin=true;
        }
        area1.controller.ctrPin = ctrPin;      
        area1.controller.ctrBrazo = 4;       
        area1.rep();
    }//GEN-LAST:event_jButton1ActionPerformed

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.trabajo.presentacion.Area area1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSlider jSlider2;
    private javax.swing.JSlider jSlider3;
    // End of variables declaration//GEN-END:variables
}
