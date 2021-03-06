package com.cliente.presentacion;


import com.cliente.controlador.Cliente;
import com.cliente.modelo.SocketServer;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ricardo
 */
public class VistaCliente extends javax.swing.JFrame {

    /**
     * Creates new form VistaCliente
     */
    private Cliente cli;
    private boolean ctrPin = true;
    private boolean ispressed1 = true;
    private boolean ispressed2 = true;
    private boolean ispressed3 = true;


    private SocketServer serverInit = null;
    /**
     *
     * @throws java.io.IOException
     */
    public VistaCliente() throws IOException{
        initComponents();
        serverInit = new SocketServer();
        serverInit.mueveBrazo(jSlider1,jSlider2 , jSlider3);
        serverInit.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSlider3 = new javax.swing.JSlider();
        jSlider1 = new javax.swing.JSlider();
        jSlider2 = new javax.swing.JSlider();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        jSlider1.setMaximum(90);
        jSlider1.setMinimum(-90);
        jSlider1.setValue(0);
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });
        jSlider1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSlider1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jSlider1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jSlider1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jSlider1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jSlider1MouseReleased(evt);
            }
        });

        jSlider2.setMaximum(90);
        jSlider2.setMinimum(-90);
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

        jButton1.setText("Pinzas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(113, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSlider2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSlider3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(87, 87, 87))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(152, 152, 152))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(jSlider2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(jSlider3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged
        
        if (!ispressed1) {
            System.out.println("Esta Entrando");
            try {
                cli = new Cliente();
                cli.startClient(); 
                cli.enviaMensaje(1, jSlider1.getValue());
                cli.close();
            } catch (IOException ex) {
                Logger.getLogger(VistaCliente.class.getName()).log(Level.SEVERE, null, ex);
            }    
        }        
    }//GEN-LAST:event_jSlider1StateChanged

    private void jSlider2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider2StateChanged
        
        if (!ispressed2) {
            try {
                cli = new Cliente();
                cli.startClient(); 
                cli.enviaMensaje(2, jSlider2.getValue());
                cli.close();
            } catch (IOException ex) {
                Logger.getLogger(VistaCliente.class.getName()).log(Level.SEVERE, null, ex);
            }                 
        }
    }//GEN-LAST:event_jSlider2StateChanged

    private void jSlider3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider3StateChanged
                
        if (!ispressed3) {
            try {
                cli = new Cliente();
                cli.startClient(); 
                cli.enviaMensaje(3, jSlider3.getValue());
                cli.close();
            } catch (IOException ex) {
                Logger.getLogger(VistaCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jSlider3StateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                    try {
        cli = new Cliente();
        cli.startClient(); 
                if(ctrPin){
            ctrPin=false;
        }else{
            ctrPin=true;
        }
        int bool =0;
            if (ctrPin){
                bool =0; }
                else{
                      bool =1;   
                        }
            
            cli.enviaMensaje(4, bool);
            cli.close();
        } catch (IOException ex) {
            Logger.getLogger(VistaCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jSlider1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSlider1MousePressed
        
    }//GEN-LAST:event_jSlider1MousePressed

    private void jSlider1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSlider1MouseReleased
        
    }//GEN-LAST:event_jSlider1MouseReleased

    private void jSlider1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSlider1MouseClicked
        
    }//GEN-LAST:event_jSlider1MouseClicked

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
    private javax.swing.JButton jButton1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSlider jSlider2;
    private javax.swing.JSlider jSlider3;
    // End of variables declaration//GEN-END:variables
}
