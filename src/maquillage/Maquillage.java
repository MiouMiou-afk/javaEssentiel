package maquillage;

public  class Maquillage {
	
	protected String type;
	protected String couleur;
	
	public Maquillage(String type, String couleur) {
		this.type = type;
		this.couleur = couleur;
	}
	
	
	public String toString() {
		// TODO Auto-generated method stub
		return "Je suis un "+type+" de couleur "+couleur;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	

}
