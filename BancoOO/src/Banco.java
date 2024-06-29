public class Banco {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(123, 1000.0, 500.0);
        ContaPoupanca cp = new ContaPoupanca(456, 2000.0, 0.05);

        cc.depositar(500);
        cp.sacar(300);

        cc.transferir(200, cp);

        cc.exibirDetalhes();
        cp.exibirDetalhes();

        cp.aplicarJuros();
        cp.exibirDetalhes();
    }
}
