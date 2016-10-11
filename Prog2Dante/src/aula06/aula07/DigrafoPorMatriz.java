/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06.aula07;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 *
 * @author Marlon
 */
public class DigrafoPorMatriz{
    
    private Object[] vertices;
    private Object[][] adjacencias;
    
    public DigrafoPorMatriz() {
        vertices = new Object[0];
        adjacencias = new Object[0][0];
    }
    
    @Override
    public String toString() {
        String resp = "";
        
        if (vertices.length > 0) {
            for (int i = 0; i < vertices.length; i++) {
                resp += vertices[i] + "\t";            
            }

            resp += "\nMatriz de Adjacencias: \n";
            for (int i = 0; i < adjacencias.length; i++) {
                for (int j = 0; j < adjacencias[i].length; j++) {
                    resp += adjacencias[i][j] + "\t";                
                }
                resp += "\n";
            }
        } else resp += "A matriz está vazia\n";
        
        return resp;
    }
    
    public boolean insereVertice(Object newObj){
        Object[] novosVertices = new Object[vertices.length + 1];
        
        for (int i = 0; i < vertices.length; i++) {
            if (vertices[i] == newObj) return false;
            
            novosVertices[i] = vertices[i];
        }
        
        novosVertices[vertices.length] = newObj;
        vertices = novosVertices;
        
        Object[][] novasAdjacencias 
                = new Object[vertices.length][vertices.length];
        
        for (int i = 0; i < adjacencias.length; i++) {
            for (int j = 0; j < adjacencias.length; j++) {
                novasAdjacencias[i][j] = adjacencias[i][j];
            }                                   
        }            
        
        for (int i = 0; i < novasAdjacencias.length; i++) {
            novasAdjacencias[i][adjacencias.length] = "-";
            novasAdjacencias[adjacencias.length ][i] = "-";        
        }
        
        adjacencias = novasAdjacencias;
        
        
        return true;
    }
    
    public boolean insereArco(Object origem, Object destino, Object custo){
        
        int ondeOrigem = localiza(origem);
        int ondeDestino = localiza(destino);
        
        if (ondeOrigem != -1 && ondeDestino != -1){ 
            adjacencias[ondeOrigem][ondeDestino] = custo;
            return true;
        } else return false;
        
    }
    
    public boolean salvar(String nomeArq){
        ObjectOutputStream arq = null;
        
        try { 
            arq = new ObjectOutputStream(new FileOutputStream(nomeArq));
            arq.writeInt(vertices.length);
            for (int i = 0; i < vertices.length; i++) {
                arq.writeObject(vertices[i]);
                for (int j = 0; j < vertices.length; j++) {
                    arq.writeObject(adjacencias[i][j]);
                }
            }
        } catch (Exception xibu){
            System.out.println(xibu);
        } finally {
            if (arq != null) {
                try {
                    arq.close();
                    return true;
                } catch(Exception xibu){
                    System.out.println(xibu);
                }
            }
        }
        return false;
    }
    
    public boolean carregar(String nomeArq){
        ObjectInputStream arq = null;
        
        try {
            arq = new ObjectInputStream(new FileInputStream(nomeArq));
            int dimensao = arq.readInt();
            vertices = new Object[dimensao];
            adjacencias = new Object[dimensao][dimensao];
            
            for (int i = 0; i < dimensao; i++) {
                vertices[i] = arq.readObject();   
                for (int j = 0; j < dimensao; j++) {
                    adjacencias[i][j] = arq.readObject();
                }
            }
            arq.close();
            
        } catch(Exception e){
            System.out.println(e);
            return false;
        }
        return true;
    }
    
    public int localiza(Object onde){
        
        for (int i = 0; i < vertices.length; i++){
            if (onde == vertices[i]) return i;
        }
        return -1;
}

    
}
