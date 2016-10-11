/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06;

import aula02.Pessoa;

/**
 *
 * @author Marlon
 */
public class DemoAgregadoOrdenadoBinario {
    
    public static void main(String args[]){
        AgregadoOrdenadoBinario agenda = new AgregadoOrdenadoBinario();
        System.out.println(agenda);
        System.out.println(agenda.insert(new Pessoa("142","Marlon")));
        System.out.println(agenda);
        System.out.println(agenda.insert(new Pessoa("119","Rebeca")));
        System.out.println(agenda);
        System.out.println(agenda.insert(new Pessoa("333","Arnaldo")));
        System.out.println(agenda);
    }
    
}
