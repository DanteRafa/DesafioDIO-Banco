public class Main {
    public static void main(String[] args) {

        Cliente dante = new Cliente();
        dante.setNome("Dante");

        Conta cc = new ContaCorrente(dante);
        Conta poupanca = new ContaPoupanca(dante);

        cc.depositar(7200);
        cc.transferir(1900, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}