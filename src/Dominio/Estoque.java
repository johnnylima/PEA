package Dominio;

public class Estoque {
	private double QuantidadeDisponivel;
	private double QuantidadeVendido;
	
	public Estoque(double QuantidadeDisponivel) {
		this.QuantidadeDisponivel = QuantidadeDisponivel;
	}
	
	public double getQuantidadeDisponivel() {
		return QuantidadeDisponivel;
	}
	public void setQuantidadeDisponivel(double quantidadeDisponivel) {
		QuantidadeDisponivel = quantidadeDisponivel;
	}
	public double getQuantidadeVendido() {
		return QuantidadeVendido;
	}
	public void setQuantidadeVendido(double quantidadeVendido) {
		QuantidadeVendido = quantidadeVendido;
	}
}
