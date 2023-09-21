package main;

public class Main {

    public static void main(String[] args) {
        //Simulando BD com lista dos Produtos
        Produto peteca = new Produto("Peteca", 20, 10);
        Produto computador = new Produto("Computador basico", 2000, 20);
        Produto pirulito = new Produto("Pirulito ", 2, 10);

        //simulando DB com listagem dos servicos
        Servico limpezaDeQuadros = new Servico("Limpeza de quadros sujos", 3, 100);
        Servico detetizacao = new Servico("Mata ratos", 5, 200);

        ServicoDeMecanica s1 = new ServicoDeMecanica("Rebimboca da parafuzeta", 1, 100);
        Produto peca1 = new Produto("rebimboca 1", 50, 10);
        Produto peca2 = new Produto("rebimboca alternada", 100, 15);
        s1.addPecaAoServico(peca1);
        s1.addPecaAoServico(peca2);

        Venda venda = new Venda();

        venda.addItemAoCarrinho(computador);
        venda.addItemAoCarrinho(computador);
        venda.addItemAoCarrinho(pirulito);

        venda.addItemAoCarrinho(limpezaDeQuadros);
        venda.addItemAoCarrinho(detetizacao);
        venda.addItemAoCarrinho(s1);

        venda.vender();

    }

}
