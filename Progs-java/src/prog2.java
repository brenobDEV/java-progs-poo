import java.util.Scanner;

public class prog2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o tempo em 'segundos' que falarei quantos dias, horas, minutos e segundos são:");
        int tempo = input.nextInt();

        int segundos =  (tempo % 60);
       int minutos = (tempo/60) % 60;
       int horas = (minutos/3600) % 24;
       int dias = tempo / 86400;

       System.out.println("Seu tempo toal é de: " + dias + " Dias " + horas + " Horas " + minutos + " Minutos & " +segundos + " Segundos ");

    }
}
