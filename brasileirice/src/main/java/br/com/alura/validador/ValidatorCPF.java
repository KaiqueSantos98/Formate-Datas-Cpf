package br.com.alura.validador;

import br.com.caelum.stella.format.CPFFormatter;
import br.com.caelum.stella.validation.CPFValidator;
import br.com.caelum.stella.validation.InvalidStateException;

public class ValidatorCPF {
	
	/*
	 * Valida CPF
	 * @InvalidStateException
	 */
	
	public static void main(String[] args) {
		
		String cpf = "36039936841";
		
		CPFValidator validator = new CPFValidator();
		
		CPFFormatter cpfFormatter = new CPFFormatter();
		String cpfFormatador = cpfFormatter.format(cpf);
		
		try{
			validator.assertValid(cpf);

			System.out.println("CPF Val�do! " + cpfFormatador);
		}catch (InvalidStateException e) {
			e.printStackTrace();
			
			System.out.println("CPF Inv�lido! " + cpfFormatador);
		}
	}
}
