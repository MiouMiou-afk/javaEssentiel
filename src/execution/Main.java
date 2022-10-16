package execution;

import model.Voiture;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Voiture v = new Voiture("BMW", "Noire", 5);
		// comme la variable est static je peux y acceder directement par la class car
		// communes a tous les objets de la methode
		System.out.println(Voiture.compteur);

		System.out.println(v.toString());
		v.demarrer();
		Voiture v1 = new Voiture("BMW", "Noire", 5);
		System.out.println(Voiture.getCompteur());
		Voiture v2 = new Voiture("BMW", "Noire", 5);
		System.out.println(Voiture.compteur);

		Voiture v3 = new Voiture("lolo", "Nooire", 5);
		System.out.println(v3.getCompteur());

		System.out.println(v3.toString());
		System.out.println(v3.getMarque());

	}

}
