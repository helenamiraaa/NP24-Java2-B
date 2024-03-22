package br.com.senaisp.bauru.helena.exercicio;

import java.util.Random;

public class MetodosCalculo {
	/**
	 * Método que calcula a temperatura Celsius a partir de uma 
	 * temperatura em Fahrenheit.
	 * @param temp Informar a temperatura em ºF
	 * @return Retorna a temperatura em ºC
	 */
	public double converterF2c(double temp) {
		return (temp -32) * 5 / 9;
		
	}
	
	/**
	 * Método que calcula a Hipotenusa
	 * @param co Informa o cateto oposto
	 * @param ca Informa o cateto adjacente
	 * @return Retorna o valor da hipotenusa
	 */
	public double calcularHipotenusa(double co, double ca) {
		return Math.sqrt(Math.pow(co, 2) + Math.pow(ca, 2));
		
	}
	public int jogarDados() {
		Random rnd = new Random ();
		return rnd.nextInt(6)+1+rnd.nextInt(6)+1;
	}
}

