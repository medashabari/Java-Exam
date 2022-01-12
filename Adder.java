/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author Shabari
 */
import java.rmi.Remote;
import java.rmi.RemoteException;
public interface Adder extends Remote{
  public int add(int m1,int m2) throws RemoteException;
}
