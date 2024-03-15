package br.com.senaisp.bauru.helena.secao03;

public class Chickens02 {
    public static void main(String[] args) {
        //Put yout code here
    	//−Na segunda-feira, o Fazendeiro Fred recolhe 100 ovos
    	//−Na terça-feira, ele recolhe 121 ovos
    	//−Na quarta-feira, ele recolhe 117 ovos
    	//−Qual é a dailyAverage (média diária) de ovos recolhidos?
    	//−Quantos ovos poderiam ser esperados em uma
    	//monthlyAverage (média mensal) de 30 dias?
    	//−Se um ovo pode ser vendido com um lucro de US$ 0,18, qual
    	//é o monthlyProfit (lucro mensal) total dos ovos?
    	//definindo as variaveis
    	int totalEggs = 0;
    	double dailyAverage=0,monthlyAverage=0,monthlyProfit=0;
    	//Na segunda-feira ele obtem 100 ovos
    	totalEggs += 100;
    	//Na terça-feira ele obtem 121 ovos
    	totalEggs += 121;
    	//Na quarta-feira ele obtém 117 ovos
    	totalEggs += 117;
    	//Fazendo as contas
    	dailyAverage = totalEggs / 3.0;
    	monthlyAverage = dailyAverage * 30;
    	monthlyProfit = monthlyAverage * 0.18;
        System.out.println("Daily Average:   " +dailyAverage);
        System.out.println("Monthly Average: " +monthlyAverage);
        System.out.println("Monthly Profit:  $" +monthlyProfit);
    }
    
}
