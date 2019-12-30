package br.com.alura.datas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Data {

	public static void main(String[] args) {
		
		/*
		 * Pega a data atual do Sistema
		 * @LocalDate
		 * 
		 * Formata a data
		 * @DateTimeFormatter
		 */
		
		LocalDate apenasData = LocalDate.now();
		DateTimeFormatter formatadorApenasData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(apenasData.format(formatadorApenasData));
		
		/*
		 * Formata a data e hora
		 * @DateTimeFormatter
		 */
		
		LocalDateTime dataHora = LocalDateTime.now();
		DateTimeFormatter formatadorDataHora = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
		System.out.println(dataHora.format(formatadorDataHora));

		/*
		 * Formata a data e hora
		 * @Locale
		 */
		
		DateTimeFormatter formatadorMedio = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).withLocale(new Locale("pt", "br"));
		System.out.println(dataHora.format(formatadorMedio));
		
		/*
		 * Trabalhando com datas
		 * 
		 * @minusHours - Subtrair horas
		 * @plusDays - Adição de horas
		 */
		
		System.out.println(dataHora.minusHours(5));
		System.out.println(dataHora.plusDays(5));
		
		
	}

}
