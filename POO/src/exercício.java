public class Main {
    public static void main(String[] args) {
        ContaBancaria minhaConta = new ContaBancaria(
                "Gustavo",
                123,
                500.00);

        minhaConta.depositar(200.00);
        minhaConta.sacar(1000.00);
        minhaConta.sacar(300.00);
        minhaConta.exibirExtrato();

    }
}

class ContaBancaria{
    private String titular;
    private int numero;
    private double saldo;
    ContaBancaria(String titular, int numero, double depositoInicial){
        this.titular = titular;
        this.numero = numero;
        this.saldo = depositoInicial;
    }
    ContaBancaria(String titular, int numero){
        this.titular = titular;
        this.numero = numero;
        this.saldo = 0;
    }
    //GETTERS:
    public String getTitular() {
        return titular;
    }
    public double getSaldo() {
        return saldo;
    }
    public int getNumero() {
        return numero;
    }

    //SETTER:
    void depositar(double valor){
        this.saldo += valor;
        exibirExtrato();
    }

    boolean sacar(double valor){
        if (valor<=this.saldo){
            this.saldo -= valor;
            exibirExtrato();
            return true;
        }else{
            System.out.println("Saldo insuficiente");
            return false;
        }
    }
    //Método comum
    void exibirExtrato(){
        System.out.println("Seu extrato atual é de " + this.saldo);
    }

}