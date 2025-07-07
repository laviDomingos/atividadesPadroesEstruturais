package decorator;

import decorator.src.Relatorio;
import decorator.src.RelatorioDecorator;




public class Assinatura extends RelatorioDecorator {

    private String assinatura;

    public Assinatura(Relatorio relatorio, String assinatura) {
        super(relatorio);
        this.assinatura = assinatura;
    
    }


    @Override
    public String gerar() {
        return super.gerar() + "\nAssinado por: " + assinatura;
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + " com Assinatura: " + assinatura;
    }
    
}