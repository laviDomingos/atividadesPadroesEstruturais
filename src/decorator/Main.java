public class Main {
package decorator;
import decorator.component.Relatorio;
import decorator.RelatorioDecorator;
import decorator.src.Relatorio;
import decorator.src.RelatorioDecorator;
import decorator.Cabecalho;
import decorator.Assinatura;



    public static void main(String[] args) {
  
        decorator.component.Relatorio relatorio = new decorator.component.Relatorio() {
            @Override
            public String gerar() {
                return "Relatório básico";
            }
            
        };
        decorator.Cabecalho cabecalho = new decorator.Cabecalho(relatorio) {
            @Override
            public String gerar() {
                return "Cabeçalho: " + super.gerar();
            }
        };

        decorator.RelatorioDecorator relatorioDecorado = new decorator.RelatorioDecorator(relatorio) {
            @Override
            public String gerar() {
                return super.gerar() + " com informações adicionais";
            }
        };

        System.out.println(relatorioDecorado.gerar());
    }
}
