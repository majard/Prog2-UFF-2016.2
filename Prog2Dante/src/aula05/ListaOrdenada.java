/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05;

import aula03.Comparavel;

/**
 *
 * @author Marlon
 */
public class ListaOrdenada {
    private Comparavel data;
    private ListaOrdenada next;
    
    public ListaOrdenada(Comparavel dat, ListaOrdenada old){
        if (old == null){
            data = dat;
            next = null;
        } else {
            if (dat.menor(old.data)){
                data = dat;
                next = old;
            } else {
               ListaOrdenada current, after;
               current = old;
               after = current.next;
               
               while (after != null && after.data.menor(dat)){
                   current = after;
                   after = current.next;
               }
               
               if (after != null && !after.data.igual(dat)){
                    current.next = new ListaOrdenada(dat, after);
               } else {
                   after = new ListaOrdenada(dat, null);
                   current.next = after;
               }
               
               data = old.data;
               next = old.next;
            }
        }
    }
    
    
    @Override
     public String toString() {
        if (next == null){
            return data.toString();
        } else {
            return data.toString() + " -> " + next.toString();
        }
    }
    
}
