public class RodapeDecorator extends RelatorioDecorator {
    public RodapeDecorator(Relatorio relatorio) {
        super(relatorio);
    }

    @Override
    public String gerar() {
        return super.gerar() + "\nRODAPÉ DO RELATÓRIO";
    }
}
