package br.com.core;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;



public class PrintHelper {
	
	private static  String HEADER = "Posicão\tCódigo Piloto\tNome Piloto\tQtde Voltas Completadas\tTempo Total de Prova ";
	
	public static void printMap(List<Map.Entry<Integer, Piloto>> list) {
		int i = 1;
		System.out.println(HEADER);
		for(Entry<Integer, Piloto> element : list){
			Piloto value = element.getValue();
			System.out.print(i);	
			System.out.println(value.toString());
			i++;
		}
	}

}
