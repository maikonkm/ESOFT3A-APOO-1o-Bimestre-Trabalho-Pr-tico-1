package EXE18;

/******************************************************************************
Curso: Engenharia de Software
Disciplina: Análise e Projeto Orienta a Objetos
Professor: José Carlos Flores
Turma: ESOFT3A
Exercício: 18 - Criação de Classes e Objetos
Componentes:


 Guilherme Garcia Da cruz - 25229817-2
 Lucas Henrique Zeferino - 25119616-2
 Maikon Vinicio Duarte dos Santos - 25165588-2
 
 
 
 
Data: 05 de Março de 2026
Descritivo: Escreva um programa que solicite ao usuário uma frase e conte o número de palavras presentes nela. O programa deve considerar que as palavras são separadas por espaços em branco.
*******************************************************************************/
import java.util.Scanner;

public class ContarPalavras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        // Remove espaços extras no início e no fim
        frase = frase.trim();

        // Verifica se a string está vazia
        if (frase.isEmpty()) {
            System.out.println("Número de palavras: 0");
        } else {
            // Divide a frase em palavras
            String[] palavras = frase.split("\\s+");
            System.out.println("Número de palavras: " + palavras.length);
        }

        scanner.close();
    }
}
    

