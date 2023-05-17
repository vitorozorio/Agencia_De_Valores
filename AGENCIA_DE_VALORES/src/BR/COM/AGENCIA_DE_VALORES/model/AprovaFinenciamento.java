package BR.COM.AGENCIA_DE_VALORES.model;

public class AprovaFinenciamento extends Cliente implements AprovarCredito, Metos_Saque_Deposito {
    public AprovaFinenciamento(int id, int numConta, String nomeCliente, double salario, double saldo) {
        super(id, numConta, nomeCliente, salario, saldo);
    }

    @Override
    public void aprovarCredito(double valorBem, double salario, int tempoParaPagar) {
        double calculo = salario * 0.30;
        double prestacao = valorBem / tempoParaPagar;

        if (prestacao < calculo) {
            System.out.println("credito aprovado");
        } else {
            System.out.println("credito negado");
        }
    }

    /*
    para realizarmos o calculo do financiamento foi preciso usar uma expressão matematica bem simples
    eu usei o canculo de porcentagem e depois fiz o calculo usando o valor das parcelas como base
     */
}
