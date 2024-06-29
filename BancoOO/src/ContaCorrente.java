public class ContaCorrente extends Conta {
    private double limiteChequeEspecial;

    public ContaCorrente(int numero, double saldoInicial, double limiteChequeEspecial) {
        super(numero, saldoInicial);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && getSaldo() + limiteChequeEspecial >= valor) {
            double novoSaldo = getSaldo() - valor;
            if (novoSaldo < 0) {
                limiteChequeEspecial += novoSaldo; // Utiliza cheque especial
            }
            super.sacar(valor);
        }
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Conta Corrente: " + getNumero() + ", Saldo: " + getSaldo() + ", Cheque Especial: " + limiteChequeEspecial);
    }
}
