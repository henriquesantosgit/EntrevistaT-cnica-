package br.com.targetsitemas.model;

import java.util.Scanner;

public class VerificaA implements VerificarI {

	@Override
	public int verificar(String txt) {

		 txt = txt.toLowerCase();

	     
	     int cont = 0;

	    
	     for (int i = 0; i < txt.length(); i++) {
	         if (txt.charAt(i) == 'a') {
	             cont++;
	         }
	     }
	     return cont;
	}

	@Override
	public void exibir() {
		Scanner scan = new Scanner(System.in);
    	System.out.println("Digite uma palavra");
    	String txt = scan.nextLine();
    	
    	
    	System.out.println("A letra 'A' aparece "+verificar(txt)+" vezes");
    	
		
	}
	
	

    
}
