package com.trabajo.main;

import com.trabajo.presentacion.VistaServer;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ricardo
 */
public class Launcher {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            VistaServer v = null;
            try {
                v = new VistaServer();
            } catch (IOException ex) {
                Logger.getLogger(Launcher.class.getName()).log(Level.SEVERE, null, ex); 
            }
            v.setVisible(true);
            v.setSize(870,450);
        });
    } 
}
