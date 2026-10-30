import java.util.Scanner;
public class prog4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um valor para saque:");
        int valor = input.nextInt();

        int nota100 = valor/100;
        int restante = valor % 100;
        int nota50 = restante/50;
        restante = restante % 50;
        int nota20 = restante/20;
        restante = restante % 20;
        int nota10 = restante/10;
        restante = restante % 10;
        int nota5 = restante/5;
        restante = restante % 5;
        int nota2 = restante/2;
        restante = restante % 2;
        int nota1 = restante;

        System.out.printf("100: %d | 50: %d | 20: %d | 10: %d | 5: %d | 2: %d | 1: %d%n",
                nota100, nota50, nota20, nota10, nota5, nota2, nota1);    }
}
