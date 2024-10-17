package br.com.villaca.s.depois;

/**
 *
 * @author guilherme.villaca
 */
// Classe responsável pela geração de relatórios
public class GeradorRelatorio {

    public void gerarRelatorio(Funcionario funcionario) {
        System.out.println("Relatório do Funcionário:");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Salário: " + funcionario.getSalario());
    }
}