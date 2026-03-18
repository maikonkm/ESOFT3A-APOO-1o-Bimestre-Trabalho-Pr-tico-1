package EXE03;
/******************************************************************************
Curso: Engenharia de Software
Disciplina: Análise e Projeto Orienta a Objetos
Professor: José Carlos Flores
Turma: ESOFT3A
Exercício: 03 - Criação de Classes e Objetos
Componentes:


 Guilherme Garcia Da cruz - 25229817-2
 Lucas Henrique Zeferino - 25119616-2
 Maikon Vinicio Duarte dos Santos - 25165588-2
 
 
 
 
Data: 05 de Março de 2026
Descritivo: Escreva um programa que calcule a média de três notas fornecidas pelo usuário
*******************************************************************************/

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos somar a media das suas notas chefia!");

        double soma = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.println("Digite a nota " + i + ":");
                double nota = sc.nextDouble();
                 soma = soma + nota;
        }
        double media = soma / 3;
        System.out.printf("Sua media e: %.2f%n", media);

        sc.close();

    }
}