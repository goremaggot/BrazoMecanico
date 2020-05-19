
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ricardo
 */
public class Launcher {
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new VistaCliente().setVisible(true);
            } catch (IOException ex) {
                Logger.getLogger(VistaCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }
}
