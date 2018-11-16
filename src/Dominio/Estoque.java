package Dominio;

public class Estoque {
	private double QuantidadeDisponivel;
	
	public Estoque(double QuantidadeDisponivel) {
		this.QuantidadeDisponivel = QuantidadeDisponivel;
	}
	
	public double getQuantidadeDisponivel() {
		return QuantidadeDisponivel;
	}
	
	public void AdiconarEstoque(int quantidade) {
		QuantidadeDisponivel =+ quantidade;
	}
	
	public void RemoveEstoque(int quantidade) {
		QuantidadeDisponivel =- quantidade;
	}
}
