/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aula06.aula07;

/**
 *
 * @author Dante
 */
public class DemoDigrafoPorMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DigrafoPorMatriz rede = new DigrafoPorMatriz();
        System.out.println(rede);
        System.out.println(rede.insereVertice("Rio de Janeiro"));
        System.out.println(rede);
        System.out.println(rede.insereVertice("São Paulo"));
        System.out.println(rede);
        System.out.println(rede.insereArco("São Paulo", "Rio de Janeiro", 13));
        System.out.println(rede);
        System.out.println(rede.insereArco("Rio de Janeiro", "São Paulo", 12));
        System.out.println(rede);
        System.out.println(rede.salvar("rede.objs"));
        rede = new DigrafoPorMatriz();
        System.out.println(rede);
        System.out.println(rede.carregar("rede.objs"));
        System.out.println(rede);
//        Choppada nossa = new Choppada("CC", 498, 13.13);
//        Choppada deles = new Choppada("SI", 321, 11.13);
//        System.out.println(rede.insereVertice(nossa));
//        System.out.println(rede);
//        System.out.println(rede.insereVertice(deles));
//        System.out.println(rede);
//        System.out.println(rede.insereArco(nossa,deles, 3.31 ));
//        System.out.println(rede);
//        System.out.println(rede.salvar("chopps.objs"));
//        System.out.println(rede.carregar("chopps.objs"));
//        System.out.println(rede);
    }
    
}
