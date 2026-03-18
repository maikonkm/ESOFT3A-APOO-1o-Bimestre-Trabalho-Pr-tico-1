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
Descritivo: Escreva um programa que use herança para criar uma classe Aluno que herda de Pessoa e adiciona um
atributo matricula.
*******************************************************************************/
public class Pessoa {

    // Atributos privados — só acessíveis dentro desta classe
    private String nome;   // Armazena o nome da pessoa
    private int idade;     // Armazena a idade da pessoa

    // -----------------------------------------------
    // CONSTRUTOR de Pessoa
    // É chamado ao criar um objeto com: new Pessoa("Ana", 25)
    // Recebe nome e idade e atribui aos atributos da classe
    // -----------------------------------------------
    public Pessoa(String nome, int idade) {
        this.nome = nome;   // "this.nome" = atributo da classe | "nome" = parâmetro recebido
        this.idade = idade;
    }

    // -----------------------------------------------
    // MÉTODO: exibirDados()
    // Imprime no console o nome e a idade da pessoa
    // Pode ser sobrescrito por subclasses (como Aluno)
    // -----------------------------------------------
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

    // -----------------------------------------------
    // GETTER: getNome()
    // Retorna o valor do atributo privado "nome"
    // Necessário pois "nome" é private e não acessível diretamente de fora
    // -----------------------------------------------
    public String getNome() { return nome; }

    // -----------------------------------------------
    // GETTER: getIdade()
    // Retorna o valor do atributo privado "idade"
    // -----------------------------------------------
    public int getIdade() { return idade; }
}


// ==========================================
// CLASSE FILHA: Aluno
// Herda tudo de Pessoa e adiciona o atributo "matricula"
// O "extends Pessoa" significa que Aluno É UMA Pessoa
// ==========================================
class Aluno extends Pessoa {

    // Atributo exclusivo de Aluno — não existe em Pessoa
    private String matricula;

    // -----------------------------------------------
    // CONSTRUTOR de Aluno
    // Chamado ao criar: new Aluno("Maria", 20, "2023001")
    // Usa super() para aproveitar o construtor da classe pai (Pessoa)
    // e inicializa também o atributo próprio "matricula"
    // -----------------------------------------------
    public Aluno(String nome, int idade, String matricula) {
        super(nome, idade);         // Chama o construtor de Pessoa com nome e idade
        this.matricula = matricula; // Inicializa o atributo próprio de Aluno
    }

    // -----------------------------------------------
    // MÉTODO SOBRESCRITO: exibirDados()
    // @Override indica que este método substitui o da classe pai
    // Primeiro chama super.exibirDados() para mostrar nome e idade,
    // depois adiciona a exibição da matrícula
    // -----------------------------------------------
    @Override
    public void exibirDados() {
        super.exibirDados();                          // Executa o exibirDados() de Pessoa
        System.out.println("Matrícula: " + matricula); // Adiciona a matrícula na exibição
    }

    // -----------------------------------------------
    // GETTER: getMatricula()
    // Retorna o valor do atributo privado "matricula"
    // -----------------------------------------------
    public String getMatricula() { return matricula; }
}


// ==========================================
// CLASSE PRINCIPAL: Main
// Ponto de entrada do programa — o Java sempre começa pelo main()
// ==========================================
class Main {

    // -----------------------------------------------
    // MÉTODO: main()
    // É o primeiro método executado quando o programa roda
    // "public static void" = acessível, não precisa de objeto, não retorna nada
    // "String[] args" = argumentos opcionais passados pelo terminal
    // -----------------------------------------------
    public static void main(String[] args) {

        // Cria o primeiro aluno passando nome, idade e matrícula pelo construtor
        Aluno a1 = new Aluno("Guilherme", 20, "2023001");
        a1.exibirDados(); // Chama exibirDados() de Aluno → mostra nome, idade e matrícula

        System.out.println("---"); // Separador visual entre os dois alunos

        // Cria o segundo aluno com dados diferentes
        Aluno a2 = new Aluno("Lucas", 22, "2023002");
        a2.exibirDados(); // Mesmo método, dados diferentes
    }
}