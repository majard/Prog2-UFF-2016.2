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
public class Carro implements Serializable{
   private String renavam;
   private Motor engine;
   private Pneu[] pneus;
   
   public Carro(String rn, Motor eng, Pneu[] ps){
       renavam = rn;
       engine = eng;
       pneus = ps;
   }
   
   public String toString(){
       String resp = "Carro: " + renavam + "\t" + engine + "\n"; 
       for (int i = 0; i < pneus.length; i++) {
           resp += "\t" + pneus[i] + "\n";           
       }
       
       return resp;
   }
}
