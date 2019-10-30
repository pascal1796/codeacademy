import java.util.*;


public class Cle{

	
	public static char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
	 int cleNum;
	 char [] cleChar; 
	
	/* méthode qui génère aléatoirement une clé de taille nbCars en utilisant
	 *  l’alphabet*/
	 
	
	public Cle (int choix, int number ) throws Exception {
		
		if (choix == DemarrerCrypto.CAR) {
			
			 cleChar = obtenirCleCar(number);
		}
		else if (choix == DemarrerCrypto.NUM) {
			
			cleNum = obtenirCleNum(number);
			
		}
		else {
			
			throw new Exception(" Variable choix na pas un valeur valide!");
			
		}
		
	}
	
	
	private static char[] obtenirCleCar(int nbCars) {
		
		char [] value =  new char [nbCars];
		
		for(int i = 0; i< nbCars; i++) {
			
			value[i] = alphabet[genererNombreAleatoire(DemarrerCrypto.MAX)];
		}
		
		return value;
	} 
	
	/*Une méthode qui génère une clé numérique qui est au maximum max.*/
	 
	
	/*
	public int getCleNum() {
		
		return cleNum;
	}
	*/
	
	
	/*
	public char[] getCleChar() {
			
			return cleChar;
		}
	
	*/
	
	
	private static int obtenirCleNum(int max) {
		 
		int cle = genererNombreAleatoire(max);
		 
		return cle;
	}
	
	public static int genererNombreAleatoire(int max){
		
		Random rand = new Random();
		
		return rand.nextInt((max - DemarrerCrypto.MIN) + 1) + DemarrerCrypto.MIN;
		
	}
	
}
