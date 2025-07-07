public class AssinaturaDecorator extends RelatorioDecorator {
    public AssinaturaDecorator(Relatorio relatorio) {
        super(relatorio);
    }

    @Override
    public String gerar() {
        return super.gerar() + "\nAssinado por: Gerente Fulano";
    }
}
