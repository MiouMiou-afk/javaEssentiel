package defiPolymorphisme;

public class Rectangle extends Forme {
	private long longueur;
	private long largeur;
	
	
	public Rectangle(long longueur,long largeur ) {
		super();
		// TODO Auto-generated constructor stub
		this.longueur =longueur;
		this.largeur = largeur;
		
	}
	
	@Override
	public  double calculerSurface() {
		
		return longueur* largeur;
	}

}
