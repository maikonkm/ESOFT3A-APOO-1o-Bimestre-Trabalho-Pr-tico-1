package EXE10;
/******************************************************************************
Curso: Engenharia de Software
Disciplina: Análise e Projeto Orienta a Objetos
Professor: José Carlos Flores
Turma: ESOFT3A
Exercício: 10 - Criação de Classes e Objetos
Componentes:


 Guilherme Garcia Da cruz - 25229817-2
 Lucas Henrique Zeferino - 25119616-2
 Maikon Vinicio Duarte dos Santos - 25165588-2
 
 
 
 
Data: 05 de Março de 2026
Descritivo: Escreva um programa que ordene um array de números em ordem crescente.
*******************************************************************************/

import java.util.Scanner;

public class ex10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] array = new int[6];
        int aux = 0;

        for(int i = 0; i < 6; i++){
            System.out.printf("Digite o %dº numero: ", i);
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 5; j++) {
                if (array[j] > array[j + 1]) {
                    aux = array[j];           // guarda o da esquerda
                    array[j] = array[j + 1]; //esquerda recebe o da direita
                    array[j + 1] = aux;     //direita recebe o guardado
                }
            }
        }
        for (int i = 0; i < 6; i++) {
            System.out.print(array[i] + " ");
        }
    }
}