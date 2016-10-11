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
public class DemoPetShop {
    public static void main(String[] args) {
        PetShop petPlace = new PetShop(20);
        System.out.println(petPlace);
        System.out.println(petPlace.insertPet((new Animal(
                (float)4.0, "cat", "Artie"))));
        System.out.println(petPlace);
    }
}
