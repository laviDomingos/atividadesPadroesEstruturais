package composite;

import java.util.ArrayList;
import java.util.List;

public class Gerente implements Funcionario {

    private String nome;
    private String cargo;
    private List<Funcionario> subordinados = new ArrayList<>();
    
    public Gerente(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

    public void adicionar(Funcionario f) {
        subordinados.add(f);
    }

    public void remover(Funcionario f) {
        subordinados.remove(f);
    }

    @Override
    public void exibirInformacoes() {
        System.out.println(cargo + ": " + nome);
        for (Funcionario f : subordinados) {
            f.exibirInformacoes(); // chamada recursiva
        }
    }
}