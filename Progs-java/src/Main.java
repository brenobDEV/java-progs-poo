package progs_java;

import java.util.Scanner;
// IMPUT ATRAVES DE POP UP // import javax.swing.JOptionPane


public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero2 = 100;
        double decimal = 100.00;
        boolean booleano = true;
        String texto = "nome";

        System.out.println("Qual o seu " + texto);
        String nome = leitor.nextLine();
        System.out.println("seu nome é " + nome);

        System.out.println("Qual o sua IDADE?");
        String idade = leitor.nextLine();

        if (Integer.parseInt(idade) >= 65 || Integer.parseInt(idade) <= 18) {
            System.out.println("Não pode entrar");

        } else {
            System.out.println("ENTRE!");
        }

        for (int i = 1; i<=4; i++) {
            int numero = leitor.nextInt();
            if (numero % 2 == 0) {
                System.out.println("par");
            } else {
                System.out.println("Ímpar");
            }
        }
    }
}





