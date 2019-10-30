import java.util.ArrayList;
import java.util.Vector;


public abstract class DecaleADroite implements Crypto {
	
	int  cle;
	
	/*****************************************************
     * Nom de Fonction: 
     * 
     * Type: 
     * 
     * Description:  
     * 
     * Input: 
     *
     * Return: 
     *
     * auteur : 
     ***************************************************/
	
	
	
	public static ArrayList<String> decaleADroite(ArrayList<String> texte, int cle){
			
			//substituLettre(cle,texte);
			//texteEncode = substituLettre(cle,texte);
			
			
			ArrayList<String> texteEncode = new ArrayList<String>();
			
			
			
			//initialise des variables locales
			
			//Vector <Character> txtArray = new Vector<Character>() ;
			
			char[] tmpLigne = new char [0];
			
			for(int i = 0; i < texte.size(); i++) {
				
				//initialize la taille de la variable a la taille de la ligne a decoder
				
				tmpLigne = new char [texte.get(i).length()];
				
				tmpLigne = texte.get(i).toCharArray();
				
				for(int j = 0; j< tmpLigne.length; j++) {
	
					tmpLigne[j] = substituLettre(tmpLigne[j], cle);
					
					
				}
				
				//convertire la variable tmpLigne en string et l'ajouter dans la variable texteEncode
				// de type ArrayList<String>
				
				//System.out.println(cle);
				//System.out.println(tmpLigne);
				texteEncode.add(new String(tmpLigne)); 
				
				//imprimerLigneDecoder(texteEncode);
				
			}
			
			// retourner le texte encode		
			
			//System.out.println(cle);
			//System.out.println(texteEncode.get(0));
			
			return texteEncode;
			
		}
	
	
	public String decode(String message){
		
		
		return message;
	}
	
	/*
	public String encode(String message) {
		
		String LigneEncode = new 
		
		
		String	LigneEncode =  new String(tmpLigne);
		
		return message;
		
	}
	*/
	
	/*****************************************************
     * Nom de Fonction: 
     * 
     * Type: 
     * 
     * Description:  
     * 
     * Input: 
     *
     * Return: 
     *
     * auteur : 
     ***************************************************/
	
	
	
	
	public static char substituLettre(char lettre, int num){
			
			int index = localiserIndexAlphabet(lettre);
			
			int indexSubstitu = 0;
			
			int limitAlphabet = Cle.alphabet.length - 1;
						
						if( (index + num) >= limitAlphabet) {
							
							indexSubstitu = (num - (25 - index))  ;
								
							lettre = Cle.alphabet[indexSubstitu];
							
							//System.out.println("test3" + letter);
						}
						
						else {
							
							indexSubstitu = index + num;
							
							lettre = Cle.alphabet[indexSubstitu];
							
							//System.out.println("test4" + letter);
						}
					
					return lettre;
				
			
		}
	
	
	
	
	
	public static int localiserIndexAlphabet(char lettre) {
		
		//initialise mes variable
		
		int index = 0;
		
		//parcourir le Array de l'alphabet
		
		for(int i = 0; i < Cle.alphabet.length; i++ ) {
			
			//si lettre trouver, retourner son index
			
			if(Character.toUpperCase(lettre) == Cle.alphabet[i] ) {
				
				index = i;
			}
			
		}
		
		// retourner l'index de l'alphabet
		
		return index;
		
	}
		
	

}
