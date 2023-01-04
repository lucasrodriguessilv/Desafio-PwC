package Desafio;

import java.util.ArrayList;
import java.util.Arrays;

public class Endereco {
	
private String [] arreyStrings;
	

	public Endereco(String arreyStrings) {
		
	String [] enderecoArray = arreyStrings.split(" ");
	 this.arreyStrings = enderecoArray;
	}
	
	public Endereco() {}
	
	public String[] getArreyStrings() {
		return arreyStrings;
	}
	
	
	public void setArreyStrings(String[] arreyStrings) {
	this.arreyStrings = arreyStrings;
	}	
	public void mostar () {
	if (arreyStrings.length <= 2) {
	System.out.println(Arrays.toString(arreyStrings));
	}
	else if (arreyStrings.length >= 2 && arreyStrings.length < 4) {
	String rua = arreyStrings[0]+" "+arreyStrings[1];
	String numero = arreyStrings[2];
	ArrayList<String> lista = new ArrayList<String>();
	lista.add(rua);
	lista.add(numero);
	System.out.println(lista.toString());
	//----------------------------------------------------
	}
	else if (arreyStrings.length > 3 &&
	arreyStrings.length <= 4 ) {
	String rua = arreyStrings[0]+ " "+arreyStrings[1]+
	" "+arreyStrings[2];
	String numero = arreyStrings[3];
	ArrayList<String> lista = new ArrayList<String>();
	lista.add(rua);
	lista.add(numero);
	System.out.println(lista.toString());
	//-------------------------------------------------------
	}
	else if (arreyStrings.length > 4) {
	String rua = arreyStrings[0] + " "+arreyStrings[1]+
	" "+ arreyStrings[2];
	String numero = arreyStrings[3] + " " +arreyStrings[4];
	ArrayList<String> lista = new ArrayList<String>();
	lista.add(rua);
	lista.add(numero);
	System.out.println(lista.toString());
	}}
	public void mostar (String endereco) {
	
		String[] enderecoArray = endereco.split(" ");
	this.arreyStrings = enderecoArray;
	
	if (arreyStrings.length <= 2) {
	System.out.println(Arrays.toString(arreyStrings));
	}else if (arreyStrings.length >= 2 && arreyStrings.length < 4) {
	String rua = arreyStrings[0]+" "+arreyStrings[1];
	String numero = arreyStrings[2];
	ArrayList<String> lista = new ArrayList<String>();
	lista.add(rua);
	lista.add(numero);
	System.out.println(lista.toString());
	//----------------------------------------------------
	}else if (arreyStrings.length > 3 &&
	arreyStrings.length <= 4 ) {
	String rua = arreyStrings[0]+ " "+arreyStrings[1]+
	" "+arreyStrings[2];
	String numero = arreyStrings[3];
	ArrayList<String> lista = new ArrayList<String>();
	lista.add(rua);
	lista.add(numero);
	System.out.println(lista.toString());
	//-------------------------------------------------------
	}else if (arreyStrings.length > 4) {
	String rua = arreyStrings[0] + " "+arreyStrings[1]+
	" "+ arreyStrings[2];
	String numero = arreyStrings[3] + " " +arreyStrings[4];
	ArrayList<String> lista = new ArrayList<String>();
	lista.add(rua);
	lista.add(numero);
	System.out.println(lista.toString());
	//=======================  BONUS  =======================================
	
	
	
	
	
	
	
	
	} 
	}
}
