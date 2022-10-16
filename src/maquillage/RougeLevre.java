package maquillage;

public class RougeLevre extends Maquillage {
	String brillantOrMat;

	public RougeLevre(String type, String couleur, String brillantOrMat) {
		super(type, couleur);
		// TODO Auto-generated constructor stub
		this.brillantOrMat = brillantOrMat;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Je suis un "+type+" de couleur "+couleur+ ", je suis "+brillantOrMat;
	}


	public String getBrillantOrMat() {
		return brillantOrMat;
	}

	public void setBrillantOrMat(String brillantOrMat) {
		this.brillantOrMat = brillantOrMat;
	}

}
