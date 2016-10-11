
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p12016.p1;

/**
 *
 * @author Marlon
 */
public class TabelaOrdenada {
    
    private Comparavel[] itens;
    private int livre;
    
    public TabelaOrdenada(int capacidade){
        itens = new Comparavel[capacidade];
        livre = 0;
    }
    
    @Override
    public String toString(){

        String resp = "";

        for (int i = 0; i < livre; i++){
            resp += itens[i] + "\n";	                            
        }

	return resp;
    }

    public boolean insere(Comparavel outro){         
	
	int i = 0;
	
	if (livre == itens.length) return false;

	while ((i < livre) && (itens[i].menor(outro))){   
	    i++;
	}
	
	if (i < livre){
	    if (itens[i].igual(outro)) return false;
	    int j = livre;
	    while (j > i){
		itens[j] = itens[j-1];
		j--;
            }	    
	}
	
	itens[i] = outro;
	return true;
    }

    public boolean remove(Comparavel outro){
	
	int i = 0;
	
	while ((i < livre) && !(itens[i].igual(outro))){
	    i++;
	}
	
	if (i == livre) return false;
	
	while (i < livre - 1){
	    itens[i] = itens[i + 1];
	    i++;
	}
	
	itens[i] = null;
    }

    public boolean modifica(Comparavel eleModif){
	

}








