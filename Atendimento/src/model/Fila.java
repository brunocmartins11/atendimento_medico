package model;
import javax.swing.*;

import java.util.Arrays;
import java.util.Random;

public class Fila {
	
	public enum TipoPaciente{
		NORMAL, PREFERENCIAL;
	};

	
	    private int[] fila;            
	    private int capacidade;   
	    private int tamanho; 
	    private int i = 0;
	    private int j = 0;
	    private String a;
	
	    public Fila(){
	        tamanho = 10;
	        fila = new int[tamanho];
	        capacidade = 0;
	    }
	    
	    public int AdicionarPaciente() {
	    	Random aleatorio = new Random();
	    	int valor = aleatorio.nextInt(999);
	    	this.fila[i] = valor;
	    	JOptionPane.showMessageDialog(null, "Senha:" + fila[i]);
	    	capacidade ++;
	    	i++;
	    	return valor;
	    }
	    
	    public void ChamarFila() {
	    	JOptionPane.showMessageDialog(null, "Próximo paciente:  " + fila[0]);
	    	for (j=0;j < tamanho-1; j++) {
	    		fila[j] = fila[j + 1]; 
	    		
	    	}
	    	fila[tamanho-1] = 0;
	    	
	    	
	    	i--;
	    	capacidade --;
	    	
	    	
	    }
	    
	    public String showFila() {
	    	for(int k = 0; k < this.tamanho; k++) {
	    			a = Arrays.toString(this.fila);
	    	}
	    	return a;
	 }
	    
	    
	    public int[] getFila() {
			return fila;
		}

		public void setFila(int[] fila) {
			this.fila = fila;
		}

		public boolean estaVazia(){
	        if (capacidade == 0){
	            return true;
	        }
	        return false;
	    }

	    public boolean estaCheia(){
	        if (capacidade == tamanho){
	            return true;
	        }
	        return false;
	    }
}