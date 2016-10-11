package aula04;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.Serializable;

/**
 *
 * @author Marlon
 */
public class Pneu implements Serializable{
    private String marca;
    private double radius;
    
    public Pneu(String mar, double rad){
        marca = mar;
        radius = rad;
    }
    
    @Override
    public String toString(){
        return radius + " - " + marca;
    }
}
