public class ContaPoupanca extends Conta {
    private double taxaDeJuros;

    public ContaPoupanca(int numero, double saldoInicial, double taxaDeJuros) {
        super(numero, saldoInicial);
        this.taxaDeJuros = taxaDeJuros;
    }

    public void aplicarJuros() {
        double juros = getSaldo() * taxaDeJuros;
        depositar(juros);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Conta Poupança: " + getNumero() + ", Saldo: " + getSaldo() + ", Taxa de Juros: " + taxaDeJuros);
    }
}
