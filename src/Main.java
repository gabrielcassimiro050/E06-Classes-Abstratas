public class Main {
    public static void main(String[] args) {

        Cliente joao = PessoaFisica.criarCliente("João", "123.456.789-09","Av. Antonio Carlos, 6627", 35, 'f');
        Cliente maninho = PessoaFisica.criarCliente("Maninho 2", "123.456.789-09","Av. Antonio Carlos, 6627", 35, 'm');

        if(joao==null){
            System.out.println("Cliente não foi criado");
        }else{
            System.out.println("Client foi criado com sucesso!");
        }

        Conta conta1 = new ContaCorrente(1234, joao, 0, 1500);
        Conta conta2 = new ContaCorrente(12121, maninho, 10000, 1500);

        conta1.depositar(3000);
        conta1.sacar(500);

        conta2.transferir(conta1, 666);
        conta2.depositar(234);

        conta1.imprimirExtrato();
        conta2.imprimirExtrato();
        System.out.println(conta1.toString());
        int media = Operacao.getTotalOperacoes() / Conta.getTotalContas();
        System.out.println("Média de operações por conta aberta: " + media);
    }
}
