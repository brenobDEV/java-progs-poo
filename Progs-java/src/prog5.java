import java.util.Scanner;

public class prog5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite aqui um ano que direi se ele é bissexto");
        int ano = input.nextInt();


        if (ano % 400 == 0) {
        System.out.println("Bissexto");
        }
        else if  (ano % 100 == 0){
            System.out.println(" Não bissexto");
        }
        else if (ano % 4 == 0){
            System.out.println(" bissexto");
        }
        else {
            System.out.println(" Não bissexto");
        }
    }
}
