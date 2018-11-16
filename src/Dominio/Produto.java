package Dominio;

import Enum.ECategoriaProduto;

public class Produto {
	private String Nome;
	private String Descricao;
	private ECategoriaProduto Categoria;
	private double Valor;
	private Estoque Estoque;
	
	public Produto(String Nome, String Descricao, ECategoriaProduto Categoria, double Valor, double QuantidadeDisponivel) {
		this.setNome(Nome);
		this.setDescricao(Descricao);	
		this.setCategoria(Categoria);
		this.setValor(Valor);
		this.setEstoque(new Estoque(QuantidadeDisponivel));
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getDescricao() {
		return Descricao;
	}

	public void setDescricao(String descricao) {
		Descricao = descricao;
	}

	public ECategoriaProduto getCategoria() {
		return Categoria;
	}

	public void setCategoria(ECategoriaProduto categoria) {
		Categoria = categoria;
	}

	public double getValor() {
		return Valor;
	}

	public void setValor(double valor) {
		Valor = valor;
	}

	public Estoque getEstoque() {
		return Estoque;
	}

	public void setEstoque(Estoque estoque) {
		Estoque = estoque;
	}
	
}
