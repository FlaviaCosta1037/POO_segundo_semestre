package lista02_classesObjetos.entidades;

public class Pessoa {
    public String nome;
    public int idade;
    public double altura;
    public int peso;
    public String sexo;

    public Double calculaImc() {
        return peso / ((altura * altura));
    }

    public Double calculaImc(Double imc) {
        if (calculaImc() <= 18.5) {
            System.out.print("Abaixo do peso normal\n");
        } else if (calculaImc() > 18.5 && calculaImc() <= 25) {
            System.out.print("Peso Normal\n");
        } else if (calculaImc() > 25 && calculaImc() <= 30) {
            System.out.print("Acima do peso normal\n");
        } else if (calculaImc() > 30) {
            System.out.print("Obesidade\n");
        }
        System.out.printf("Imc: %.2f", this.calculaImc());

        return this.calculaImc();
    }

    public void imprimeDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.printf("Imc %.2f", this.calculaImc());

    }
}