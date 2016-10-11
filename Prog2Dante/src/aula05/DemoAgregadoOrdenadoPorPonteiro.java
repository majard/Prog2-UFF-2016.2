/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05;

import aula02.Pessoa;

/**
 *
 * @author Marlon
 */
public class DemoAgregadoOrdenadoPorPonteiro {
    public static void main(String args[]){
        
        AgregadoOrdenadoPorPonteiro agenda = null;
        System.out.println(agenda);
        agenda = new AgregadoOrdenadoPorPonteiro();
        System.out.println(agenda.insert(new Pessoa("142","Marlon")));
        System.out.println(agenda);
        System.out.println(agenda.insert(new Pessoa("119","Rebeca")));
        System.out.println(agenda);
        System.out.println(agenda.insert(new Pessoa("231","Arnaldo")));
        System.out.println(agenda);
        System.out.println(agenda.save("test.obj"));
        agenda = new AgregadoOrdenadoPorPonteiro();
        System.out.println(agenda);
        System.out.println(agenda.load("test.obj"));
        System.out.println(agenda);
    }
    
}
