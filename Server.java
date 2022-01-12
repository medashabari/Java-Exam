/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Shabari
 */
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
public class Server extends UnicastRemoteObject implements Adder{
    public Server() throws RemoteException
    {
        super();
    }
    public int add(int m1,int m2) throws RemoteException
    {
    return m1+m2;
    }
    public static  void main (String args[]) throws RemoteException
    {
    try{
    Registry reg=LocateRegistry.createRegistry(1022);
    reg.rebind("server",new Server());
    System.out.println("Server is running");
    }
    catch(RemoteException e)
    {
    System.out.println(e);
    }
    }
    
}
