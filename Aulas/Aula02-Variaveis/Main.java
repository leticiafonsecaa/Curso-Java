/*
=========================================
Curso: Java do Zero ao Projeto Real
Código: JPR-002
Tema: Variáveis e Tipos de Dados

Objetivos da aula:
- Entender o conceito de variável.
- Conhecer os principais tipos de dados do Java.
- Declarar e utilizar variáveis.

Conceitos estudados:
- String
- int
- double
- boolean
- System.out.println()

Autor: Letícia
=========================================
*/

public class Main {

    public static void main(String[] args) {

        // Declaração das variáveis
        String nome = "Letícia";
        int idade = 22;
        String curso = "ADS";
        double nota = 9.5;
        boolean aprovado = true;

        // Exibição das informações
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Curso: " + curso);
        System.out.println("Nota: " + nota);
        System.out.println("Aprovado: " + aprovado);

    }
}