package decorator.component;

import decorator.RelatorioDecorator;

public class RelatorioSimples implements Relatorio {
    @Override
    public String gerar() {
        return "Conteúdo do relatório";
    }
}

