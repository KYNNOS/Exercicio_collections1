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
   
    public String Nome; 
    public double Nota;  
    public int  Contato;

    public Aluno() {
    inserir();
    }
        

    public Aluno(String Nome, double Nota, int Contato) {
         this.Nome = Nome;
      this.Nota = Nota;
      this.Contato = Contato;
        
        
        
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setNota(double Nota) {
        this.Nota = Nota;
    }

    public void setContato(int Contato) {
        this.Contato = Contato;
    }

    public String getNome() {
        return Nome;
    }

    public double getNota() {
        return Nota;
    }

    public int getContato() {
        return Contato;
    }
    
    public void inserir(){
    ArrayList student = new ArrayList();
    student.add(0, new Aluno("Peter", 100, 965022465));
    student.add(1, new Aluno("frank", 50.5, 965022465));
    student.add(2, new Aluno("ralf", 22.6, 965022465));
    student.add(3, new Aluno("lary", 10, 965022465));
    student.add(4, new Aluno("kast", 52, 965022465));
    
    Iterator it = student.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        
    
    }
    
    
    
    
    
    }}
