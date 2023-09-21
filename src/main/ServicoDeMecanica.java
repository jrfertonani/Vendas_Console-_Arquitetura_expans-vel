
package main;

import java.util.ArrayList;
import java.util.List;


public class ServicoDeMecanica extends Servico{
    
    private final List<Produto> pecasUtilizadas = new ArrayList<>();
    
    
    public ServicoDeMecanica(String descricao, double horasTrabalhadas, double valorMaoDeObraPorHora) {
        super(descricao, horasTrabalhadas, valorMaoDeObraPorHora);
    }
    
    public void addPecaAoServico(Produto pecaDoServico){
        this.pecasUtilizadas.add(pecaDoServico);
        
    }
    
    @Override
    public double getPrecoVenda(){
        double valorTotalPecas = 0.0;
        double valorTotalMaoDeObra = 0.0;        
        valorTotalMaoDeObra = super.getPrecoVenda();
        valorTotalPecas = this.calcularValorPecasUtilizadas();
        return valorTotalMaoDeObra + valorTotalPecas;
    }
    
    private double calcularValorPecasUtilizadas(){
        double valorTotalPecas = 0.0;
        for(Produto pecaUtilizada : this.pecasUtilizadas){
            valorTotalPecas += pecaUtilizada.getPrecoVenda();
        }
        return valorTotalPecas;
    }
    
}
