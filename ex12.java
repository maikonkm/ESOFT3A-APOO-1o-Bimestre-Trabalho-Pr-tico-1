package EXE12;
/******************************************************************************
Curso: Engenharia de Software
Disciplina: Análise e Projeto Orienta a Objetos
Professor: José Carlos Flores
Turma: ESOFT3A
Exercício: 12 - Criação de Classes, Objetos e Herança
Componentes:
 Guilherme Garcia Da cruz - 25229817-2
 Lucas Henrique Zeferino - 25119616-2
 Maikon Vinicio Duarte dos Santos - 25165588-2
 
Data: 05 de Março de 2026
Descritivo: Escreva um programa que use herança para criar uma classe Aluno que herda de Pessoa e adiciona um atributo matricula.
*******************************************************************************/

class Pessoa {

    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;   
        this.idade = idade;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

    public String getNome() { return nome; }
    public int getIdade() { return idade; }
}


class Aluno extends Pessoa {

    private String matricula;

    public Aluno(String nome, int idade, String matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Matrícula: " + matricula);
    }

    public String getMatricula() { return matricula; }
}


public class Main {

    public static void main(String[] args) {

        // Cria o primeiro aluno
        Aluno a1 = new Aluno("Guilherme", 20, "2023001");
        a1.exibirDados(); 

        System.out.println("---"); // Separador visual

        // Cria o segundo aluno
        Aluno a2 = new Aluno("Lucas", 22, "2023002");
        a2.exibirDados(); 
        
        System.out.println("---"); // Separador visual

        // Cria o terceiro aluno (Maikon adicionado aqui!)
        Aluno a3 = new Aluno("Maikon", 20, "2023003");
        a3.exibirDados(); 
    }
}
