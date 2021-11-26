package model;

public class Perso {

	char nom;
	int x, y;
	
	public Perso(char nom, int x, int y) {
		this.nom = nom;
		this.x = x;
		this.y = y;
	}
	public char getNom() {
		return nom;
	}
	public void setNom(char nom) {
		this.nom = nom;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
	
}
