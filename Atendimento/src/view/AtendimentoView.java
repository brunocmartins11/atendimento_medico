package view;
import model.beans.*;
import java.awt.GridLayout;

import javax.swing.*;

public class AtendimentoView {
	
	public  int MenuGeral() {
		String[] opcoes = { "Atendente", "Médico", "Paciente", "Fechar sistema"};
int funcao=0;

			int selecao = JOptionPane.showOptionDialog(null, "Escolha sua funcao:", "Menu Geral", 0, 3, null, opcoes,
					opcoes[0]);
			if (selecao == 0) {
						funcao=1;
				}
			
			else if (selecao == 1) {
					funcao=2;
			}
			
			else if (selecao == 2) {
					funcao=3;
			}
			
			else if (selecao == 3) {
				System.exit(0);
			}
			
			return funcao;
		}

	
	
	
	
	public  Paciente MenuAtendente() {
		String[] opcoes = { "Mostrar Painel", "Solicitar Senha", "Voltar" };
		Paciente paciente = new  Paciente();
		while (true) {
			int selecao = JOptionPane.showOptionDialog(null, "Escolha sua acao:", "Menu", 0, 3, null, opcoes,
					opcoes[0]);
			if (selecao == 1) {
				while (true) {

					JTextField Nome = new JTextField(15);
					JTextField Especialidade = new JTextField(15);
					JTextField Idade = new JTextField(15);

					JPanel myPanel = new JPanel();

					GridLayout experimentLayout = new GridLayout(0, 1);
					myPanel.setLayout(experimentLayout);

					myPanel.add(new JLabel("Nome:"));
					myPanel.add(Nome);
					myPanel.add(new JLabel("Especialidade:"));
					myPanel.add(Especialidade);
					myPanel.add(new JLabel("Idade:"));
					myPanel.add(Idade);
					

					int result = JOptionPane.showConfirmDialog(null, myPanel, "Solicitar senha",
							JOptionPane.OK_CANCEL_OPTION);
					if (result == JOptionPane.OK_OPTION) {
						
					if(Nome.getText().isEmpty() || Especialidade.getText().isEmpty() || Idade.getText().isEmpty()) {
						JOptionPane.showMessageDialog(null, "Insira todos os campos!");
					}
					else {
						
						// Transformando String "Idade" em Integer
						int idade_int = Integer.parseInt(Idade.getText());
						
						paciente.setNomePaciente(Nome.getText());
						paciente.setIdade(idade_int);
						paciente.setEspecialidade(Especialidade.getText());
					
						
						return paciente;
					}
					
					}
					if (result == JOptionPane.CANCEL_OPTION) {
						paciente.setNomePaciente(null);
						paciente.setIdade(0);
						paciente.setEspecialidade(null);
						break;
					}
				}
				
			}
			if (selecao == 2 || paciente != null) {
				break;
			}
		}
		return paciente;

	}

	public void MenuMedico() {
		String[] opcoes = { "Chamar Paciente", "Voltar"};
		while (true) {
			int selecao = JOptionPane.showOptionDialog(null, "Escolha sua acao:", "Menu", 0, 3, null, opcoes,
					opcoes[0]);
			if (selecao == 0) {
				
				
				
				}else {
			
			if (selecao == 1) {
				break;
				
			}}
		}

}

public  void MenuPaciente() {
	String[] opcoes = { "Consultar Histórico", "Consultar posição", "Voltar"};

	while (true) {
		int selecao = JOptionPane.showOptionDialog(null, "Escolha sua acao:", "Menu", 0, 3, null, opcoes,
				opcoes[0]);
		if (selecao == 0) {


			}
		
		if (selecao == 1) {
			
		}
		
		if (selecao == 2) {
			break;
		}
	}

}}
