package model.beans;

public class Paciente {
	
public String nomePaciente;
public int idade;
public int senha;
public Enum.tipoAtendimento tipoAtendimento;
public Enum.especialidade especialidade;


public Paciente(String nomePaciente, int idade, int senha, Enum.tipoAtendimento tipoAtendimento, Enum.especialidade especialidade) { 

    this.nomePaciente = nomePaciente; 

    this.idade = idade; 

    this.senha = senha; 

    this.tipoAtendimento = tipoAtendimento; 

    this.especialidade = especialidade; 
    

} 


public String getNomePaciente() {
	return nomePaciente;
}

public void setNomePaciente(String nomePaciente) {
	this.nomePaciente = nomePaciente;
}

public int getIdade() {
	return idade;
}

public void setIdade(int idade) {
	this.idade = idade;
}

public int getSenha() {
	return senha;
}

public void setSenha(int senha) {
	this.senha = senha;
}


public Enum.tipoAtendimento getTipoAtendimento() {
	return tipoAtendimento;
}


public void setTipoAtendimento(Enum.tipoAtendimento tipoAtendimento) {
	this.tipoAtendimento = tipoAtendimento;
}


public Enum.especialidade getEspecialidade() {
	return especialidade;
}


public void setEspecialidade(Enum.especialidade especialidade) {
	this.especialidade = especialidade;
}




}

