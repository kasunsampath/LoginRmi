/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login.Server;

/**
 *
 * @author User
 */
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import login_imprement.LoginImplement;
import login_imprement.MenuImplemente;
public class LoginServer 
{
 public static void main(String[]args)
 {
     try 
     {
           Registry reg=LocateRegistry.createRegistry(1099);
           //aqui chama login proto
           LoginImplement lp=new LoginImplement();
           // aqui chama menu implementado.
           
           MenuImplemente mp= new MenuImplemente();
           
           reg.rebind("login", lp);
           System.out.println("Servidor OK");
           
           
     } 
     
     catch (Exception ex) 
     {
     }
 }   
}
