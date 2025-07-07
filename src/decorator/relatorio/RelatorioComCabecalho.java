public class CabecalhoDecorator extends RelatorioDecorator {
    public CabecalhoDecorator(Relatorio relatorio) {
        super(relatorio);
    }

    @Override
    public String gerar() {
        return "CABEÇALHO DO RELATÓRIO\n" + super.gerar();
    }
}
