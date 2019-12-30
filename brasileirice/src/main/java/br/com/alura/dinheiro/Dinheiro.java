package br.com.alura.dinheiro;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.money.MonetaryAmount;

import org.javamoney.moneta.Money;

public class Dinheiro {

	public static void main(String[] args) {
		
		/*
		 * Criando a moeda
		 * @Monetary.getCurrency
		 * 
		 * Criando valor
		 * @MonetaryAmount
		 * 
		 * Para trabalhar com diferentes tipos de moedas � necess�rio criar duas instancias dos tipos diferentes.
		 */
		
		CurrencyUnit moeda = Monetary.getCurrency("BRL");		
		MonetaryAmount valorParcela = Money.of(75, moeda);
		
		System.out.println(valorParcela);
		
	}
}
