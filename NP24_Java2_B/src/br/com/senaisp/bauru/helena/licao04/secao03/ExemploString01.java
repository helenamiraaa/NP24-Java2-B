package br.com.senaisp.bauru.helena.licao04.secao03;

public class ExemploString01 {

	public static void main(String[] args) {
		String nome = "Richard";
		String nome2 = new String ("Richard");
		//Comparando endereço de memoria no caso de objetos (String é um objeto)
		if (nome == nome2) {
			System.out.println("São iguais");
		} else {
			System.out.println("São diferentes");
		}
		// Para comparar objetos, usamos equals para igualdade
		if (nome.equals(nome2)) {
			System.out.println( "Conteúdos iguais");
		} else {System.out.println("Conteúdos diferente");
		
		}
	}

}
