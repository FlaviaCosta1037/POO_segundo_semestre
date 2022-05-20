package apresentacao;

import java.util.Scanner;
import entidades.Aluno;

public class AlunoApresentacao {
	
	private static Scanner scanner = new Scanner(System.in);
	
	public Aluno preencherAluno() {
		
		System.out.println("================= Digite seu nome: =================");
		String nome = scanner.next();
		
		System.out.println("================= Digite seu CPF: =================");
		String cpf = scanner.next();
		
		return new Aluno(nome, cpf);

	}

}
