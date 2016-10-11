/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05;

import aula03.Comparavel;
import java.io.Serializable;

/**
 *
 * @author Marlon
 */
public class ListaOrdenavel implements Serializable{
    public Comparavel data;
    public ListaOrdenavel next;
    
    public ListaOrdenavel(Comparavel dat, ListaOrdenavel nex){
        data = dat;
        next = nex;
    }
    
    @Override
    public String toString(){
        if (next == null){
            return data.toString();
        } else {
            return data.toString() + " -> " + next.toString();
        }
    }
    
}
