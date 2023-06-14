package model.beans;

public class Enum {
	public enum tipoAtendimento{
		NORMAL, PREFERENCIAL;
	}

	public enum especialidade{
		CARDIOLOGIA("Sala 1"),
		UROLOGIA("Sala 2"),
		PNEUMOLOGIA("Sala 3"),
		NEUROLOGIA("Sala 4"),
		PROCTOLOGIA("Sala 5");
		
		
	    private String sala; 

	 

	    especialidade(String sala) { 

	        this.sala = sala; 

	    } 

	 

	    public String getSala() { 

	        return sala; 

	    } 

		
	}

}
