import java.util.Scanner;

public class prog3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número inteiro de 3 dígitos");
      int numero1 = input.nextInt();

      int unidade = numero1 % 10;
      int dezena = (numero1/10) % 10;
      int centena = numero1/100;

      int soma = unidade + dezena + centena;
      int invertido = (unidade * 100) + (dezena * 10) + centena;

      System.out.println("| Centena " + centena + "| Dezena " + dezena + "| Unidade " + unidade);
      System.out.println("soma = " + soma);
        System.out.println("Invertido = " + invertido);
    }

}
