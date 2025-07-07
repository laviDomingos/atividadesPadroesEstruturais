package decorator;

import decorator.src.Relatorio;
import decorator.src.RelatorioDecorator;



public class Cabecalho extends Relatorio{
    private Relatorio relatorio;
    public Cabecalho(Relatorio relatorio) {
        this.relatorio = relatorio;
    }
    @Override
    public String gerar() {
        return "com Cabeçalho" + super.gerar();
    }
}
