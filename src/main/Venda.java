
package main;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Venda {
    
    private Date dataVenda;
    private final List<Vendivel>carrinhoDeCompras = new ArrayList<>();
    private double precoTotalVenda;
    
    public void addItemAoCarrinho(Vendivel itemAVender){
        this.carrinhoDeCompras.add(itemAVender);
               
        
    }
       
    private void criarDataVenda(){
        this.dataVenda = new Date();
        
    }
    
    private void calcularValorDaVenda(){
       for (Vendivel itemVendivelDoCarrinho : this.carrinhoDeCompras){
           this.precoTotalVenda +=itemVendivelDoCarrinho.getPrecoVenda();
       }     
    }
    
    private void imprimirVenda(){
        System.out.println(
                "Venda efetuada com sucesso!"
                + "\n\n VALOR TOTAL = " + this.precoTotalVenda
                + "\n DATA DA VENDA = " + this.dataVenda.toString()
        );
    }
    
    public void vender(){
        //data da vende
        this.criarDataVenda();
        
        //calcular valor total dos itens do carrinho 
        calcularValorDaVenda();

        //imprimir a venda
        imprimirVenda();
        
    }
    
}
