package BR.COM.AGENCIA_DE_VALORES.model;

public interface Metos_Saque_Deposito  {

    public default double saque(double valor) {
        return 0;
    }

    public default double deposito(double valor) {
        return 0;
    }


}
