package br.com.senaisp.bauru.helena.secao05;

import javax.swing.JOptionPane;

public class JavaLibsPractice {

    public static void main(String[] args) {
        // TODO code application logic here
    	boolean resp = JOptionPane.showConfirmDialog(null,"Você quer participar do quetionário?", "Questionário",JOptionPane.YES_NO_OPTION,
    			JOptionPane.QUESTION_MESSAGE)
    		== JOptionPane.YES_OPTION;
    	
    	
    	String nome = (String) JOptionPane.showInputDialog(null, "Informe seu nome: ","NOME", 
    			JOptionPane.INFORMATION_MESSAGE,null, null, "Está é uma pergunta.");
    	
    	int idade = Integer.parseInt((String) JOptionPane.showInputDialog(null, "Informe sua idade: ","IDADE", 
    			JOptionPane.INFORMATION_MESSAGE,null, null, "Está é uma pergunta."));
    	
    	String escolaridade = (String) JOptionPane.showInputDialog(null, "Informe sua escolaridade : ","ESCOLARIDADE", 
    			JOptionPane.INFORMATION_MESSAGE,null, null, "Digite algo aqui.");
    
    	int trabalho = Integer.parseInt ((String) JOptionPane.showInputDialog(null, "Informe a quanto tempo você está na empresa? : ","EMPRESA", 
    		JOptionPane.INFORMATION_MESSAGE,null, null, "Digite algo aqui."));
    	
    	double salário = Double.parseDouble((String)JOptionPane.showInputDialog(null, "Qual é salário bruto hoje?: ","SALÁRIO", 
                JOptionPane.INFORMATION_MESSAGE,null, null, "Digite algo aqui."));
    	String xDissidio = (String)JOptionPane.showInputDialog(null,
				"Qual foi o percentual do seu dissídio esse ano?",
				"QUESTIONÁRIO",
				JOptionPane.QUESTION_MESSAGE,
				null,
				null,
				"Digite o valor percentual aqui.");	
    	int horario = Integer.parseInt((String) JOptionPane.showInputDialog(null, "Qual a sua carga horária diária?" , "Está é uma pergunta",
    			JOptionPane.INFORMATION_MESSAGE,null, null, "Digite algo aqui."));
    	
    			boolean RESP = JOptionPane.showConfirmDialog(null, "Você está satisfeito(a) com a carga horária?", "CARGA HORÁRIA",
    	    			JOptionPane.YES_NO_OPTION,
    	    			JOptionPane.QUESTION_MESSAGE)
    	    			== JOptionPane.YES_OPTION;
    			boolean cargo = JOptionPane.showConfirmDialog(null, "Você está satisfeito(a) com o cargo?", "cargo",
    	    			JOptionPane.YES_NO_OPTION,
    	    			JOptionPane.QUESTION_MESSAGE)
    	    			== JOptionPane.YES_OPTION;
    			
    	
    	
    			
    
      
        
        
     
    }   
}