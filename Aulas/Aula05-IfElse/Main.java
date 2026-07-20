/*
=========================================
Curso: Java do Zero ao Projeto Real
Código: JPR-005
Tema: Estruturas de Decisão

Objetivos da aula:
- Aprender if e else.
- Tomar decisões utilizando condições.

Autor: Letícia
=========================================
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite sua nota: ");
        double nota = teclado.nextDouble();

        if (nota >= 7) {

            System.out.println("Aprovado!");

        } else {
            
            System.out.println("Reprovado!");
        }

        teclado.close();

    }

}