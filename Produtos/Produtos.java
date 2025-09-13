public class Produtos {
     private String nome;
     private double preco;
     private int quantidade;


     public Produtos(String nome, double preco, int quantidade){
         this.nome = nome;
         this.preco=preco;
         this.quantidade=quantidade;
     }
    public Produtos(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    public String getNome(){
         return nome;
    }
    public void setNome(String nome)
    {
        this.nome = nome;

    }
    public double getPreco(){

         return preco;
    }
    public void setPreco(double preco)
    {
         this.preco = preco;

    }
    public double getQuantidade(double quantidade){
        return quantidade;
    }
     public double preco_total(){

         return preco*quantidade;
     }
    public void adicionar(int quantidade){

         this.quantidade += quantidade;
    }
    public void remover(int quantidade) {

         this.quantidade -= quantidade;
    }

    public String toString(){
         return "Prduto: "+ nome
                 +", Valor: R$"
                 +String.format("%.2f",preco)
                 +", Quantidade: "+quantidade
                 + ",Valor Total R$ "
                 + String.format("%.2f", preco_total());
    }
}
