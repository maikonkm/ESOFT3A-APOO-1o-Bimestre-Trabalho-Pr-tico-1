package EXE07;
/******************************************************************************
Curso: Engenharia de Software
Disciplina: Análise e Projeto Orienta a Objetos
Professor: José Carlos Flores
Turma: ESOFT3A
Exercício: 07 - Criação de Classes e Objetos
Componentes:


 Guilherme Garcia Da cruz - 25229817-2
 Lucas Henrique Zeferino - 25119616-2
 Maikon Vinicio Duarte dos Santos - 25165588-2
 
 
 
 
Data: 05 de Março de 2026
Descritivo:  Escreva um programa que encontre o maior número em um array de inteiros.

*******************************************************************************/

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];

        // loop 1 — lê os números
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o numero " + (i+1) + ": ");
            array[i] = sc.nextInt();
        }

        // declara maior DEPOIS de preencher o array
        int maior = array[0];

        // loop 2 — encontra o maior
        for (int i = 1; i < 5; i++) {
            if (array[i] > maior) {
                maior = array[i];
            }
        }

        System.out.println("O maior numero e: " + maior);

        sc.close();
    }
}