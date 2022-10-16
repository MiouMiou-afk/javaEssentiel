package maquillage;

public class FondDeTeint extends Maquillage {
	
	String matiere;

	public FondDeTeint(String type, String couleur, String matiere) {
		super(type, couleur);
		// TODO Auto-generated constructor stub
		this.matiere =matiere;
	}
	
	public String toString() {
		// TODO Auto-generated method stub
		return "Je suis une "+type+" de couleur "+couleur+ ", je suis "+matiere;
	}

}
