import java.util.Scanner;
public class prog6 {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Digite os 3 lados do triangula");


    System.out.println("L1");

    double l1 = input.nextDouble();
    System.out.println("L2"); double l2 = input.nextDouble();
    System.out.println("L3"); double l3 = input.nextDouble();

    if (l1 == l2 &&  (l1 == l3)) {
        System.out.println("Equilátero");
    }
    else if (l1 != l2 && (l1 != l3) && (l2 != l3)){
        System.out.println("Escaleno");
    }
    else {
        System.out.println("Isósceles");
    }
}
}
