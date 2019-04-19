package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Aabriel");
		list.add("Jrandao");
		list.add("Junior");
		list.add("Aeylla");
		list.add(1, "Rute");
		System.out.println(list.size());
		
		list.removeIf(x -> x.charAt(0) == 'J');
		
		for (String e : list) {
			System.out.println(e);
		}
		
		System.out.println("Index of Aeylla: " + list.indexOf("Aeylla"));
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		System.out.println(result);
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
	}

}
