package BR.COM.AGENCIA_DE_VALORES.model;

public final class Poupanca extends ContaBancaria implements Operacoes  {

    public Poupanca(String nome, String numeroDaConta, double saldo) {
        super(nome, numeroDaConta, saldo);
    }

    public Poupanca(){}

    public double CALCULARRENDIMENTO(double saldo){

        double RENDIMENTO = 0.05; // este metodo faz o calculo de rendimento a partir da poupança do cliente
        double s = super.getSaldo() * RENDIMENTO;
        return s + super.getSaldo();
    }

    @Override
    public double sacar(double s) {
        super.setSaldo(getSaldo() - s);
        System.out.print("saldo restante :");
        return getSaldo();
    }

    @Override
    public double depositar(double d) {
        super.setSaldo(depositar(d));
        System.out.print("saldo com rendimentos de 0,005 % :" + CALCULARRENDIMENTO(getSaldo()));
        return d;
    }

}




