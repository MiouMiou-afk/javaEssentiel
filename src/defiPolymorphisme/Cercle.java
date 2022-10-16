package defiPolymorphisme;

public class Cercle extends Forme {

	int rayon;

	public Cercle(int rayon) {
		super();
		this.rayon = rayon;
	}

	
	@Override
	public double calculerSurface() {
		return  rayon * 2 * 3.14;
	}
	
}
