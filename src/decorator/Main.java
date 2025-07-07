public class Main {
    public static void main(String[] args) {
        
        Relatorio relatorio = new RelatorioSimples();

        relatorio = new CabecalhoDecorator(relatorio);

        relatorio = new RodapeDecorator(relatorio);

        relatorio = new AssinaturaDecorator(relatorio);

        System.out.println(relatorio.gerar());
    }
}
