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
public class MyClient2 {
    public static void main(String args[]){
        try{
            Socket clientSocket = new Socket("localhost",3333);
            DataInputStream cin = new DataInputStream(clientSocket.getInputStream());
            DataOutputStream cout = new DataOutputStream(clientSocket.getOutputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String str="", str2="";

            while(!str.equals("stop")){

                str=br.readLine();
                cout.writeUTF(str);
                cout.flush();
                str2= cin.readUTF();
                System.out.println("Server says: "+str2);  
            }
            
            cout.close();  
            clientSocket.close(); 
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
