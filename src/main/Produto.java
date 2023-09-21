
package main;


public class Produto implements Vendivel{
    
    private String nome;
    private double precoCusto;
    private double porcentagemDeLucroDesejado;
    
    public Produto(String nome, double precoCusto, double porcentagemDeLucroDesejado){ 
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.porcentagemDeLucroDesejado = porcentagemDeLucroDesejado;
    }
    
    
    @Override
    public double getPrecoVenda() {
        return this.precoCusto + this.calcularLucro();
        
    }
    
    private double calcularLucro(){
        return this.precoCusto * (this.porcentagemDeLucroDesejado / 100);
       
        
    }
    
}
