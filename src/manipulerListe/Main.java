package manipulerListe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import heritage.Animal;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> maListeList = new ArrayList<>();

		maListeList.add("Lundi");
		maListeList.add("Mardi");
		maListeList.add("Mercredi");

		for (String elString : maListeList) {
			System.out.println(elString);
		}

		for (int i = 0; i < maListeList.size(); i++) {
			System.out.println(maListeList.get(i));
		}

		maListeList.remove(1);
		System.err.println(maListeList);

		List<String> maliste2 = new LinkedList<>();
		maliste2.add("a");
		maliste2.add("b");
		maliste2.add("c");
		maliste2.add("d");
		maliste2.add("e");
		for (int i = 0; i < maliste2.size(); i++) {
			System.out.println(maliste2.get(i));
		}

		// SET collection interface

		Set<Animal> maSet = new HashSet<>();
		Animal a1 = new Animal("GIGI", 4, 8, 4);
		System.out.println(maSet.add(a1));
		System.out.println(maSet.add(a1));
		System.out.println(maSet.add(new Animal("Miette", 18, 3, 1)));
		System.out.println(maSet.size());
		System.out.println(maSet.toString());
		
		//MAP
		
		Map<String, Animal> maMap = new HashMap<>();
		maMap.put("Miette", new Animal("Miette", 25, 4, 3));
		maMap.put("Gigi", a1);
 
		
		Set<String> cles = maMap.keySet(); 
		for(String cleString : cles) {
		var item =maMap.get(cleString);
		System.out.println(item);
		
		Map<String, String> m = new HashMap<String, String>();
		m.put("1", "hiver"); 
		m.put("2", "printemps");
		m.put("3", "ete");
		m.put("1", "automne");
		System.out.println(m.size());
		
		List<String> mois = new ArrayList<String>(12) ; mois.add( "Janvier" ); mois.add( "Fevrier" ); mois.add( "Mars" ); System.out.println(mois.size());
			
		

		

	}

}}
