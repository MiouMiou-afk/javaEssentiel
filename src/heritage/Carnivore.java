package heritage;

public abstract class Carnivore extends Animal {

	public Carnivore(String nom, int taille, int poids, int age) {
		super(nom, taille, poids, age);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void manger() {
		System.out.println("L'herbivore ne mange pas de viande  ");
		
	}

}
