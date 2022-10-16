package heritage;

public  class Animal {
	private String nom;
	private int taille;
	private int poids;
	private int age;
	
	
	public Animal(String nom, int taille, int poids, int age) {
		super();
		this.nom = nom;
		this.taille = taille;
		this.poids = poids;
		this.age = age;
	}
	//toute les classes herite de la classe object et peut hériter de toSting() qui est une methode de la classe Object
	public String toString() {
		   return "Je suis " + this.nom +
			  
			  ", je mesure " + this.taille + "cm et pèse " +this.poids+ " kilo. J'ai "+this.age+" ans.";
		}

	public void seDeplacer() {
		System.out.println("L'animal se déplace ");
		
	}
	
	public void manger() {
	}

	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public int getTaille() {
		return taille;
	}


	public void setTaille(int taille) {
		this.taille = taille;
	}


	public int getPoids() {
		return poids;
	}


	public void setPoids(int poids) {
		this.poids = poids;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}

	

}
