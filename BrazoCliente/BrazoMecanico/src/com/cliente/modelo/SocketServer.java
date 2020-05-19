package com.cliente.modelo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ricardo
 */
public class SocketServer extends Thread {

    private ServerSocket server;
    private Socket cliente;
    private javax.swing.JSlider j1;
    private javax.swing.JSlider j2;
    private javax.swing.JSlider j3;
    private boolean conectarActivo;

    private  int brazo = 1;
    private  int rotacion = 1;

    @Override
    public void run() {

        try {
            
            server = new ServerSocket(1234);
            server.setReuseAddress(true);
            System.out.println("Estableciendo conexión...");

            conectarActivo = true;
            
            while (conectarActivo) {
                //Esperar a que alguien se conecte
                cliente = server.accept();
                System.out.println("Conectado");
                // Alguien se conectó
                InputStream inputstream = cliente.getInputStream();
                ObjectInputStream objetinputstream = new ObjectInputStream(inputstream);
                ArrayList<Integer> messages = (ArrayList<Integer>) objetinputstream.readObject();
                System.out.println("messages" + messages);
                messages.get(0);
                messages.get(1);
                System.out.println("Brazo" + messages.get(0));
                System.out.println("Rotacion" + messages.get(1));
                brazo = messages.get(0);
                rotacion = messages.get(1);
                switch(brazo){
                    case 1 : j1.setValue(rotacion); break;
                    case 2 : j2.setValue(rotacion); break;
                    case 3 : j3.setValue(rotacion); break;
                }
            }
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(SocketServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
   
    public int getBrazo() {
        return brazo;
    }
    
    public void mueveBrazo(javax.swing.JSlider jSlider1,javax.swing.JSlider jSlider2,javax.swing.JSlider jSlider3 ){
        j1=jSlider1;
        j2=jSlider2;
        j3=jSlider3;
    }

    public void setBrazo(int brazo) {
        this.brazo = brazo;
    }

    public int getRotacion() {
        return rotacion;
    }

    public void setRotacion(int rotacion) {
        this.rotacion = rotacion;
    }
}
