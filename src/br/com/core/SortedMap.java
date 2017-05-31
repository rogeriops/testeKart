package br.com.core;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SortedMap  {
	

	public static List<Map.Entry<Integer, Piloto>> sortMap(final Map<Integer, Piloto> map) {
		List<Map.Entry<Integer, Piloto>> list =   new LinkedList<Map.Entry<Integer,Piloto>>(map.entrySet());
		
		Collections.sort(list, new Comparator<Map.Entry<Integer,Piloto>>() {
            public int compare(Map.Entry<Integer,Piloto> o1,  Map.Entry<Integer,Piloto> o2) {
            	Piloto piloto1 =o1.getValue();
            	Piloto piloto2 =o2.getValue();
            	
            	return (piloto1.getHorarioFinalização().compareTo(piloto2.getHorarioFinalização()));
            }
        });
		return list;
	}
}
