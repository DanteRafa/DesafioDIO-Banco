// IntefaceConta = Classe abstrata com todos os métodos abstratos. Vai obrigar a todas as classes que
// extenderem dela a implementarem tudo que ela tem.

public interface InterfaceConta {

    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, InterfaceConta contaDestino); // metodo generico que pode receber Corrente ou poupança

    void imprimirExtrato();

}
