package BR.COM.AGENCIA_DE_VALORES.model;
//esta interface calcula o financiamento da casa

public interface AprovarCredito {

    default void aprovarCredito(double valorBem , double salario , int tempoParaPagar) {
        double calculo = salario * 0.30;
        double prestacao = valorBem / tempoParaPagar;

        if (prestacao < calculo) {
            System.out.println("credito aprovado");
        } else {
            System.out.println("credito negado");
        }

    }

}
