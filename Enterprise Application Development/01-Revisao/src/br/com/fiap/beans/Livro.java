package br.com.fiap.beans;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Livro extends Produto{
	private String autor;
	private String editora;
	private Calendar dataLancamento;
	public Livro() {
		super();
	}
	public Livro(int codigo, String titulo, double preco, String autor, String editora, Calendar dataLancamento) {
		super(codigo, titulo, preco);
		this.autor = autor;
		this.editora = editora;
		this.dataLancamento = dataLancamento;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public Calendar getDataLancamento() {
		return dataLancamento;
	}
	public void setDataLancamento(Calendar dataLancamento) {
		this.dataLancamento = dataLancamento;
	}
	public String getAll() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return "Autor: " + autor + "\nEditora: " + editora + "\nData de lanšamento: " + sdf.format(dataLancamento.getTime());
	}
}
