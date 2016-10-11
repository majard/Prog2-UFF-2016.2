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
public class BinariaOrdenavel {
    public Comparavel info;
    public BinariaOrdenavel left, right;
    
    public BinariaOrdenavel(Comparavel i,
            BinariaOrdenavel l, BinariaOrdenavel r){
        info = i;
        left = l;
        right = r;
    }
    
    @Override
    public String toString(){
        if ((left == null) && (right == null)){
            return info.toString();
        } else if (left == null){
            return info.toString() + " " + right.toString();
        } else if (right == null) {
            return left.toString() + " " + info.toString();
        } else {
            return left.toString() + " " + info.toString() 
                    + " " + right.toString();
        }
    }
    
}
