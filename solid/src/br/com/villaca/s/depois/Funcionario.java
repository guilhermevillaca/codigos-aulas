package br.com.villaca.s.depois;

/**
 *
 * @author guilherme.villaca
 */
// Classe que cuida apenas dos dados do funcionário
public class Funcionario {

    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }
}


