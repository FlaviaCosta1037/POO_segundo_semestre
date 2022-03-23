package lista_02_classesObjects.classes;

public class Pessoa {
    private String nome;
    private int idade;
    private Double altura;
    private int peso;
    private String sexo;

    public Pessoa(String nome, int idade, Double altura, int peso, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Double calculaImc(){
        return this.peso/(this.altura * this.altura);
    }

    public String resultadoImc(){
        String categoria;
        Double resultado = calculaImc();

        if(resultado <= 18.5){
            categoria = " Abaixo do peso normal";
        }else if(resultado > 18.5 && resultado <= 25){
            categoria = "Peso Normal";
        }else if(resultado > 25 && resultado <= 30){
            categoria = "Acima do peso normal";
        }else{
            categoria = "Obesidade";
        }

        return categoria;
    }

    public void imprimeDados(){
        System.out.printf("Nome: %s\n Imc: %.2f\n Resultado: %s", this.nome, calculaImc(), resultadoImc());

    }

}
