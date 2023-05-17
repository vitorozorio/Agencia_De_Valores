package BR.COM.AGENCIA_DE_VALORES.testes;
import BR.COM.AGENCIA_DE_VALORES.model.AprovaFinenciamento;

public class TesteAprovacaoCredito {


    public static void main (String[] args) {
        AprovaFinenciamento vitor = new AprovaFinenciamento(22, 222, "vitor", 2000, 200);

        vitor.aprovarCredito(120000.00 , vitor.getSalario() , 240);

        /*este é o modulo teste de aprovação de credito.
        o tempo deve ser passado em meses !!!
         */

    }

}
