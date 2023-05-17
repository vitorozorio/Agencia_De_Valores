package BR.COM.AGENCIA_DE_VALORES.model;
// os metodos de saque e deposito foram usados em duas classes diferentes e neles foram aplicados o polimorfismo
public interface Metos_Saque_Deposito  {

    public default double saque(double valor) {

        return valor;
    }

    public default double deposito(double valor) {
        return valor;
    }


}
