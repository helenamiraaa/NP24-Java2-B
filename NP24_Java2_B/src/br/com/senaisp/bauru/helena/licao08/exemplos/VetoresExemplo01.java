package br.com.senaisp.bauru.helena.licao08.exemplos;

public class VetoresExemplo01 {

	public static void main(String[] args) {
		//Criando um vetor de 50 posições inteiras
		int[] idades = new int [50];
		//Criando de forma estática vetores
		String [] cores = {"Azul","Amarelo","Vermelho","Verde"};
		//Essa linha representa o mesmo que a anterior
		cores[2] = "Laranja";
		String[ ]cor_n = new String [4];
		cor_n[0]="Azul";
		cor_n[1]="Amarelo";
		cor_n[2]="Vermelho";
		cor_n[3]="Verde";
		//cor_n [4]="Roxo";//ArrayIndexOutOfBounds
		//Utilizando o for in
		for(String item : cores) {
			System.out.println(item);
		}
				
		
	}

}
