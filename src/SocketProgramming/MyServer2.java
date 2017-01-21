/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SocketProgramming;

import java.io.*;
import java.io.IOException;
import java.net.*;

/**
 *
 * @author ammar
 */
public class MyServer2 {
    public static void main(String[] args) throws IOException{
        try{
            
            ServerSocket sSocket = new ServerSocket(3353);
            Socket server2socket = sSocket.accept();
            DataInputStream input = new DataInputStream(server2socket.getInputStream());
            DataOutputStream output = new DataOutputStream(server2socket.getOutputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Server2 has started!");
            String str="", str2="";
            
            
            while(!str.equals("stop")){
                str=input.readUTF();
                System.out.println("Client says: "+str);
                str2=br.readLine();
                output.writeUTF(str2);
                output.flush();
            }
            input.close();
            server2socket.close();
            sSocket.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
