package persistence;

public class Produto {
  private String codigo;
  private String nome;
  private String marca;
  private double preco;
  
  //Construtor
  public Produto (String c, String n, String m, double p){
      this.codigo = c;
      this.nome = n;
      this.marca = m;
      this.preco = p;
  }
  
}
