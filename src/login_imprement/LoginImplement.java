/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login_imprement;

/**
 *
 * @author User
 */
import Menus.Carteira;
import Menus.MenuCantina;
import Menus.MenuCantinaClient;
import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import javax.swing.JOptionPane;
import loginform_rmi.LoginInterface;
public class LoginImplement extends UnicastRemoteObject implements LoginInterface
{
    Carteira cart = new Carteira();

    public LoginImplement()throws RemoteException
    {
     
    }
    public boolean getLogin(String user, String pass) throws RemoteException 
    {
         
        boolean found=false;
        try 
        {
            if(user.equals("admin") && pass.equals("123")||user.equals("admin1") && pass.equals("1234")||user.equals("admin2") && pass.equals("12345") )
            {
          // Carteira cart1 = new Carteira();
            //    System.out.println("Seu saldo é de:"+cart1.getCarteira());
   // MenuCantina menucan = new MenuCantina();
         //   menucan.menu();
             
                
                
                
                  JOptionPane.showMessageDialog(null, "Login com sucesso");
                System.out.println("Seu saldo é de:"+cart.getCarteira());
            MenuCantina menucan = new MenuCantina();
                MenuCantinaClient menunca1 = new MenuCantinaClient();
            
                
                
           // menucan.menu();
            
            menunca1.menu();
            
               return found=true;
                
            }
            else
            {
                return found=false;
            }
        } 
        
        catch (Exception ex) 
        {
            ex.printStackTrace();
        }
       
        return found;
        
        
    }
    
}
