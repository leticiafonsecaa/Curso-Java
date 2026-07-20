/*
=========================================
Curso: Java do Zero ao Projeto Real
Código: JPR-004
Tema: Operadores Matemáticos,
Relacionais e Lógicos

Objetivos da aula:
- Aprender operadores matemáticos.
- Comparar valores utilizando operadores relacionais.
- Trabalhar com operadores lógicos.

Conceitos estudados:
- +, -, *, /
- >, <, >=, <=, ==, !=
- &&, ||, !

Autor: Letícia
=========================================
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Variável utilizada para verificar se o aluno passou no exame
        boolean passouNoExame = true;

        // Cria o Scanner
        Scanner teclado = new Scanner(System.in);

        // Solicita o nome
        System.out.print("Digite seu nome: ");
        String nome = teclado.nextLine();

        // Solicita a idade
        System.out.print("Digite sua idade: ");
        int idade = teclado.nextInt();

        // Calcula automaticamente se é maior de idade
        boolean maiorDeIdade = idade >= 18;

        // Verifica se pode dirigir
        boolean podeDirigir = maiorDeIdade && passouNoExame;

        // Exibe os resultados
        System.out.println();
        System.out.println("Olá, " + nome + "!");
        System.out.println("Maior de idade? " + maiorDeIdade);
        System.out.println("Pode dirigir? " + podeDirigir);

        // Fecha o Scanner
        teclado.close();

    }
}