/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginform_rmi;

/**
 *
 * @author User
 */
import java.rmi.*;

public interface MenuInterface extends Remote
{
 public boolean getCantina(String user, String pass ) throws RemoteException;
    
}
