package entidades;

public class Aluno {

	private String nome;
	private String cpf;
	
	public Aluno(String nome, String cpf){
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public String getNome(){
		return nome;
	}

	public String toString(){
		return "\n Nome do aluno: "+ this.getNome() + "\n CPF do aluno: " + this.getCpf();
	}
}
