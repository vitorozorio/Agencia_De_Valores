package BR.COM.AGENCIA_DE_VALORES.testes;
import BR.COM.AGENCIA_DE_VALORES.model.ContaCorrente;

public class TesteCorrente {


    public static void main (String[] args){

        ContaCorrente Vitor = new ContaCorrente(2,222, "vitor",3000,100,200);

        System.out.println(Vitor.deposito(500));

        System.out.println(Vitor.saque(3000));

        // este é o modulo de teste da conta corrente que possui o atributo limite


    }

}
