package com.trabajo.presentacion;

import com.trabajo.controlador.Cliente;
import com.trabajo.controlador.SocketServer;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ricardo
 */
public class VistaServer extends javax.swing.JFrame {

    private boolean ctrPin = true;
    private SocketServer serverInit = null;
    private boolean ispressed1 = true;
    private boolean ispressed2 = true;
    private boolean ispressed3 = true;
    /**
     * Creates new form Vistacliente
     */
    private Cliente cli;

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
        jSlider1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jSlider1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jSlider1MouseExited(evt);
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
        jSlider2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jSlider2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jSlider2MouseExited(evt);
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
        jSlider3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jSlider3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jSlider3MouseExited(evt);
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
        if (!ispressed1) {
                try {
                cli = new Cliente();
                cli.startClient(); 
                cli.enviaMensaje(1, jSlider1.getValue());
                cli.close();
            } catch (IOException ex) {
                Logger.getLogger(VistaServer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jSlider1StateChanged

    private void jSlider2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider2StateChanged
        area1.controller.ctrBrazo = 2;
        area1.controller.EnviarRotacion(jSlider2.getValue());
        area1.rep();
        if (!ispressed2) {
            try {
                cli = new Cliente();
                cli.startClient(); 
                cli.enviaMensaje(2, jSlider2.getValue());
                cli.close();
            } catch (IOException ex) {
                Logger.getLogger(VistaServer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jSlider2StateChanged

    private void jSlider3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider3StateChanged
        area1.controller.ctrBrazo = 3;
        area1.controller.EnviarRotacion(jSlider3.getValue());
        area1.rep();
        if (!ispressed3) {
            try {
                cli = new Cliente();
                cli.startClient(); 
                cli.enviaMensaje(3, jSlider3.getValue());
                cli.close();
            } catch (IOException ex) {
                Logger.getLogger(VistaServer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
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

    private void jSlider1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSlider1MouseEntered
        setIspressed1(false);
    }//GEN-LAST:event_jSlider1MouseEntered

    private void jSlider1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSlider1MouseExited
        setIspressed1(true);
    }//GEN-LAST:event_jSlider1MouseExited

    private void jSlider2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSlider2MouseEntered
       setIspressed2(false);
    }//GEN-LAST:event_jSlider2MouseEntered

    private void jSlider2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSlider2MouseExited
        setIspressed2(true);
    }//GEN-LAST:event_jSlider2MouseExited

    private void jSlider3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSlider3MouseEntered
        setIspressed3(false);
    }//GEN-LAST:event_jSlider3MouseEntered

    private void jSlider3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSlider3MouseExited
        setIspressed3(true);
    }//GEN-LAST:event_jSlider3MouseExited
    public boolean isIspressed1() {
        return ispressed1;
    }

    public void setIspressed1(boolean ispressed1) {
        this.ispressed1 = ispressed1;
    }

    public boolean isIspressed2() {
        return ispressed2;
    }

    public void setIspressed2(boolean ispressed2) {
        this.ispressed2 = ispressed2;
    }

    public boolean isIspressed3() {
        return ispressed3;
    }

    public void setIspressed3(boolean ispressed3) {
        this.ispressed3 = ispressed3;
    }
 
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
