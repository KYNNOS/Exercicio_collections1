/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_collections1;

import java.util.ArrayList;
import java.util.Iterator;
import static jdk.nashorn.tools.ShellFunctions.input;

/**
 *
 * @author BD
 */


public class Aluno {
   
    private String nome;
    private int nota;
    private String contacto;
    
    public Aluno(){
        setAluno("Peter", 100, 965022465);
        setAluno("frank", 50.5, 965022465);
        setAluno("ralf", 22.6, 965022465);
        setAluno("lary", 10, 965022465);
        setAluno("kast", 52, 965022465);
       ordenar();
    }
    
    public String getNome() {
        return nome;
    }

    public int getNota() {
        return nota;
    }

    public String getContacto() {
        return contacto;
    }

    public void setAluno(String nome,int nota,String contacto){
        this.nome=nome;
        this.nota=nota;
        this.contacto=contacto;
        nAluno.add(getNome()+" | "+getNota()+" | "+getContacto());
    }
    
    ArrayList<Object> nAluno= new ArrayList<>();    
            
    public void ordenar(){
        ArrayList temp = new ArrayList();
        for(int i=0;i<nAluno.size();i++){
            System.out.println(nAluno.get(i));
        }
    }
 
    
    
    
    
    
    }
