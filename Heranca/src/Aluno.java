public class Aluno {
    protected String nome, situacao;

    protected double prova01, prova02, media;

    public double getMedia() {
        return this.media;
    }
    public double calcularMedia() {
        this.media = (prova01 + prova02) / 2;
        return this.media;
    }

    public String verificarSituacao() {
        if (this.media >= 7.0) return "Aprovado";
        return "Reprovado";
    }

    public void mostrarAluno() {
        System.out.println("Nome: " + nome);
        System.out.println("Média: " + media);
        System.out.println("Status: " + situacao);
    }

}

