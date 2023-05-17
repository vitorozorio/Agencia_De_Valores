package BR.COM.AGENCIA_DE_VALORES.model;
/*
a classe conta corrente usa metodos abstratos para polpar pronar o programa menos poluido
usei tambem metodos matematicos simples para realizar os calculos
 */

public class ContaCorrente extends Cliente implements Metos_Saque_Deposito, AprovarCredito {

    private final int limite;

    public ContaCorrente(int id, int numConta, String nomeCliente, double salario, double saldo, int limite) {
        super(id, numConta, nomeCliente, salario, saldo);
        this.limite = limite;
    }

    @Override
    public double saque(double valor) {
        super.setSaldo(super.getSaldo() - valor);

        if(super.getSaldo() < this.limite){
            System.out.println("conta negativada");
            return getSaldo();
        } else {
            return getSaldo();
        }

    }

    @Override
    public double deposito(double valor) {
        super.setSaldo(super.getSaldo() + valor);
        return super.getSaldo();
    }
}
