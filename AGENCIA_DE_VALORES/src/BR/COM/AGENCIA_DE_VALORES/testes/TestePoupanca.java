package BR.COM.AGENCIA_DE_VALORES.testes;
import BR.COM.AGENCIA_DE_VALORES.model.ContaPoupanca;

public class TestePoupanca {

    public static void main (String[] args){

        ContaPoupanca Vitor = new ContaPoupanca(22,222,"vitor",2125,1500);

        System.out.println(Vitor.deposito(500));
        System.out.println(Vitor.saque(300));

        //este é o modulo de teste da poucanlça que calcula os rendimentos

    }

}
