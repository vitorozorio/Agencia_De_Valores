package BR.COM.AGENCIA_DE_VALORES.model;

public class ContaCorrente extends Cliente {

    private int id;
    private int limite;

    public ContaCorrente(int id, int numConta, String nomeCliente, double salario, double saldo) {
        super(id, numConta, nomeCliente, salario, saldo);
    }
}
