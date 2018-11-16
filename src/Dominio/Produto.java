package Dominio;

import Enum.ECategoriaProduto;

public class Produto {
	private String Nome;
	private ECategoriaProduto Categoria;
	private double Valor;
	private Estoque Estoque;
	private String Figura;
	
	public Produto(String Nome, ECategoriaProduto Categoria, double Valor, double QuantidadeDisponivel, String Figura) {
		this.setNome(Nome);
		this.setCategoria(Categoria);
		this.setValor(Valor);
		this.Figura = Figura;
		this.Estoque = new Estoque(QuantidadeDisponivel);
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
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

	public String getFigura() {
		return Figura;
	}
}
