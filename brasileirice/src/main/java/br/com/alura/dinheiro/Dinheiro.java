package br.com.alura.dinheiro;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.money.MonetaryAmount;
import javax.money.MonetaryOperator;
import javax.money.NumberValue;

import org.javamoney.moneta.Money;
import org.javamoney.moneta.function.MonetaryOperators;

import br.com.caelum.stella.inwords.FormatoDeReal;
import br.com.caelum.stella.inwords.NumericToWordsConverter;

public class Dinheiro {

	public static void main(String[] args) {
		
		/*
		 * Criando a moeda
		 * @Monetary.getCurrency
		 * 
		 * Criando valor
		 * @MonetaryAmount
		 * 
x		 * Para trabalhar com diferentes tipos de moedas � necess�rio criar duas instancias dos tipos diferentes.
		 */
		
		CurrencyUnit moeda = Monetary.getCurrency("BRL");		
		MonetaryAmount valorParcela = Money.of(75, moeda);
		
		System.out.println(valorParcela);
		
		MonetaryAmount desconto = valorParcela.with(MonetaryOperators.percent(10));
		NumberValue descontoSemMoeda = desconto.getNumber();
		
		NumericToWordsConverter conversor = new NumericToWordsConverter(new FormatoDeReal());
		String valorPorExtenso = conversor.toWords(descontoSemMoeda.doubleValue());
		System.out.println(valorPorExtenso);
		
	}
}
