/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula01;

/**
 *
 * @author Marlon
 */
public class Animal {
    
    private float weight;
    private String species;
    private String name;
    
    public Animal(float wgt, String spc, String nm){
        weight = wgt;
        species = spc;
        name = nm;       
    }
    
    @Override
    public String toString(){
        return "weight: " + weight + ", species: " + species 
                + ", name: " + name;
    }
    
    
}
