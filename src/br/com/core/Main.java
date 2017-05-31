package br.com.core;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe o caminho do arquivo de log :");
		String path  = ler.nextLine();
		processFile(path);
	}
	private static void processFile(String path)  {
		FileHelperEngine engine = new FileHelperEngine();
		Map<Integer,Piloto> pilotos = engine.readResource(path);
		imprimeDados(pilotos);
	}

	public static void imprimeDados(Map<Integer, Piloto> map) {
		List<Map.Entry<Integer, Piloto>> list = SortedMap.sortMap(map);
		PrintHelper.printMap(list);
	}

	

	

}
