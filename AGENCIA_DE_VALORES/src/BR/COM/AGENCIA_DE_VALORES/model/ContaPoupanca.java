package BR.COM.AGENCIA_DE_VALORES.model;

public class ContaPoupanca extends Cliente{

    private int id;
    protected double rendimento;

    public ContaPoupanca(int id, int numConta, String nomeCliente, double salario, double saldo, int id1) {
        super(id, numConta, nomeCliente, salario, saldo);
        this.id = id1;
    }


}
