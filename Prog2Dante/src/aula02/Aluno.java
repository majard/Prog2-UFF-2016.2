/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02;
import java.io.Serializable;
/**
 *
 * @author Marlon
 */
public class Aluno extends Pessoa implements Serializable{
    private String curso, matricula;
    private float cr;
    
    public Aluno(String cp, String nam, String cur, String mat, float cr){
        super(cp, nam);
        curso = cur;
        matricula = mat;
        this.cr = cr;
    }
    
    @Override
    public String toString(){
        return super.toString() + " curso: " + curso + " matricula: " 
                + matricula + " cr: " + cr;
    }
}
