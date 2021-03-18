/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.ps.communication;

import java.io.ObjectInputStream;
import java.net.Socket;

/**
 *
 * @author Matija
 */
public class Receiver {

    private Socket socket;

    public Receiver(Socket socket) {
        this.socket = socket;
    }

    public Object receive() throws Exception {
        ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
        try {
            //in = new ObjectInputStream(socket.getInputStream());
            return in.readObject();

        } catch (Exception e) {
            e.printStackTrace();
            in.close();
            throw new Exception("Error receiving object!\n" + e.getMessage());
        }
    }
}
