package heritage;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Animal animal = new Animal("Miette", 25, 4, 3);
//		animal.manger();
//		animal.seDeplacer();
//		System.out.println(animal.getNom());
//		System.out.println(animal.toString());

		// Chat hérite des méthodes géneriques de Animal
		Chat chat = new Chat("gigi", 20, 3, 1, "noire");
		chat.manger();
		// fait appel a la methode surchargée dans la classe fille (redefiniton de la
		// methiode avec de nouveu arg etc etc)
		chat.manger(6);
		chat.seDeplacer();
		System.out.println(chat.getNom());
		System.out.println(chat.toString() + "je suis de couleurs " + chat.getCouleur() + " !");

		// *Le principe du polymorphisme, un objet peut etre l'instance de toutes ses
		// classes differentes
		Animal animal = new Chat("miette", 25, 4, 3, "rousse");
		animal.manger();
		System.out.println(animal.toString() + "je suis de couleurs ");
		// ici je ne peux pas appeler la methodes manger surchargée de chat

		animal = new Chien("foufuyé", 0, 0, 0);
		animal.manger();

		// peut pas inbstancier direct une classe abstreaite
//		animal = new Animal("ecucucuc", 0, 0, 0);
//		animal.manger();
		
		
		Animal animal2 = new Herbivore("mini", 1, 5, 65);
		animal2.manger();
		animal2.seDeplacer();
		
		
		

	}

}
