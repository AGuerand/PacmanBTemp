package data;

import model.Perso;

public class Data {

	char [][] map;
	Perso p;
	
	public Data() {
		 map = new char[20][20];
		 p = new Perso('@', 9, 9);
	}

	public char[][] getMap() {
		return map;
	}

	public void setMap(char[][] map) {
		this.map = map;
	}

	public Perso getP() {
		return p;
	}

	public void setP(Perso p) {
		this.p = p;
	}
	
	
}
