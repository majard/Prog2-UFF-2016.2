/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02;

import java.io.Serializable;
import aula03.Comparavel;

/**
 *
 * @author Marlon
 */
public class Pessoa implements Comparavel, Serializable{
    private String name, cpf;
    
    
    public Pessoa(String cpf, String name){
        this.name = name;
        this.cpf = cpf;
    }
    
    @Override
    public String toString(){
        return "name: " + name + " cpf: " + cpf;        
    }

    @Override
    public boolean menor(Comparavel objeto) {
       return (name.compareTo(((Pessoa)objeto).name) < 0);
    }
    
    @Override
    public boolean igual(Comparavel objeto) {
        return (name.equals(((Pessoa)objeto).name) && 
                cpf.equals(((Pessoa) objeto).cpf));
    }
    
    @Override
    public boolean maior(Comparavel objeto) {
        return (!menor(objeto) && !igual(objeto));
    }
    
}
