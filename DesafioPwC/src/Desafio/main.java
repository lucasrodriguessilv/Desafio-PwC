package Desafio;

import java.util.Scanner;

public class main {

	
	public static void main(String[] args) {
		Endereco endereco = new Endereco();
		endereco.mostar("Miritiba 339");
		endereco.mostar("Babaçu 500");
		endereco.mostar("Cambuí 123B");
		endereco.mostar("Rio Branco 23");
		endereco.mostar("Quirino dos Santos 23 b");


	Scanner ler = new Scanner(System.in);
	String entrada = ler.nextLine();
	Endereco enderecoComParametro = new Endereco(entrada);
	enderecoComParametro.mostar();

	
	//==============   BONUS =======================================================
			
	
	
	
	
	
	
	
	
	}
}
