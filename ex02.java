package EXE02;
/******************************************************************************
Curso: Engenharia de Software
Disciplina: Análise e Projeto Orienta a Objetos
Professor: José Carlos Flores
Turma: ESOFT3A
Exercício: 02 - Criação de Classes e Objetos
Componentes:


 Guilherme Garcia Da cruz - 25229817-2
 Lucas Henrique Zeferino - 25119616-2
 Maikon Vinicio Duarte dos Santos - 25165588-2
 
 
 
 
Data: 05 de Março de 2026
Descritivo: Escreva um programa que leia um número inteiro e informe se ele é par ou ímpar.

*******************************************************************************/

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero para saber se e par ou impar: ");
        int num1 = sc.nextInt();

        if (num1 % 2 == 0) {
            System.out.println("O numero " + num1 + " e par!");
        } else {
            System.out.println("O numero " + num1 + " e impar!");
        }

    }
}