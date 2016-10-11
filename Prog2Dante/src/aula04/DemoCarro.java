/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Marlon
 */
public class DemoCarro{
    public static void main(String[] args) 
            throws IOException, ClassNotFoundException {
        
        Pneu[] pn = new Pneu[2];
        pn[0] = new Pneu("Pirelli", 33);
        pn[1] = new Pneu("Michelin", 44);
        Carro car = new Carro("12312343", new Motor(1.6, "gasolina" ), pn);
        System.out.println(car);
        ObjectOutputStream saveFile = new ObjectOutputStream(
                new FileOutputStream("car.obj"));
        saveFile.writeObject(car);
        saveFile.close();
        car = null;
        System.out.println(car);
        ObjectInputStream loadFile = new ObjectInputStream(
                new FileInputStream("car.obj"));
        car = (Carro) loadFile.readObject();
        loadFile.close();
        System.out.println(car);
    }
    
    
}
