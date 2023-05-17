package BR.COM.AGENCIA_DE_VALORES.model;
//usei uma classe abstrata para não ter muito retrabalho

public abstract class Cliente {

    private int id;
    private int numConta;
    private String nomeCliente;
    private double salario;
    private double saldo;

    public Cliente(int id, int numConta, String nomeCliente, double salario, double saldo) {
        this.id = id;
        this.numConta = numConta;
        this.nomeCliente = nomeCliente;
        this.salario = salario;
        this.saldo = saldo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                ", numConta=" + numConta +
                ", nomeCliente='" + nomeCliente + '\'' +
                ", salario=" + salario +
                ", saldo=" + saldo +
                '}';
    }
}
