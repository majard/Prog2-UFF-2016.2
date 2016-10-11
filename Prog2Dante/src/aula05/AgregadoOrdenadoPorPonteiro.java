/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05;

import java.io.*;
import aula03.Comparavel;

/**
 *
 * @author Marlon
 */
public class AgregadoOrdenadoPorPonteiro {
    private int dataQt;
    private ListaOrdenavel list;
    
    public AgregadoOrdenadoPorPonteiro(){
        dataQt = 0;
    }
    
    @Override
    public String toString(){
        if (list != null){
            return "dataqt: " + dataQt + " " + list.toString();
        } else return "a lista está vazia";
    }
    
    public boolean insert(Comparavel dat) {
        if (list == null) {
            list = new ListaOrdenavel(dat, null);
        } else {
            if (dat.menor(list.data)){
                list = new ListaOrdenavel(dat, list);
            } else {
                ListaOrdenavel current, after;
                current = list;
                after = list.next;
                
                while (after != null && after.data.menor(dat)) {
                    current = after;
                    after = current.next;                    
                }
                
                if (after == null){
                    current.next = new ListaOrdenavel(dat, null);
                } else {
                    if (after.data.igual(dat)){
                        return false;
                    } else {
                        current.next = new ListaOrdenavel(dat, after);
                    }                 
                }
            }
        }
        
        dataQt++;
        return true;
        
    }
    
    public boolean save(String saveFile){
        ObjectOutputStream arq = null;
        
        try {
            arq = new ObjectOutputStream(
                    new FileOutputStream(saveFile));
            arq.writeInt(dataQt);
            arq.writeObject(list);
            
        } catch (Exception e){
            System.out.println("An exception ocurred: " + e.getMessage());
            return false;
        } finally {
            try {
                if (arq != null){
                    arq.close();
                } 
            }catch (Exception e){
                System.out.println("Couldn't close the file: " 
                        + e.getMessage());
                return false;
            }
        }
        
        return true;
    }
    
    public boolean load(String saveFile){
        ObjectInputStream arq = null;
        
        try {
            arq = new ObjectInputStream(
                    new FileInputStream(saveFile));
            dataQt = arq.readInt();
            list = (ListaOrdenavel) arq.readObject();
        } catch(Exception e) {
            System.out.println("I/O error: " + e.getMessage());
            return false;
        } finally {
            if (arq != null){
                try {
                    arq.close();
                } catch(Exception e) {
                    System.out.println("Error closing the file"
                    + e.getMessage());
                    return false;
                }                
            }
        }
        
        return true;        
    }
    
}
