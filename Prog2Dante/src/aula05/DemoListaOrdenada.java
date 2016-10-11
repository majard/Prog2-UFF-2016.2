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
public class DemoListaOrdenada {
    public static void main(String[] args) {
        Pessoa person = new Pessoa("142", "Marlon");
        ListaOrdenada agenda = new ListaOrdenada(person, null);      
        System.out.println(agenda);
        person = new Pessoa("119", "Rebeca");
        agenda = new ListaOrdenada(person, agenda);
        System.out.println(agenda);
        person = new Pessoa("222", "Vinicius");
        agenda = new ListaOrdenada(person, agenda);
        System.out.println(agenda);
        person = new Pessoa("222", "Vinicius");
        agenda = new ListaOrdenada(person, agenda);
        System.out.println(agenda);
        person = new Pessoa("123", "Bernardo");
        agenda = new ListaOrdenada(person, agenda);
        System.out.println(agenda);
        person = new Pessoa("777", "Layla");
        agenda = new ListaOrdenada(person, agenda);
        System.out.println(agenda);
    }
    
}
