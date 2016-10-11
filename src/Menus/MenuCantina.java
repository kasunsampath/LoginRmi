package Menus;


import Menus.Produto;
import Menus.Carteira;
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DUDE
 */
public class MenuCantina extends Produto{
    
    Carteira cart = new Carteira();
    double prod;
    public static void menu(){
        int menu;
            
          menu = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção:"+
              "\n1.Café Preto"+
              "\n2.Sanduíche"+
              "\n3.Cachorro Quente"+
              "\n4.Barra de Proteina"+
              "\n5.Suco Natural"));
             
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
            
            default:
                System.out.println("Opção inválida.");
            }

    }
    
    public static void cafe(){
         Carteira cart = new Carteira();
         double cafe = 2.00;
         double saldo =cart.getCarteira() - cafe;
         System.out.println("Você escolheu um café e será direcionado à fila de atendimento. O valor do produto é:"+cafe);
         System.out.println(+saldo);
       
        
    }
    public static void sanduiche(){
        Carteira cart = new Carteira();
        double sanduiche = 3.00;
        double saldo =cart.getCarteira() - sanduiche;
        System.out.println("Você escolheu um sanduíche e será direcionado à fila de atendimento. O valor do produto é:"+sanduiche);
        System.out.println(+saldo);
        
    }
    
    public static void cachorro(){
        Carteira cart = new Carteira();
        double cachorroquente = 4.50;
        double saldo = cart.getCarteira() - cachorroquente;
        System.out.println("Você escolheu um cachorro quente e será direcionado à fila de atendimento. O valor do produto é:"+cachorroquente);
        System.out.println(+saldo);
    
    }
    
    public static void barra(){
        Carteira cart = new Carteira();
        double barraproteina = 4.00;
        double saldo = cart.getCarteira() - barraproteina;
        System.out.println("Você escolheu uma barra de proteína e será direcionado à fila de atendimento. O valor do produto é:"+barraproteina);
        System.out.println(+saldo);
      
    }
    public static void suco(){
        Carteira cart = new Carteira();
        double suconatural = 3.00;
        double saldo = cart.getCarteira() - suconatural;     
        System.out.println("Você escolheu um suco natural e será direcionado à fila de atendimento. O valor do produto é:"+suconatural);
         System.out.println(+saldo);
      
    }
    
    
    public static void main(String[] args) {
//        int opcao;
//        Scanner entrada = new Scanner(System.in);
//        
////        do{
////            menu();
//            opcao = entrada.nextInt();
//            
//            switch(opcao){
//            case 1:
//                cafe();
//                break;
//                
//            case 2:
//                sanduiche();
//                break;
//                
//            case 3:
//                cachorro();
//                break;
//                
//            case 4:
//                barra();
//                break;
//                
//            case 5:
//                suco();
//                break;
//            
//            default:
//                System.out.println("Opção inválida.");
//            }
////        } while(opcao != 0);
    }
    
    

}
