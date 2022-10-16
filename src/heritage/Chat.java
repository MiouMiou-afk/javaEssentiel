package heritage;

public class Chat extends Animal {

	private String couleur;

	public Chat(String nom, int taille, int poids, int age, String couleur) {
		super(nom, taille, poids, age);
		// TODO Auto-generated constructor stub
		this.couleur =couleur;
	}
	
	
	//Ovverride: redefinir dans une classe fille le cors d'une methodes présente dans sa classe mère
	@Override
	public void manger() {
		System.out.println("Le chat mange ");
		
	}
	
	//surcharge de la methode créer dans la class animal
	
	public void manger(int nbr) {
		System.out.println("Le chat mange " + nbr + " de repas par jours.");
		
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	
	
	

}
