/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Goremaggot
 */
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;



public class Cliente extends Conexion
{
    public Cliente() throws IOException{super("cliente");} //Se usa el constructor para cliente de Conexion

    public void startClient() //Método para iniciar el cliente
    {
        try
        {
            salidaServidor = new DataOutputStream(cs.getOutputStream());
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
    public void enviaMensaje(int brazo, int rotacion) throws IOException{
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(salidaServidor);
        ArrayList<Integer> messages;
        messages= new ArrayList<>();
        messages.add(brazo);
        messages.add(rotacion);
        objectOutputStream.writeObject(messages);
        System.out.println("Closing socket and terminating program.");
        //Fin de la conexión
    }
    public void close() throws IOException{
        cs.close();
    }       
}
