package Collections.Entidades;

import Collections.Servicos.Cadastrar;

public class Empresa implements Cadastrar {
    private Funcionario funcionario;

    public Empresa(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Empresa() {

    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    @Override
    public void realizarCadastro(Funcionario f) {
         f = new Funcionario();
         f.getNome();

    }

    @Override
    public String toString() {
        return "Empresa{" +
                "funcionario=" + this.funcionario +
                '}';
    }
}
