package BR.COM.AGENCIA_DE_VALORES.model;

public interface AprovarCredito {

    public default boolean aprovarCredito(double valorBem) {
        return false;
    }


}
