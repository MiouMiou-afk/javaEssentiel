package model;

public class Voiture {
	private String marque;
	private String couleur;
	private int nombrePlaces;
	//une seule copie partagées par toutes les instances de la classe
	public static int compteur;
	



	public Voiture(String marque, String couleur, int nombrePlaces) {
		this.marque = marque;
		this.couleur = couleur;
		this.nombrePlaces = nombrePlaces;
		compteur++;
	}
	
	public String toString() {
		   return "J'ai une " + this.marque +
			  
			  ", de couleur " + this.couleur + " . Elle possède " +this.nombrePlaces+ " places.";
		}
	

	
	public void demarrer() {
		System.out.println("demarrage de la voiture");
	}
	public void arreter() {
		System.out.println("arret de la voiture");
	}
	public void accelerer() {
		System.out.println("Accéleration de la voiture");
	}
	 
	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public int getNombrePlaces() {
		return nombrePlaces;
	}

	public void setNombrePlaces(int nombrePlaces) {
		this.nombrePlaces = nombrePlaces;
	}
	
	public static int getCompteur() {
		return compteur;
	}

}
