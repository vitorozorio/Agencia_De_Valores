package BR.COM.AGENCIA_DE_VALORES.model;

public class ContaPoupanca extends Cliente implements Metos_Saque_Deposito{

    protected double rendimento;

    public ContaPoupanca(int id, int numConta, String nomeCliente, double salario, double saldo) {
        super(id, numConta, nomeCliente, salario, saldo);
    }

    @Override
    public double deposito(double valor) {
        super.setSaldo(valor + super.getSaldo());
        return super.getSaldo();
    }
}
