public abstract class Conta {
    private int numero;
    private double saldo;

    public Conta(int numero, double saldoInicial) {
        this.numero = numero;
        this.saldo = saldoInicial;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
        }
    }

    public void transferir(double valor, Conta destino) {
        if (valor > 0 && saldo >= valor) {
            sacar(valor);
            destino.depositar(valor);
        }
    }

    public abstract void exibirDetalhes();
}
