import java.util.Scanner;

public class prog1j {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu sálário bebê:");
        double salario = input.nextDouble();

        if (salario >= 2000) {
            double salarioOfc = salario - (salario * 0.11) - (salario * 0.06);
            System.out.println("Aqui está o seu salário, descontando o inss e o vale transporte " + salarioOfc);
        } else if (salario < 1500 && salario > 2000) {
            double salarioOfc = salario - (salario * 0.09) - (salario * 0.06);
            System.out.println("Aqui está o seu salário, descontando o inss e o vale transporte " + salarioOfc);
        } else {
            double salarioOfc = salario - (salario * 0.08) - (salario * 0.05);
            System.out.println("Aqui está o seu salário, descontando o inss e o vale transporte " + salarioOfc);
        }

    }
}
