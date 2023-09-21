
package main;


public class Servico implements Vendivel {
    
    private String descricao;
    private double horasTrabalhadas;
    private double valorMaoDeObraPorHora;
    
    
    public Servico(String descricao, double horasTrabalhadas, double valorMaoDeObraPorHora){
        this.descricao = descricao;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorMaoDeObraPorHora = valorMaoDeObraPorHora;
        
    }

    @Override
    public double getPrecoVenda() {
        return this.horasTrabalhadas * this.valorMaoDeObraPorHora;
        
        
    }
    
    
    
}
