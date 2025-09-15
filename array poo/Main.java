import java.util.Scanner;

public class Main{
    public static void main (String []args){
        Scanner input = new Scanner(System.in);
        Aluguel[] vetor = new Aluguel[10];
        System.out.println("Quantos quartos estão alugados? :");
        int n = input.nextInt();

        for (int i = 0; i<n; i++){
            System.out.println();
            System.out.println("Aluguel #"+(i+1)+":");
            System.out.println("Digite seu nome: ");
            input.nextLine();
            String nome = input.nextLine();
            System.out.println("email:");
            String email= input.nextLine();
            System.out.println("numero do quarto:");
            int numero = input.nextInt();
            vetor [numero] = new Aluguel(nome, email);
        }
        System.out.println();
        System.out.println("Quartos ocupados: ");
        for (int i = 0 ; i <10;i++){
            if (vetor[i]!=null){
                System.out.println(i +": "+ vetor[i]);
            }
        }
        input.close();
    }
}