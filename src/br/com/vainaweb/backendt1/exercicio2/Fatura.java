package br.com.vainaweb.backendt1.exercicio2;

public class Fatura {
	String numeroProduto;
	String descricao;
	int quantidadeComprada;
	double precoProduto;
	
	public Fatura() {
		
	}

	public Fatura(String numeroProduto, String descricao, int quantidadeComprada, double precoProduto) {
		super();
		this.numeroProduto = numeroProduto;
		this.descricao = descricao;
		this.quantidadeComprada = quantidadeComprada;
		this.precoProduto = precoProduto;
	}
	
	public double faturaTotal(int quantidadeComprada, double precoProduto) {
		return quantidadeComprada * precoProduto;
	}

}
