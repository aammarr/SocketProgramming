/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SocketProgramming;

import java.io.*;
import java.net.*;

/**
 *
 * @author ammar
 */
public class Myserver {
    
    public static void main(String[] args){
        try{
            System.out.println("Server has started! ");
            ServerSocket ss = new ServerSocket(6666);
            Socket socketServer = ss.accept();         //establish connection
            DataInputStream in = new DataInputStream(socketServer.getInputStream());
            String str = (String)in.readUTF();
            System.out.println("message: "+str);
            
            ss.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
