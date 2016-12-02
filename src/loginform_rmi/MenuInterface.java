
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
package loginform_rmi;

/**
 *
 * @author User
 */
/*
import java.rmi.*;

public interface MenuInterface extends Remote
{
 public boolean getCantina(String user, String pass ) throws RemoteException;
    
}
 */


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
import javax.swing.JOptionPane;

public interface MenuInterface extends Remote
        
{
 //public boolean getOpcao(String opcao) throws RemoteException;
    
 public double cafe(double valorCateira) throws RemoteException;
 public double sanduiche(double valorCateira) throws RemoteException;
 public double cachorro(double valorCateira) throws RemoteException;
 public double barra(double valorCateira) throws RemoteException;
 public double suco(double valorCateira) throws RemoteException;
 public void mostrarFila() throws RemoteException;
 public double saldo(double carteira, double valor)throws RemoteException;
 
 
 

  //  public MenuInterface getOpcao(MenuInterface opcao);
 
 
 
 
 
 
}



 