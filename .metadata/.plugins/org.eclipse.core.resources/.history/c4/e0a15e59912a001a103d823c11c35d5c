package br.com.alura.validador;

import br.com.caelum.stella.validation.CPFValidator;
import br.com.caelum.stella.validation.InvalidStateException;

public class ValidacaoDocumento {
	
	public static void main(String[] args) {
		
		String cpf = "36039936841";
		
		CPFValidator validator = new CPFValidator();
		
		try{
			validator.assertValid(cpf);

			System.out.println("CPF Valído!");
		}catch (InvalidStateException e) {
			e.printStackTrace();
			
			System.out.println("CPF Inválido!");
		}
	}
}
