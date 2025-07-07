public class EmpresaDemo {
    public static void main(String[] args) {
        Funcionario dev1 = new Empregado("Alice", "Desenvolvedora");
        Funcionario dev2 = new Empregado("Bob", "Desenvolvedor");

        Gerente gerenteTI = new Gerente("Carlos", "Gerente de TI");
        gerenteTI.adicionar(dev1);
        gerenteTI.adicionar(dev2);

        Funcionario designer = new Empregado("Diana", "Designer");

        Gerente diretor = new Gerente("Eduardo", "Diretor de Tecnologia");
        diretor.adicionar(gerenteTI);
        diretor.adicionar(designer);

        diretor.exibirInformacoes();
    }
}
