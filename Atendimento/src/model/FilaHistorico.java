package model;

import java.util.Arrays;
import java.util.Random;
import javax.swing.JOptionPane;

import model.beans.Paciente;
import view.AtendimentoView;

public class FilaHistorico {

		
		public enum TipoPaciente{
			NORMAL, PREFERENCIAL;
		};

		
		    private String[] fila;            
		    private int capacidade;   
		    private int tamanho; 
		    private static int i = 0;
		    private static int j = 0;
		    private static String a;
		    
		    private String lista;
		
		    public FilaHistorico(){
		        tamanho = 10;
		        fila = new String[tamanho];
		        capacidade = 0;
		    }
		    
		    public String AdicionarHistorico(String nomePaciente, String especialidade, int idade, int senha) {

		    	lista = "Nome: " + nomePaciente + "\nEspecialidade: " + especialidade + "\nIdade: " + idade + "\nSenha: " + senha;
		    	
		    	this.fila[i] = lista;
		    	
		    	capacidade ++;
		    	i++;
		    	return lista;
		    }
		    
		    public void ChamarFila() {
		    	JOptionPane.showMessageDialog(null, "Pr�ximo pedido: " + fila[0]);
		    	for (j=0;j < tamanho-1; j++) {
		    		fila[j] = fila[j + 1]; 
		    		
		    	}
		    	fila[tamanho-1] = null;
		    	
		    	
		    	i--;
		    	capacidade --;
		    	
		    	
		    }
		    
		    public void showFila() {
		    	for (int k=0;k < tamanho-1; k++) {
		    		if (fila[k] == null) {
		    			break;
		    		}
		    		else {
			    	JOptionPane.showMessageDialog(null, "Paciente: \n" + fila[k]);
		    		}
		    	}
		 }
		    
		    
		    public String[] getFila() {
				return fila;
			}

			public void setFila(String[] fila) {
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
