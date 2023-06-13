package controller;
import view.*;
import model.*;
import model.beans.*;
public class AtendimentoController extends AtendimentoView{
	public static void main(String[] args) {
		
		Fila normal = new Fila();
		Fila preferencial = new Fila();
		Fila atendimento = new Fila();
		FilaHistorico historico = new FilaHistorico();
		
		AtendimentoView menu = new AtendimentoView();
		int x = 0;
		
		while (x == 0) {
			int funcao = menu.MenuGeral();
			
			if (funcao==1) {
				Paciente paciente = menu.MenuAtendente();

				if(paciente != null && paciente.getIdade() >= 60 ) {
					
					preferencial.AdicionarPaciente();
					System.out.println(preferencial.showFila());
					
					
				}
				else if(paciente != null){
					
					String NomePaciente = paciente.getNomePaciente();
					String Especialidade = paciente.getEspecialidade();
					int Idade = paciente.getIdade();
					int senha = normal.AdicionarPaciente();
					
					System.out.println(normal.showFila());
					
					
					
					 historico.AdicionarHistorico(NomePaciente, Especialidade, Idade, senha);
					
					 historico.showFila();
					
					
			
				}
				
				funcao=0;
			}
			
			else if (funcao==2) {
				
				menu.MenuMedico();
				
				int cont = 0;
				if(cont % 3 == 0) {
					preferencial.ChamarFila();
				}
				
				else{
					normal.ChamarFila();
				}
				
				
			}
			
			else if (funcao==3) {
				menu.MenuPaciente();
			}

			

		}
		
		

		
	}


	
}
