import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;
public class Desafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double inss, vt;

        while(true){
            double familia = 0;
            System.out.println("Digite seu salário:  ");
            String bruto = scanner.nextLine();
            if(bruto.equals("FIM")){
                break;
            }
            if(Double.parseDouble(bruto) >= 2000.00){
                inss = 0.11;
            }else if(Double.parseDouble(bruto) >= 1500.00){
                inss = 0.09;
            }else{
                inss = 0.08;
            }

            if(Double.parseDouble(bruto) >= 1000.00){
                vt = 0.06;
            }else{
                vt = 0.05;
            }

            if(Double.parseDouble(bruto) < 2000.00){
                System.out.println("Quantos dependentes você tem?  ");
                familia = Integer.parseInt(scanner.nextLine()) * 40;
                if(familia > 120){
                    familia = 120;
                }
            }
            System.out.println(Double.parseDouble(bruto)*inss +", "+ Double.parseDouble(bruto)*vt +", "+ familia);
            System.out.println((Double.parseDouble(bruto) * (1 - inss - vt)) + familia);
            System.out.println("Digite outro salário (ou digite FIM para sair):  ");


        }
    }
}