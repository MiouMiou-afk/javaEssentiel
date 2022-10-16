package heritage;

public class Chien extends Animal {
	
	public Chien(String prenom, int Taille, int poids, int age) {
		super(prenom, Taille, poids, age);
	}
	
	@Override
	public void manger() {
		System.out.println("Le chien mange ");
		
	}


}
