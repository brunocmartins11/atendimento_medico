package view;
import model.Fila;
import model.beans.*;
import model.beans.Enum.especialidade;
import model.beans.Enum.tipoAtendimento;

import javax.swing.*;

public class AtendimentoView {
	
	
	public void MenuGeral() {
		Fila filaAtendimento = new Fila();
		
		String[] opcoes = { "Novo paciente", "Chamar Paciente", "Ver historico de atendimento", "Ver painel de espera","Fechar sistema"};

			int selecao = JOptionPane.showOptionDialog(null, "Escolha sua funcao:", "Menu Geral", 0, 3, null, opcoes,
					opcoes[0]);
			 while (selecao != 4) {
		            if (selecao == 0) {
		                String nomePaciente = JOptionPane.showInputDialog(null, "Informe o nome:");
		                if (nomePaciente == null || nomePaciente.trim().isEmpty()) {
		                    JOptionPane.showMessageDialog(null, "Erro: O nome não pode ser vazio.");
		                    continue; // Retorna ao menu inicial
		                }
		                int idadePaciente = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a idade:"));
		                
		                int senhaPaciente = filaAtendimento.gerarSenhaAleatoria();

		                tipoAtendimento tipoAtendimentoPaciente = filaAtendimento.verificarTipoAtendimento(idadePaciente);

		                especialidade especialidadePaciente = filaAtendimento.selecionarEspecialidade();

		                Paciente paciente = new Paciente(nomePaciente, idadePaciente, senhaPaciente,
		                        tipoAtendimentoPaciente, especialidadePaciente);

		                filaAtendimento.adicionarPaciente(paciente);
		                JOptionPane.showMessageDialog(null,
		                        "Paciente adicionado com sucesso!\nNome: " + paciente.getNomePaciente() + "\nSenha: "
		                                + paciente.getSenha() + "\nEspecialidade: " + paciente.getEspecialidade() + "\nTipo de Atendimento: " + paciente.getTipoAtendimento());
		            } else if (selecao == 1) {
		                filaAtendimento.chamarFila();
		            } else if (selecao == 2) {
		                filaAtendimento.mostrarHistorico();
		            } else if (selecao == 3) {
		            	filaAtendimento.mostrarListaEspera();
		            }

		            selecao = JOptionPane.showOptionDialog(null, "Escolha sua função:", "Menu Geral", 0, 3, null, opcoes,
		                    opcoes[0]);
		        }
		    }
}
