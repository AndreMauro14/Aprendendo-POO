public class Conta {

    private int numero;
    private String pessoa;
    private double saldo;

    public Conta(String pessoa, int numero) {
        this.pessoa = pessoa;
        this.numero = numero;
    }

    public Conta(int numero, String pessoa, double DepositoInicial) {
        this.numero = numero;
        this.pessoa = pessoa;
        deposito(DepositoInicial);
    }

    public int getNumero() {
        return numero;
    }
    public String getPessoa() {
        return pessoa;
    }

    public void setPessoa(String pessoa){
        this.pessoa = pessoa;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposito(double quantia){
         saldo+=quantia;
    }

    public void sacar(double quantia){
        saldo-=quantia + 5.0 ;
    }
    public String toString(){
        return "Conta: "
                + numero
                +", nome: "
                + pessoa
                + ", saldo: R$"
                +String.format("%.2f", saldo);

    }

}
