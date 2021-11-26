package utilitaires;

import java.util.Scanner;

public class Utilitaires {

	public static void fillMap(char[][] map) {
		for(int i = 0; i<map.length; i++) {
			for(int j = 0; j<map[i].length; j++) {
				map[i][j]='.';
				map[i][0]='0';
				map[0][i]='0';
				map[j][map.length-1]='0';
				map[map.length-1][j]='0';
			}
		}
	}
	
	public static void readMap(char[][] map) {
		for(int i = 0; i<map.length; i++) {
			for(int j = 0; j<map[i].length; j++) {
				System.out.print(map[j][i]+"  ");
			}
			System.out.println();
		}
	}
	
	public static String saisieString() {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		return s;
	}
}
