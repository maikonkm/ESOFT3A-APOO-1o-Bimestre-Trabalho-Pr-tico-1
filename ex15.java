package EXE15;

/******************************************************************************
Curso: Engenharia de Software
Disciplina: Análise e Projeto Orienta a Objetos
Professor: José Carlos Flores
Turma: ESOFT3A
Exercício: 15 - Criação de Classes e Objetos
Componentes:


 Guilherme Garcia Da cruz - 25229817-2
 Lucas Henrique Zeferino - 25119616-2
 Maikon Vinicio Duarte dos Santos - 25165588-2
 
 
 
 
Data: 05 de Março de 2026
Descritivo: Escreva um programa que calcule o Índice de Massa Corporal (IMC) de uma pessoa. O programa deve solicitar o peso (em kg) e a altura (em metros) do usuário, calcular o IMC e exibir o resultado junto com a classificação correspondente (abaixo do peso, peso normal, sobrepeso, obesidade grau I, obesidade grau II, obesidade grau III).
*******************************************************************************/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Cria o objeto para ler dados do usuário
        Scanner sc = new Scanner(System.in);

        // Solicita o peso
        System.out.print("Digite seu peso (kg): ");
        double peso = sc.nextDouble();

        // Solicita a altura
        System.out.print("Digite sua altura (m): ");
        double altura = sc.nextDouble();

        // Calcula o IMC
        double imc = peso / (altura * altura);

        // Exibe o valor do IMC
        System.out.println("Seu IMC é: " + imc);

        // Classificação
        if (imc < 18.5) {
            System.out.println("Classificação: Abaixo do peso");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Classificação: Peso normal");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Classificação: Sobrepeso");
        } else if (imc >= 30 && imc < 35) {
            System.out.println("Classificação: Obesidade grau I");
        } else if (imc >= 35 && imc < 40) {
            System.out.println("Classificação: Obesidade grau II");
        } else {
            System.out.println("Classificação: Obesidade grau III");
        }

        // Fecha o Scanner
        sc.close();
    }
}