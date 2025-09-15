import java.util.Scanner;
public class Main{
    public static void main (String[]args){
        Scanner input = new Scanner (System.in);
        Conta conta;

        System.out.println("---Digite os dados da sua conta---");
        System.out.print("Digite o numero da sua conta:");
        int numero = input.nextInt();
        System.out.print("Digite o seu nome:");
        input.nextLine();
        String nome = input.nextLine();
        System.out.print("Você quer fazer um deposito inicial?(s/n)");
        char resposta = input.next().charAt(0);
        if (resposta=='s'){
            System.out.print("Digite o valor:");
            double DI = input.nextDouble();
            conta = new Conta(numero,nome,DI);
        }
        else {
            conta = new Conta(nome, numero);
        }
        System.out.println(" ");
        System.out.println("---Dados da Conta---");
        System.out.println(conta);
        double ValorDepositado;
    do {
        System.out.println(" ");
        System.out.println("Deposite um valor: ");
        ValorDepositado = input.nextDouble();
        if (ValorDepositado<=0){
            System.out.println("ERRO! SÓ É ACEITO VALORES POSITIVOS");
        }

    }while (ValorDepositado<=0);

        conta.deposito(ValorDepositado);

        System.out.println(" ");
        System.out.println("---Dados da Conta---");
        System.out.println(conta);

        System.out.println(" ");
        System.out.println("Saque um valor: ");
        double ValorRetirado = input.nextDouble();
        conta.sacar(ValorRetirado);

        System.out.println(" ");
        System.out.println("---Dados da Conta---");
        System.out.println(conta);
    }

}
