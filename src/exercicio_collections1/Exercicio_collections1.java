/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercicio_collections1;

import java.util.Scanner;

/**
 *
 * @author BD
 */
public class Exercicio_collections1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int pos = 0 ; 
         do{
    System.out.println("insira 1 para exercicio1 , 2 para exercicio2 e 0 para sair");
           
    pos = new Scanner(System.in).nextInt();
    switch (pos){
        case 1:
             new Exer21();
            break;
            
        case 2:
           new Aluno();
           break;
        case 0:
            break;
    
    }
    
    }while (pos != 0) ;
        
        
    
    }
    
}
