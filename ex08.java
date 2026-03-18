package EXE08;
/******************************************************************************
Curso: Engenharia de Software
Disciplina: Análise e Projeto Orienta a Objetos
Professor: José Carlos Flores
Turma: ESOFT3A
Exercício: 08 - Criação de Classes e Objetos
Componentes:


 Guilherme Garcia Da cruz - 25229817-2
 Lucas Henrique Zeferino - 25119616-2
 Maikon Vinicio Duarte dos Santos - 25165588-2
 
 
 
 
Data: 05 de Março de 2026
Descritivo: Escreva um programa que conte o número de vogais em uma string fornecida pelo usuário.
*******************************************************************************/

import java.util.Scanner;

public class ex08 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
  
        int cont = 0;

        System.out.println("Digite uma palavra: ");
            String txt = sc.nextLine();
        
        for(int i = 0; i < txt.length(); i++){
            char letra = txt.charAt(i);

            letra = Character.toLowerCase(letra); // transforma em minúsculo
            
            if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
                cont++;
            }
        }

        System.out.printf("\n temos %d vogais na palavra ", cont);

    }
}