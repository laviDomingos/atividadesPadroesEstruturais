public class Empregado implements Funcionario {
    private String nome;
    private String cargo;

    public Empregado(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println(cargo + ": " + nome);
    }
}
