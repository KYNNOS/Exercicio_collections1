/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_collections1;


import java.util.*;

/**
 *
 * @author BD
 */
public class Exer21 {
ArrayList lista = new ArrayList();
    public Exer21() {
         
         lista.add('b');
    lista.add(3);
    lista.add("Carruagens");
    lista.add(8.56);
    lista.add("caixas de armazenamento");
    int pos = 0;
    
    do{
    System.out.println("insira 1 para inserir , 2 para imprimir e 0 para sair");
        pos = new Scanner(System.in).nextInt();
    switch (pos){
        case 1:
             inserir();
            break;
            
        case 2:
           imprimir();
           break;
        case 0:
            break;
    
    }
    
    }while (pos != 0) ;
    
    }
    
    public void inserir(){
        String insert;
        System.out.println("insira");
        insert = new Scanner(System.in).nextLine();
        lista.add(insert);
        }
    public void imprimir(){
        Iterator it = lista.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        
    




    
    
    }
    
    
}
