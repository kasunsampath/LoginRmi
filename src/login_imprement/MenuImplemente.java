

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
import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import loginform_rmi.LoginInterface;
public class MenuImplemente extends UnicastRemoteObject implements LoginInterface
{

    public MenuImplemente()throws RemoteException
    {
     
    }
    public boolean getMenu(String user, String pass) throws RemoteException 
    {
        boolean found=false;
        try 
        {
            if(user.equals("admin") && pass.equals("123")||user.equals("admin1") && pass.equals("1234")||user.equals("admin2") && pass.equals("12345") )
            {
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

    @Override
    public boolean getLogin(String user, String pass) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
