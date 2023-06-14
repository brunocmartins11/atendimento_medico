package model;
import javax.swing.*;

import model.beans.Enum.*;
import model.beans.Paciente;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Fila {
	
    private Queue<Paciente> filaNormal;
    private Queue<Paciente> filaPrioritaria;
    private int contadorNormal;
    private int contadorPrioritario;
	int pacientesAtendidos;
	private List<String> historicoAtendimento;

	public Fila(){
        filaNormal = new LinkedList<>();
        filaPrioritaria = new LinkedList<>();
        historicoAtendimento = new ArrayList<>();
        contadorNormal = 0;
        contadorPrioritario = 0;
	}
	
	
	    
	    public void adicionarPaciente(Paciente paciente) { 
	    	
	        if (filaNormal.size() + filaPrioritaria.size() >= 50) {
	            JOptionPane.showMessageDialog(null, "A fila está cheia. Não é possível adicionar mais pacientes.");
	            return;
	        }

	    	if (paciente.tipoAtendimento == tipoAtendimento.PREFERENCIAL) {
	            filaPrioritaria.offer(paciente);
	            JOptionPane.showMessageDialog(null, "Paciente adicionado é fila prioritária: " + paciente.nomePaciente +  "\nIdade: " + paciente.idade + "\nPosição na fila: " + filaPrioritaria.size());
	        } else {
	            filaNormal.offer(paciente);
	            JOptionPane.showMessageDialog(null, "Paciente adicionado é fila normal: " + paciente.nomePaciente + "\nIdade: " + paciente.idade + "\nPosição na fila: " + filaNormal.size());
	        }
	    } 
	    
	    public int gerarSenhaAleatoria() { 

	        int senha = (int) (Math.random() * 999); 

	        return senha; 

	    } 
	    
	    public especialidade selecionarEspecialidade() { 

	        String[] especialidades = {"Cardiologia", "Neurologia", "Pneumologia", "Proctologia", "Urologia"}; 

	        int escolha = JOptionPane.showOptionDialog(null, "Escolha a especialidade desejada: ", "Escolha de Especialidade", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, especialidades, especialidades[0]); 

	 

	        switch (escolha) {
	        
	            case 0: 

	                return especialidade.CARDIOLOGIA; 

	            case 1: 

	                return especialidade.NEUROLOGIA; 

	            case 2: 

	                return especialidade.PNEUMOLOGIA; 

	            case 3: 

	                return especialidade.PROCTOLOGIA; 

	            case 4: 

	                return especialidade.UROLOGIA; 

	            default: 

	                return null; 

	        } 

	    } 
	    
	    public void chamarFila() { 

	    	if (!filaPrioritaria.isEmpty() && contadorPrioritario % 3 == 0) {
	            Paciente paciente = filaPrioritaria.poll();
	            historicoAtendimento.add("Paciente prioritário atendido: " + paciente.nomePaciente + ", Idade: " + paciente.idade);
	            JOptionPane.showMessageDialog(null, "Atendendo paciente prioritário: " + paciente.nomePaciente + ", Idade: " + paciente.idade);
	            contadorPrioritario++;
	        } else if (!filaNormal.isEmpty()) {
	            Paciente paciente = filaNormal.poll();
	            JOptionPane.showMessageDialog(null, "Atendendo paciente: " + paciente.nomePaciente + ", Idade: " + paciente.idade);
	            historicoAtendimento.add("Paciente atendido: " + paciente.nomePaciente + ", Idade: " + paciente.idade);
	            contadorNormal++;
	            contadorPrioritario++;
	        } else {
	            JOptionPane.showMessageDialog(null, "Não há pacientes na fila de atendimento.");
	        }

	    } 
	    
	    public tipoAtendimento verificarTipoAtendimento(int idade) { 

	        if (idade >= 60) { 

	            return tipoAtendimento.PREFERENCIAL; 

	        } else { 

	            return tipoAtendimento.NORMAL; 

	        } 

	    } 
	    
	    
	    
	    public void mostrarListaEspera() {
	        StringBuilder historico = new StringBuilder();

	        historico.append("Fila de atendimento normal:\n");
	        for (Paciente paciente : filaNormal) {
	            historico.append("Paciente: ").append(paciente.nomePaciente).append(", Idade: ").append(paciente.idade).append("\n");
	        }

	        historico.append("\nFila de atendimento prioritário:\n");
	        for (Paciente paciente : filaPrioritaria) {
	            historico.append("Paciente: ").append(paciente.nomePaciente).append(", Idade: ").append(paciente.idade).append("\n");
	        }

	        JOptionPane.showMessageDialog(null, historico.toString());
	    }
	    
	    public void mostrarHistorico() {
	    	
	        if (historicoAtendimento.isEmpty()) {
	        	JOptionPane.showMessageDialog(null, "Nenhum paciente foi atendido ainda.");
	            return;
	        }
	    	
	        StringBuilder historico = new StringBuilder();

	        for (String entrada : historicoAtendimento) {
	            historico.append(entrada).append("\n");
	        }

	        JOptionPane.showMessageDialog(null, historico.toString());
	    }


}