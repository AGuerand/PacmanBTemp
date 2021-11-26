package main;

import data.Data;
import model.Perso;
import utilitaires.Utilitaires;

public class Game {

	Data d;
	
	public Game() {
		d = new Data();
	}
	
	public void game() {
		Utilitaires.fillMap(d.getMap());
		printPersoOnMap();
		do {
			Utilitaires.readMap(d.getMap());
			handleMovePerso();
			printPersoOnMap();
		}
		while(true);
		
	}

	private void printPersoOnMap() {
		d.getMap()[d.getP().getX()][d.getP().getY()]= d.getP().getNom();
	}
	
	private void handleMovePerso() {
		d.getMap()[d.getP().getX()][d.getP().getY()] = ' ';
		switch(Utilitaires.saisieString()) {
		case "z" : d.getP().setY(d.getP().getY()-1);
			break;
		case "s" : d.getP().setY(d.getP().getY()+1);
			break;
		case "q" : d.getP().setX(d.getP().getX()-1);
			break;
		case "d" : d.getP().setX(d.getP().getX()+1);
			break;
		default : System.out.println("Erreur saisie");
			break;
		}
	}
}
