package main;

import utilitaires.Utilitaires;

public class Game {

	char [][] map = new char[20][20];

	public Game() {
		
	}
	
	public void game() {
		Utilitaires.fillMap(map);
		Utilitaires.readMap(map);
	}
}
