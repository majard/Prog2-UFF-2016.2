/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04;

import java.io.Serializable;
/**
 *
 * @author Marlon
 */
public class Motor implements Serializable{
    private double potencia;
    private String combustivel;
    
    public Motor(double pot, String comb){
        potencia = pot;
        combustivel = comb;
    }
    
    @Override
    public String toString(){
        return potencia + " " + combustivel;
    }
    
}
