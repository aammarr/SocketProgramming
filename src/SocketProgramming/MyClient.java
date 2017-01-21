/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SocketProgramming;

import java.net.*;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author ammar
 */
public class MyClient {
    
    public static void main(String[] args){
        try{
            
            Socket socketClient=new Socket("localhost",6666);
            DataOutputStream out = new DataOutputStream(socketClient.getOutputStream());
            System.out.println("This is Client! ");
            
            Scanner scan = new Scanner(System.in);
            String text = scan.next();
           
            out.writeUTF("Hello Server "+text);
            out.flush();
            out.close();
            socketClient.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }   
}
