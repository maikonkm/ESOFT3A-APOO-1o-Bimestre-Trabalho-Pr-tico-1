package EXE11;
/******************************************************************************
Curso: Engenharia de Software
Disciplina: Análise e Projeto Orienta a Objetos
Professor: José Carlos Flores
Turma: ESOFT3A
Exercício: 11 - Criação de Classes e Objetos
Componentes:


 Guilherme Garcia Da cruz - 25229817-2
 Lucas Henrique Zeferino - 25119616-2
 Maikon Vinicio Duarte dos Santos - 25165588-2
 
 
 
 
Data: 05 de Março de 2026
Descritivo:  Escreva um programa que defina uma classe Pessoa com atributos nome e idade, e métodos para exibir
esses atributos.
*******************************************************************************/

class pessoa{
    //atributos
    String nome;
    int idade;

    //métodos
    void exibirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);

    }

    
    
}
//classe principal
public class Main {
    public static void main(String[] args) {
        //criando um objeto da classe pessoa
        pessoa p1 = new pessoa();
        //atribuindo valores aos atributos do objeto
        p1.nome = "Guilherme";
        p1.idade = 20;

        //exibindo os dados da pessoa
        p1.exibirDados();
    }
}
