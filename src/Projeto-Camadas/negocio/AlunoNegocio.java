package negocio;
import dados.AlunoDados;
import entidades.Aluno;

public class AlunoNegocio {

	private AlunoDados alunoDados = new AlunoDados();

	// Este método não deveria retornar nada! Deve-se usar Exceptions, faça o ajuste necessário.
	public String cadastrar(Aluno aluno) {
		
		if ( this.alunoDados.alunoJaCadastrado(aluno.getCpf()) ) {
			return "Erro: O aluno já foi cadastrado!";
			// Crie suas mensagens personalizadas.
		}
		
		alunoDados.cadastrar(aluno);
		return "Aluno cadastrado com sucesso!";
		
	}
	
	public void matricularAluno(Aluno aluno) throws Exception {
		// Validar se aluno está ativo
		// Validar se há vaga no curso
		// Validar se o aluno pagou o boleto
		// ...
	}
	
	
}
