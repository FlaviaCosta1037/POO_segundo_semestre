package negocio;
import dados.AlunoDados;
import entidades.Aluno;

public class AlunoNegocio {

	private AlunoDados alunoDados = new AlunoDados();

	// Este m�todo n�o deveria retornar nada! Deve-se usar Exceptions, fa�a o ajuste necess�rio.
	public String cadastrar(Aluno aluno) {
		
		if ( this.alunoDados.alunoJaCadastrado(aluno.getCpf()) ) {
			return "Erro: O aluno j� foi cadastrado!";
			// Crie suas mensagens personalizadas.
		}
		
		alunoDados.cadastrar(aluno);
		return "Aluno cadastrado com sucesso!";
		
	}
	
	public void matricularAluno(Aluno aluno) throws Exception {
		// Validar se aluno est� ativo
		// Validar se h� vaga no curso
		// Validar se o aluno pagou o boleto
		// ...
	}
	
	
}
