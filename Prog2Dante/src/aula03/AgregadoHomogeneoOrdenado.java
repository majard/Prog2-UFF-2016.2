/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03;

import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.Serializable;
import java.io.IOException;
        
/**
 *
 * @author Marlon
 */
public class AgregadoHomogeneoOrdenado implements Serializable{
    
    private Comparavel[] data;
    private int currentIndex;
    
    public AgregadoHomogeneoOrdenado(){
        data = new Comparavel[100];
        currentIndex = 0;
    }
    
    public AgregadoHomogeneoOrdenado(int capacity){
        data = new Comparavel[capacity];
        currentIndex = 0;
    }
    
    @Override
    public String toString(){
        String resp = "Size of array: " + data.length + "; of which " 
                + currentIndex + " are occupied\n";
        
        for (int i = 0; i < currentIndex; i++) {    
            resp += (i + 1) + " - " + data[i] + "\n";
        }
        
        return resp;
    }
    
    public boolean insert(Comparavel newObject){
        if (currentIndex > data.length || currentIndex < 0){
            return false;
            
        } else {
            int index = 0;
            
            while (index < currentIndex && data[index].menor(newObject)){
                index++;
            }
            
            if (index < currentIndex && data[index].igual(newObject)){
                return false;
            } else {
                for (int j = currentIndex + 1; j > index; j--) {
                    data[j] = data[j - 1];
                }
                
                data[index] = newObject;
                currentIndex++; 
                return true;
            
            }            
        }
    }
    
    public boolean save(String arqName){
        
        try(ObjectOutputStream arq = new ObjectOutputStream(
                new FileOutputStream(arqName))) {
            arq.writeObject(this);
            return true;
            
        } catch(IOException e){
            System.out.println("I/O Exception: " + e.getMessage());
            return false;
        } catch(Exception e){
            System.out.println("Exception: " + e.getMessage());
            return false;
        }
        
    }
    
    public AgregadoHomogeneoOrdenado load(String arqName){
        try(ObjectInputStream arq = new ObjectInputStream(
        new FileInputStream(arqName))){
            AgregadoHomogeneoOrdenado temp = 
                    (AgregadoHomogeneoOrdenado) arq.readObject();
            return temp;
        } catch(IOException e){
            System.out.println("I/O exception: " + e.getMessage());
            return null;
        } catch (Exception e){
            System.out.println("Exception: " + e.getMessage());
            return null;
        }
    }
}
