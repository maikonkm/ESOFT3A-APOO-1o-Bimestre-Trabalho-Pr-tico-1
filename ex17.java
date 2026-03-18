package EXE17;

/******************************************************************************
Curso: Engenharia de Software
Disciplina: Análise e Projeto Orienta a Objetos
Professor: José Carlos Flores
Turma: ESOFT3A
Exercício: 17 - Criação de Classes e Objetos
Componentes:


 Guilherme Garcia Da cruz - 25229817-2
 Lucas Henrique Zeferino - 25119616-2
 Maikon Vinicio Duarte dos Santos - 25165588-2
 
 
 
 
Data: 05 de Março de 2026
Descritivo: Escreva um programa que implemente um jogo de adivinhação. O programa deve gerar um número aleatório entre 1 e 100, e o usuário deve tentar adivinhar esse número. O programa deve fornecer feedback se o palpite do usuário é muito baixo, muito alto ou correto. O jogo continua até que o usuário acerte o número, e no final, o programa deve exibir o número de tentativas que o usuário levou para acertar.
*******************************************************************************/
import java.util.Random;   // Importa a classe Random para gerar números aleatórios
import java.util.Scanner;  // Importa a classe Scanner para ler o que o usuário digita

public class JogoAdivinhacao {

    // -----------------------------------------------
    // MÉTODO: main()
    // Ponto de entrada do programa
    // Aqui fica toda a lógica do jogo de adivinhação
    // -----------------------------------------------
    public static void main(String[] args) {

        // -----------------------------------------------
        // CONFIGURAÇÃO INICIAL
        // Cria os objetos necessários para o jogo funcionar
        // -----------------------------------------------

        // Cria o gerador de números aleatórios
        Random random = new Random();

        // Cria o leitor de teclado para capturar os palpites do usuário
        Scanner scanner = new Scanner(System.in);

        // Gera o número secreto entre 1 e 100
        // nextInt(100) gera de 0 a 99 — somando +1 vira de 1 a 100
        int numeroSecreto = random.nextInt(100) + 1;

        // Contador de tentativas — começa em zero e sobe a cada palpite
        int tentativas = 0;

        // Armazena o palpite digitado pelo usuário a cada rodada
        int palpite;

        // Exibe a mensagem inicial do jogo
        System.out.println("Tente adivinhar o numero entre 1 e 100!");


        // -----------------------------------------------
        // LOOP DO JOGO: while (true)
        // Fica repetindo indefinidamente até o usuário acertar
        // Só sai do loop quando cair no "break" lá dentro
        // -----------------------------------------------
        while (true) {

            // Pede o palpite ao usuário
            System.out.print("Digite seu palpite: ");

            // Lê o número inteiro digitado pelo usuário
            palpite = scanner.nextInt();

            // Incrementa o contador de tentativas a cada palpite
            tentativas++;

            // -----------------------------------------------
            // COMPARAÇÕES: verifica se o palpite é menor, maior ou igual
            // -----------------------------------------------

            if (palpite < numeroSecreto) {
                // Palpite foi menor que o número secreto — dá dica para cima
                System.out.println("O numero e MAIOR que isso.");

            } else if (palpite > numeroSecreto) {
                // Palpite foi maior que o número secreto — dá dica para baixo
                System.out.println("O numero e MENOR que isso.");

            } else {
                // Palpite igual ao número secreto — usuário acertou!
                // Exibe parabéns e o total de tentativas usadas
                System.out.println("Parabens! Voce acertou em " + tentativas + " tentativas!");

                // Encerra o loop while — jogo termina aqui
                break;
            }
        }

        // Fecha o scanner para liberar o recurso de leitura do teclado
        // Boa prática: sempre fechar o que foi aberto
        scanner.close();
    }
}
    

