package br.com.fiap.beans;

import br.com.fiap.interfaces.Eletronico;

public class Tablet extends Produto implements Eletronico{
	private String modelo;
	private String marca;
	private String sistemaOperacional;
	private boolean is3g;
	
	public Tablet() {
		super();
	}
	public Tablet(int codigo, String titulo, double preco, String modelo, String marca, String sistemaOperacional, boolean is3g) {
		super(codigo, titulo, preco);
		this.modelo = modelo;
		this.marca = marca;
		this.sistemaOperacional = sistemaOperacional;
		this.is3g = is3g;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getSistemaOperacional() {
		return sistemaOperacional;
	}
	public void setSistemaOperacional(String sistemaOperacional) {
		this.sistemaOperacional = sistemaOperacional;
	}
	public boolean isIs3g() {
		return is3g;
	}
	public void setIs3g(boolean is3g) {
		this.is3g = is3g;
	}
	@Override
	public double calcularGarantiaEstendida() {
		// TODO Auto-generated method stub
		return this.getPreco()*0.05;
	}
	
	public String getAll() {
		return "C�digo: " + this.getCodigo() + "\nT�tulo: " + this.getTitulo() + "\nPre�o: R$ " + this.getPreco() + "\nModelo: " + modelo + "\nMarca: " + marca + "\nSistema Operacional: " + sistemaOperacional + "\n3G: " + is3g;
	}
}