package EXE14;

/******************************************************************************
Curso: Engenharia de Software
Disciplina: Análise e Projeto Orienta a Objetos
Professor: José Carlos Flores
Turma: ESOFT3A
Exercício: 14 - Criação de Classes e Objetos
Componentes:


 Guilherme Garcia Da cruz - 25229817-2
 Lucas Henrique Zeferino - 25119616-2
 Maikon Vinicio Duarte dos Santos - 25165588-2
 
 
 
 
Data: 05 de Março de 2026
Descritivo: Escreva um programa que exiba a tabuada de um número inteiro fornecido pelo usuário.
*******************************************************************************/
// Importa a classe Scanner para ler dados do teclado
import java.util.Scanner;

// Classe principal do programa
public class Main {

    // Método principal (onde o programa começa)
    public static void main(String[] args) {

        // Cria um objeto Scanner para receber entrada do usuário
        Scanner sc = new Scanner(System.in);

        // Exibe mensagem pedindo um número
        System.out.print("Digite um número inteiro: ");

        // Lê o número inteiro digitado pelo usuário
        int numero = sc.nextInt();

        // Mostra qual tabuada será exibida
        System.out.println("Tabuada de " + numero + ":");

        // Estrutura de repetição que vai de 1 até 10
        for (int i = 1; i <= 10; i++) {

            // Exibe o resultado da multiplicação
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        // Fecha o Scanner (boa prática)
        sc.close();
    }
}
      
    
    

