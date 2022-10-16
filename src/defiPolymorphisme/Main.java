package defiPolymorphisme;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cercle cercle = new Cercle(4);
		cercle.calculerSurface();
		System.out.println(cercle.calculerSurface());

		Forme rect = new Rectangle(6, 8);
		rect.calculerSurface();
		System.out.println(rect.calculerSurface());

	}

}
