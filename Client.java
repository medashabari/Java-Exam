/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Shabari
 */
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
public class Client {
    public static void main(String args[])
    {
    Client c = new Client();
    c.connectServer();
    }
    private void connectServer()
    {
    try
    {
    Registry reg = LocateRegistry.getRegistry("localhost",1022);
    Adder a=(Adder) reg.lookup("server");
    System.out.println("Addition is"+a.add(10,20));
    }
    catch(Exception e)
    {
    System.out.println(e);
    }
}
}
