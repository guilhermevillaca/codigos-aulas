package br.com.villaca.s.antes;

/**
 *
 * @author guilherme.villaca
 */
public class RelatorioFuncionario {

    private String nome;
    private double salario;

    public RelatorioFuncionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    // Métodos relacionados aos dados do funcionário
    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    // Método que gera um relatório
    public void gerarRelatorio() {
        System.out.println("Relatório do Funcionário:");
        System.out.println("Nome: " + nome);
        System.out.println("Salário: " + salario);
    }
}
