package br.com.alura.cep;

import java.io.IOException;

import com.github.gilbertotorrezan.viacep.se.ViaCEPClient;
import com.github.gilbertotorrezan.viacep.shared.ViaCEPEndereco;

public class CEP {
	
	/*
	 * Usar Client de CEP
	 * 
	 * @cep				@localidade
	 * @logradouro		@uf
	 * @complemento		@ibge
	 */
	public static void main(String[] args) {
		
		ViaCEPClient client = new ViaCEPClient();
		
		try {
			ViaCEPEndereco endereco = client.getEndereco("08190420");
			
			System.out.println(endereco.getBairro());
			System.out.println(endereco.getLocalidade());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
