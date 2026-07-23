/*
 * ==========================================================
 * JPR-006 - Switch
 * Curso: Java do Zero ao Projeto Real
 *
 * Objetivo:
 * Aprender a utilizar a estrutura switch para criar
 * múltiplas decisões de forma organizada.
 * ==========================================================
 */

/*import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("===Escolha a letra que===");
        System.out.println("==represente seu turno==");
        System.out.println("M - Matutino");
        System.out.println("V - Vespetino");
        System.out.println("N - Noturno");
        System.out.println("Digite a opção desejada: ");
        String codigo = teclado.nextLine();

        switch (codigo) {
            case "M":
                System.out.println("Matutino");
            break;
            case "V":
                System.out.println("Vespetino");
            break;
            case "N":
                System.out.println("Notuno");
            break;
            default:
                System.out.println("OPÇÃO INVÁLIDA");
            break;
        }

        teclado.close();

    }

}*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o código da Nota: ");
        String codigo = teclado.nextLine();

        switch (codigo) {

    case "A":   /*As notas A e B fazem exatamente a mesma ação.*/
    case "B":   /*É um uso correto e muito comum do fall-through.*/
        System.out.println("Aprovado");
        break;

    case "C":
        System.out.println("Recuperação");
        break;

    default:
        System.out.println("Reprovado");
}

        teclado.close();

    }
}