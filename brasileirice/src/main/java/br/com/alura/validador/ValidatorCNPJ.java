package br.com.alura.validador;

import br.com.caelum.stella.format.CNPJFormatter;
import br.com.caelum.stella.validation.CNPJValidator;
import br.com.caelum.stella.validation.InvalidStateException;

public class ValidatorCNPJ {
	
	/*
	 * Valida CNPJ
	 * @InvalidStateException
	 */
	
	public static void main(String[] args) {
		
		String cnpj = "00428561000195";
		
		CNPJValidator validator = new CNPJValidator();
		
		CNPJFormatter cnpjFormatter = new CNPJFormatter();
		String cnpjFormatador = cnpjFormatter.format(cnpj);
		
		try {
			validator.assertValid(cnpj);
			
			System.out.println("CNPJ V�lido! " + cnpjFormatador);
		}catch (InvalidStateException e) {
			e.printStackTrace();
			
			System.out.println("CNPJ Inv�lido! " + cnpjFormatador);
		}
	}
}
