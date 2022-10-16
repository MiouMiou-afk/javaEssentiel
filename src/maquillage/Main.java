package maquillage;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Maquillage rougeMaquillage = new RougeLevre("Rouge à lèvre", "rouge", "mat");
		System.out.println(rougeMaquillage.toString());
		rougeMaquillage.setCouleur("noir");
		System.out.println(rougeMaquillage.toString());

		
		Maquillage poudreMaquillage = new FondDeTeint("poudre", "caramel", "mat");
		System.out.println(poudreMaquillage.toString());
		

	}

}
