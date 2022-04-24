package revisao_prova.Classes;

public class Pessoa {
    private String nome;
    private String cpf;
    private String celular;
    private String cep;

    public Pessoa(String nome, String cpf, String celular, String cep) {
        this.nome = nome;
        this.cpf = cpf;
        this.celular = celular;
        this.cep = cep;
    }
    public String toString(){
        return "Nome:" + this.nome + "\nCpf:" + Utils.formataCpf(this.cpf) + "\nCelular:" + Utils.formataTelefone(this.celular) +
                "\nCep:" + Utils.formataCep(this.cep);
    }
}
