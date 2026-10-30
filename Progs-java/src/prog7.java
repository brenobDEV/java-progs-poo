import java.util.Scanner;

public class prog7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite três números inteiros:");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int menor, meio, maior;


        if (a <= b && a <= c) {
            menor = a;

            if (b <= c) {
                meio = b;
                maior = c;
            } else {
                meio = c;
                maior = b;
            }

        } else if (b <= a && b <= c) {
            menor = b;
            if (a <= c) {
                meio = a;
                maior = c;
            } else {
                meio = c;
                maior = a;
            }


        } else {
            menor = c;
            if (a <= b) {
                meio = a;
                maior = b;
            } else {
                meio = b;
                maior = a;
            }
        }

        System.out.println("Saída: " + menor + " - " + meio + " - " + maior);

    }
}
