public class EnsinoMedio extends Aluno {
    private String espec;

    EnsinoMedio(String nome, String espec) {
        this.nome = nome;
        this.espec = nome;
    }

    public void mostrarAluno() {
        System.out.println("Nome: " + nome);
        System.out.println("Média: " + media);
        System.out.println("Status: " + situacao);
        System.out.println("Status: " + espec);
    }
}
