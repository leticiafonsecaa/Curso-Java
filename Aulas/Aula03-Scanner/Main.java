/*
=========================================
Curso: Java do Zero ao Projeto Real
Código: JPR-003
Tema: Entrada de Dados com Scanner

Objetivos da aula:
- Aprender a utilizar a classe Scanner.
- Receber informações digitadas pelo usuário.
- Trabalhar com diferentes tipos de entrada.

Conceitos estudados:
- import
- Scanner
- nextLine()
- nextInt()
- nextDouble()
- close()

Autor: Letícia
=========================================
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Cria o Scanner para ler dados do teclado
        Scanner teclado = new Scanner(System.in);

        // Solicita o nome
        System.out.print("Digite seu nome: ");
        String nome = teclado.nextLine();

        // Solicita o curso
        System.out.print("Digite seu curso: ");
        String curso = teclado.nextLine();

        // Solicita as notas
        System.out.print("Digite a nota 1: ");
        double nota1 = teclado.nextDouble();

        System.out.print("Digite a nota 2: ");
        double nota2 = teclado.nextDouble();

        // Calcula a média
        double media = (nota1 + nota2) / 2;

        // Exibe o boletim
        System.out.println();
        System.out.println("========= BOLETIM =========");
        System.out.println("Aluno: " + nome);
        System.out.println("Curso: " + curso);
        System.out.println();
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Média: " + media);
        System.out.println("===========================");

        // Fecha o Scanner
        teclado.close();

    }
}