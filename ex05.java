package EXE05;
/******************************************************************************
Curso: Engenharia de Software
Disciplina: Análise e Projeto Orienta a Objetos
Professor: José Carlos Flores
Turma: ESOFT3A
Exercício: 05 - Criação de Classes e Objetos
Componentes:


 Guilherme Garcia Da cruz - 25229817-2
 Lucas Henrique Zeferino - 25119616-2
 Maikon Vinicio Duarte dos Santos - 25165588-2
 
 
 
 
Data: 05 de Março de 2026
Descritivo:  Escreva um programa que exiba apenas os números pares de 1 a 20
*******************************************************************************/

import java.util.Scanner;

public class ex05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Numeros pares de 1 a 20");

        int i = 0;
        for (i = 1; i <= 20; i++){
            if (i % 2 == 0){
                System.out.print(i + ", ");
            }
        }
       
    }
}