/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menus;

import static Login.Server.LoginServer.f;
import java.rmi.RemoteException;
import javax.swing.JOptionPane;
import loginform_rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author 
 */
public class MenuCantinaClient {
    Carteira cart;
    
    public MenuCantinaClient() {
         cart = new Carteira();
    }
        
    
    public void cafe() throws RemoteException {
        try{
            if(cart.getCarteira() > 2.50){
            Registry reg =LocateRegistry.getRegistry("127.0.0.1",1099);
          MenuInterface i=(MenuInterface)reg.lookup("menu");
       
       // f=i.getClass(cafe()txtusername.getText(),txtSenha.getText()); 
        f=i.get
                
                
         double saldo =cart.getCarteira() - 2.5;
        cart.setCarteira(saldo);
        System.out.println("Você escolheu um café e será direcionado à fila de atendimento. O valor do produto é: R$ 2,50");
        System.out.println(+saldo);
        }else{
           System.out.println("Você nao tem saldo suficiente para comprar!");
        }
           }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
    public void sanduiche() throws RemoteException {
       try{
           if(cart.getCarteira() > 3.00){
           Registry reg =LocateRegistry.getRegistry("127.0.0.1",1099);
            MenuInterface i=(MenuInterface)reg.lookup("menu");
            double saldo = i.sanduiche(cart.getCarteira());
            cart.setCarteira(saldo);
            System.out.println("Você escolheu um sanduíche e será direcionado à fila de atendimento. O valor do produto é: R$ 3,00");
            System.out.println(+saldo);       
            }else{
           System.out.println("Você nao tem saldo suficiente para comprar!");
           }
       }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }

    public void cachorro() throws RemoteException {
          try{
           if(cart.getCarteira() > 4.50){
           Registry reg =LocateRegistry.getRegistry("127.0.0.1",1099);
            MenuInterface i=(MenuInterface)reg.lookup("menu");
            double saldo = i.cachorro(cart.getCarteira());
            cart.setCarteira(saldo);
            System.out.println("Você escolheu um cachorro e será direcionado à fila de atendimento. O valor do produto é: R$ 4,50");
            System.out.println(+saldo);       
            }else{
           System.out.println("Você nao tem saldo suficiente para comprar!");
           }
       }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }

    public void barra() throws RemoteException {
        try{
           if(cart.getCarteira() > 4.00){
           Registry reg =LocateRegistry.getRegistry("127.0.0.1",1099);
            MenuInterface i=(MenuInterface)reg.lookup("menu");
            double saldo = i.barra(cart.getCarteira());
            cart.setCarteira(saldo);
            System.out.println("Você escolheu uma Barra de Proteina e será direcionado à fila de atendimento. O valor do produto é: R$ 4,00");
            System.out.println(+saldo);       
            }else{
           System.out.println("Você nao tem saldo suficiente para comprar!");
           }
       }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }

    public void suco() throws RemoteException {
         try{
           if(cart.getCarteira() > 3.00){
           Registry reg =LocateRegistry.getRegistry("127.0.0.1",1099);
            MenuInterface i=(MenuInterface)reg.lookup("menu");
            double saldo = i.suco(cart.getCarteira());
            cart.setCarteira(saldo);
            System.out.println("Você escolheu um suco e será direcionado à fila de atendimento. O valor do produto é: R$ 3,00");
            System.out.println(+saldo);       
            }else{
           System.out.println("Você nao tem saldo suficiente para comprar!");
           }
       }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
    public void mostrarFila(){
        System.out.println(f.mostrar());
    }

    public void menu() throws RemoteException {
        int menu;
            do
            {
          menu = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção:"+
              "\n1.Café Preto"+
              "\n2.Sanduíche"+
              "\n3.Cachorro Quente"+
              "\n4.Barra de Proteina"+
              "\n5.Suco Natural"+
              "\n6.Mostrar lista de pedidos"+
              "\n0.Sair"));
             
//          int opcao;
//            Scanner entrada = new Scanner(System.in);
//            opcao = entrada.nextInt();
            
            switch(menu){
            case 1:
                cafe();
                break;
                
            case 2:
                sanduiche();
                break;
                
            case 3:
                cachorro();
                break;
                
            case 4:
                barra();
                break;
                
            case 5:
                suco();
                break;
                
            case 6:
                mostrarFila();
                break;
            
            default:
                System.out.println("Opção inválida.");
            }
            }while(menu > 0);
    }
    
}
