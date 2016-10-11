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
public class PetShop {
    
    private Animal[] animals;
    private int freeSpace = 0;
    
    public PetShop(int capacity){
        animals = new Animal[capacity];
    }
    
    @Override
    public String toString(){
        String resp = "A capacidade é: " + animals.length + ". dos quais estão cheios: " 
                + freeSpace;
        for (int i = 0; i < freeSpace; i++) {
            resp += "\nPet " + i +": " + animals[i];
            
        }
        return resp;
    }
    
    public boolean insertPet(Animal pet){
        if (freeSpace != animals.length){
            animals[freeSpace] = pet;
            freeSpace++;
            return true;
        }
        else{
            return false;
        }
    }
    
}
