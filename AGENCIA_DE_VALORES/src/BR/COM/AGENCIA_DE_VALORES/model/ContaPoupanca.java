package BR.COM.AGENCIA_DE_VALORES.model;

public class ContaPoupanca extends Cliente implements Metos_Saque_Deposito {
/*
a classe conta poupança usa metodos abstratos para polpar pronar o programa menos poluido
usei tambem metodos matematicos simples para realizar os calculos
 */

    public ContaPoupanca(int id, int numConta, String nomeCliente, double salario, double saldo) {
        super(id, numConta, nomeCliente, salario, saldo);
    }

    @Override
    public double deposito(double valor) {
        double novoSaldo = super.getSaldo() + valor;
        double rendimento = novoSaldo * 0.05; // 0.05% de rendimento
        novoSaldo += rendimento;
        super.setSaldo(novoSaldo);
        return novoSaldo;
    }

    @Override
    public double saque(double valor) {
        super.setSaldo(super.getSaldo() - valor);
        return super.getSaldo();
    }
}
