package heritage;

public class Herbivore extends Animal {

	public Herbivore(String nom, int taille, int poids, int age) {
		super(nom, taille, poids, age);
		// TODO Auto-generated constructor stub
	}
	
	//comme la classe herbivore n'est pas abstract je dois instancier les methodes abstraite de ma classe mere
	
	@Override
	public void manger() {
		System.out.println("L'herbivore ne mange pas de viande  ");
		
	}

}
