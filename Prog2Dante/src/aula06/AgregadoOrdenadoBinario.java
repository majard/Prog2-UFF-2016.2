/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06;

import aula03.Comparavel;

/**
 *
 * @author Marlon
 */
public class AgregadoOrdenadoBinario {
    
    private BinariaOrdenavel data;
    private int dataQt;
    
    public AgregadoOrdenadoBinario(){
        dataQt = 0;
        data = null;
    }
    
    @Override
    public String toString() {
        return "Data qt: " + dataQt + "\n" + data;
    }
    
    public boolean insert(Comparavel newData){
        if (data == null){
            data = new BinariaOrdenavel(newData, null, null);
            dataQt++;
            return true;
        } else {
            return insert(newData, data);
        }
        
    }
    
    public boolean insert(Comparavel newData, BinariaOrdenavel parent){
        if (newData.igual(parent.info)){
            return false;
        } else if (newData.menor(parent.info)){
            if (parent.left == null){
                parent.left = new BinariaOrdenavel(newData, null, null);
            } else return insert(newData, parent.left);
        } else {
            if (parent.right == null){
                parent.right = new BinariaOrdenavel(newData, null, null);
            } else return insert(newData, parent.right);
        }
        
        dataQt++;
        return true;
    }
}
