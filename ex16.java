package EXE16;

/******************************************************************************
Curso: Engenharia de Software
Disciplina: Análise e Projeto Orienta a Objetos
Professor: José Carlos Flores
Turma: ESOFT3A
Exercício: 16 - Criação de Classes e Objetos
Componentes:


 Guilherme Garcia Da cruz - 25229817-2
 Lucas Henrique Zeferino - 25119616-2
 Maikon Vinicio Duarte dos Santos - 25165588-2
 
 
 
 
Data: 05 de Março de 2026
Descritivo: Escreva um programa que solicite ao usuário uma senha e verifique se ela é válida. A senha deve atender aos seguintes critérios:
*******************************************************************************/
import java.util.Scanner;

public class Main {

    public static String validarSenha(String senha) {

        if (senha.length() < 8) {
            return "Senha invalida: deve ter pelo menos 8 caracteres.";
        }

        boolean temMaiuscula = false;
        boolean temMinuscula = false;
        boolean temNumero    = false;
        boolean temEspecial  = false;

        String especiais = "!@#$%^&*()_+-=[]{}|;:,.<>?";

        for (char c : senha.toCharArray()) {
            if (Character.isUpperCase(c))  temMaiuscula = true;
            if (Character.isLowerCase(c))  temMinuscula = true;
            if (Character.isDigit(c))      temNumero    = true;
            if (especiais.indexOf(c) >= 0) temEspecial  = true;
        }

        if (!temMaiuscula) return "Senha invalida: precisa de pelo menos uma letra maiuscula.";
        if (!temMinuscula) return "Senha invalida: precisa de pelo menos uma letra minuscula.";
        if (!temNumero)    return "Senha invalida: precisa de pelo menos um numero.";
        if (!temEspecial)  return "Senha invalida: precisa de pelo menos um caractere especial.";

        return "Senha valida!";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua senha: ");
        String senha = scanner.nextLine();
        System.out.println(validarSenha(senha));
        scanner.close();
    }
}