package EXE09;
/******************************************************************************
Curso: Engenharia de Software
Disciplina: Análise e Projeto Orienta a Objetos
Professor: José Carlos Flores
Turma: ESOFT3A
Exercício: 09 - Criação de Classes e Objetos
Componentes:


 Guilherme Garcia Da cruz - 25229817-2
 Lucas Henrique Zeferino - 25119616-2
 Maikon Vinicio Duarte dos Santos - 25165588-2
 
 
 
 
Data: 05 de Março de 2026
Descritivo: Criar uma calculadora simples de quatro operações (+ - * /). 

*******************************************************************************/

import java.util.Scanner;

public class ex09 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double soma = 0;

        System.out.println("Digite um numero: ");
        double  num1 = sc.nextDouble();

        System.out.println("Qual operação: +  -  x  /");
        String operacao = sc.next();

        System.out.println("Digite outro numero: ");
        double  num2 = sc.nextDouble();

        switch (operacao) {
            case "+":
                soma = num1 + num2;
                break;
                
            case "-":
                soma = num1 - num2;
                break;

            case "x":
                soma = num1 * num2;
                break;

            case "/":
                soma = num1 / num2;
                break;
        
            default:
                   System.out.println("Operação invalida!");
                break;
        }

        System.out.printf("\n resultado: %.2f%n", soma);

        sc.close();

    }
}