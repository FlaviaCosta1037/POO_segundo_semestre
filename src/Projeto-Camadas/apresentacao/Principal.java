package apresentacao;
import entidades.Aluno;
import negocio.AlunoNegocio;

public class Principal {
	
	public static AlunoNegocio alunoNegocio = new AlunoNegocio(); 
	
	public static void main(String[] args) {
		
		AlunoApresentacao alunoApresentacao = new AlunoApresentacao();
			
		Aluno aluno = alunoApresentacao.preencherAluno();
		String mensagem = alunoNegocio.cadastrar(aluno);
		
		System.out.println(mensagem);
		
	}
	
	
}
