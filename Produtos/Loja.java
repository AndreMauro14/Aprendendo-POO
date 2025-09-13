import java.util.Scanner;
public class Loja {
    public static void main(String[] args) {
    Scanner sc =  new Scanner(System.in);

        Produtos produto = new Produtos("PC", 2000);

        System.out.println("Nome atual: "+produto.getNome());
        System.out.println ("Preco atual: "+ produto.getPreco());
        System.out.println(produto);


        System.out.println(" ");
        System.out.print("Digite a quantidade que voce quer adicionar no estoque: ");
        int quantidade=sc.nextInt();
        System.out.println(" ");
        produto.adicionar(quantidade);


        System.out.println("Dados Atualizados: "+ produto);

        System.out.println(" ");
        System.out.print("Digite a quantidade que voce quer remover do estoque: ");
        quantidade =sc.nextInt();
        produto.remover(quantidade);
        System.out.println(" ");
        System.out.println("Dados Atualizados: "+ produto);
    sc.close();

    }
}