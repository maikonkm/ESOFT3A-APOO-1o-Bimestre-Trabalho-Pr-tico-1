package EXE06;
/******************************************************************************
Curso: Engenharia de Software
Disciplina: Análise e Projeto Orienta a Objetos
Professor: José Carlos Flores
Turma: ESOFT3A
Exercício: 06 - Criação de Classes e Objetos
Componentes:


 Guilherme Garcia Da cruz - 25229817-2
 Lucas Henrique Zeferino - 25119616-2
 Maikon Vinicio Duarte dos Santos - 25165588-2
 
 
 
 
Data: 05 de Março de 2026
Descritivo: Escreva um programa que leia 5 números do usuário e os armazene em um array, depois exiba todos os
números.
*******************************************************************************/

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] num = new int[5];

        for (int i = 0; i < 5; i++) {
        System.out.println("Digite o numero " + (i+1) + ": ");
        num[i] = sc.nextInt();
        }

        System.out.println("\nNumeros digitados:");
        for (int i = 0; i < 5; i++) {
        System.out.print(num[i] + ", ");
        }

        sc.close();
    }
}