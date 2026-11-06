class Carro { // Classe

    private String modelo; // Atributo
    private String cor;
    private boolean eletrico = true;
    int pneus = 4;


    //CONSTRUCTOR - CRIA O OBJETO
    Carro(String modelo, String cor, boolean eletrico) { // Parâmetros
        this.modelo = modelo;
        this.cor = cor;
        this.eletrico = eletrico;
        this.pneus = pneus;

    }

    void ligar() { // Método
        System.out.println("Ligado!");
    }

    void iniciarMotor(String marcha) {
        System.out.println("O carro saiu de " + marcha + " Marcha");
    }
    public int getPneus() {
        return pneus;
    }

    public void setPneus(int pneus) {
        this.pneus = pneus;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}

public class Main {
    public static void main(String[] args) {

        Carro meuCarro = new Carro("Corolla", "Branca", true);
        meuCarro.ligar();
        meuCarro.iniciarMotor("1ª");
        System.out.println("Seu carro " + meuCarro.getModelo() + " é de cor " + meuCarro.getCor() );
        meuCarro.setModelo("Toyota");
        System.out.println("Seu carro " + meuCarro.getModelo() + " é de cor " + meuCarro.getCor() );
    }
}
