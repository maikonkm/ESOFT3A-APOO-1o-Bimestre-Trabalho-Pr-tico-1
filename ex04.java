package EXE04;
/******************************************************************************
Curso: Engenharia de Software
Disciplina: Análise e Projeto Orienta a Objetos
Professor: José Carlos Flores
Turma: ESOFT3A
Exercício: 04 - Criação de Classes e Objetos
Componentes:


 Guilherme Garcia Da cruz - 25229817-2
 Lucas Henrique Zeferino - 25119616-2
 Maikon Vinicio Duarte dos Santos - 25165588-2
 
 
 
 
Data: 05 de Março de 2026
Descritivo: Faça um programa que converta uma temperatura em graus Celsius para Fahrenheit, utilizando a fórmula:
F = (C × 9/5) + 32.
*******************************************************************************/

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


            System.out.println("CONVERSOR DE CELSIUS PARA FAHRENHEIT");

            System.out.println("Digite a temperatura em Celsius: ");  //Use , para numero quebrado
            double cel = sc.nextDouble();

            double fah = 0;
            fah = (cel * 9.0 / 5.0) + 32;

            System.out.printf("%.2f°C em Fahrenheit e igual a %.2f°F%n", cel, fah);

            sc.close();

    }
}

