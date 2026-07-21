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

/*IF ELSE */
/*import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a temperatura atual: ");
        double temperatura = teclado.nextDouble();

        if (temperatura >= 30) {

            System.out.println("Está quente!");

        } else {
            
            System.out.println("Está agradável!");
        }

        teclado.close();

    }

}*/

/*ELSE IF */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = teclado.nextInt();

        if (idade < 16) {
            
            System.out.println("Não pode votar");

        } else if (idade >=16 && idade <= 17) {

            System.out.println("Voto facultativo");
            
        } else if (idade >=18 && idade <= 69){

            System.out.println("Voto obrigatório");

        } else {
            System.out.println("Voto facultativo");
        }

        teclado.close();

    }

}