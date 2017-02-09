package br.com.fiap.revisao;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import br.com.fiap.beans.Livro;
import br.com.fiap.beans.Produto;
import br.com.fiap.beans.Tablet;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Produto produto = new Produto(1, "T�tulo 1", 666);
		Tablet tablet = new Tablet(2, "Eletr�nicos", 4545, "Samsung", "Apple", "Linux", true);
		
		System.out.println(produto.getAll());
		System.out.println(tablet.getAll());
		System.out.println("Valor da garantia estendida: " + tablet.calcularGarantiaEstendida());
		
		Livro livros[] = new Livro[3];
		Calendar dataLancamento = new GregorianCalendar(1988,06,22);
		Calendar dataLancamento2 = new GregorianCalendar(1968,11,11);
		Calendar dataLancamento3 = new GregorianCalendar(2000,07,20);
		SimpleDateFormat formatacaoData = new SimpleDateFormat("dd/MM/yyyy");
		Livro livro1 = new Livro(3,"Livro 1", 22, "Joyce", "Curitibas", dataLancamento);
		Livro livro2 = new Livro(4,"Livro 3", 33, "Carlos", "Acres", dataLancamento2);
		Livro livro3 = new Livro(5,"Livro 4", 55, "Val�ria", "Poker", dataLancamento3);
}

}
