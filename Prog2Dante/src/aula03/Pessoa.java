/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03;

import java.io.Serializable;

/**
 *
 * @author Marlon
 */
public class Pessoa implements Serializable{
    private String cpf;
    
    public Pessoa(String cpf){
        this.cpf = cpf;
    }
    
    public static void main(String[] args) {
        Pessoa pe1 = new Pessoa("142");
        Pessoa pe2 = new Pessoa("100");
        
        System.out.println(pe1.cpf.compareTo(pe2.cpf));
    }
}
