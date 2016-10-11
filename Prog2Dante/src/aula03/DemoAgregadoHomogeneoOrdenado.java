/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03;

import aula02.Aluno;

/**
 *
 * @author Marlon
 */
public class DemoAgregadoHomogeneoOrdenado {
    public static void main(String[] args) {
        Aluno mah = new Aluno("142", "Marlon", "CC", "116031030", (float) 6.5);
        System.out.println(mah);
        AgregadoHomogeneoOrdenado UFF = new AgregadoHomogeneoOrdenado(20);
        UFF.insert(mah);
        System.out.println(UFF);
        UFF.insert(new Aluno("119", "Rebeca", "DI", "123124", (float) 8.2));
        System.out.println(UFF.insert(
                new Aluno("122", "Layla", "CC", "231124", (float) 7.2)));
        System.out.println(UFF.insert(
                new Aluno("142", "Marlon", "CC", "116031030", (float) 9.5)));
        System.out.println(UFF);
        UFF.save("uff.obj");
        UFF = new AgregadoHomogeneoOrdenado();
        System.out.println(UFF);        
        UFF = UFF.load("uff.obj");
        System.out.println(UFF);
    }
    
}
