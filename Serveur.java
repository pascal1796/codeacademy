import java.util.*;
import java.io.*;
import java.lang.*;

public class Serveur {

	// declaration des membres de la class
	
	private ArrayList<String> texte = new ArrayList<String> ();
	
	private char cleCar;
	
	private int cleNum ;
	
	
	
	
	
	
	
	/*****************************************************
     * Nom de Methode: Serveur
     * 
     * Type: Constructeur
     * 
     * Description:  Serveur est le constructeur de la class
     * 				Constructeur qui separe le texte desirer
     * 				ligne par ligne et l'enregistreur dans un 
     * 				membre de type ArrayList<String>
     * 
     * Input: none
     *
     * Return: none
     *
     * auteur : Pascal Kameni
     ***************************************************/
	
	public Serveur(String texte) {
		
		try {
			File file = new File(texte);
			
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			String st;
			
			while ((st = br.readLine()) != null) {
				
				// ajouter chaque ligne du texte dans le membre "texte" de type  ArrayList<String> 
				
				this.texte.add(st);
			}
			
			br.close();
		
		}
		
		catch( IOException error) {
            
			// Alerter si il ny a aucun texte valide
			
			error.printStackTrace();
        }   
	}

	
	/*****************************************************
     * Nom de Fonction: obtenirFichierEncode
     * 
     * Type: ArrayList<String>
     * 
     * Description:  
     * 
     * Input: none
     *
     * Return: none
     *
     * auteur : Pascal Kameni
	 * @throws Exception 
     ***************************************************/
	
	public ArrayList<String> obtenirFichierEncode(ArrayList<String> texte) throws Exception {
		
		//creer une novelle variable de type ArrayList<String> qui va contenir le texte encoder
		
		ArrayList<String> texteEncode = new ArrayList<String>();
		
		//Generer une cle pour faire l'encodage
		
		cleNum = genererCleNum();
		
		//Appele la fonction pour encode le texte 
		
		texteEncode = DecaleADroite.decaleADroite(texte,cleNum);
		
		
		
		//retourner le texte encoder
		
		return texteEncode;
		
	}
	
	
	
	
	public void afficherText(ArrayList<String> text) {
		
		for(int i = 0; i < text.size(); i++ ) {
			
			System.out.print (text.get(i));
			System.out.println();
			}
		
		
	}
	
	
	
	public int genererCleNum() throws Exception {
		
		Cle cle = null;
		cle = new Cle (DemarrerCrypto.NUM, 4);
		
		return cle.cleNum;
		
	} 
	
	/*****************************************************
     * Nom de Fonction: getMessage()
     * 
     * Type: String
     * 
     * Description:  La methode retourne la ligne demander 
     * 					du texte
     * 
     * Input: int Line
     *
     * Return: texte.get(Line)
     *
     * auteur : Pascal Kameni
     ***************************************************/
	
	public ArrayList<String> getMessage(){
		
		//retouner le contenu du texte qui a eter encapsule
		
		return this.texte;
	}
	
	
	/*****************************************************
     * Nom de Fonction: setTexte
     * 
     * Type: Void
     * 
     * Description:  void
     * 
     * Input: none
     *
     * Return: none
     *
     * auteur : Pascal Kameni
     ***************************************************/

	public void setTexte(ArrayList<String> texte) {
		this.texte = texte;
	}

	/*****************************************************
     * Nom de Fonction: soumettrePhrase
     * 
     * Type: boolean
     * 
     * Description:  valide que la phrase est bien celle
     * 				 à l’indice dans l’ArrayList de phrases 
     * 				décodées.
     * 
     * Input: String phrase, int indice
     *
     * Return: match
     *
     * auteur : 
     ***************************************************/
	
	
	public boolean soumettrePhrase(String phrase, int indice) {
		
		boolean match = false;
		
		return match;

		
	}
	
	
	/*****************************************************
     * Nom de Fonction: soumettreCle
     * 
     * Type: boolean
     * 
     * Description:  valide que la clé soumise est celle 
     * 				utilisée par les algorithmes utilisant
     * 				 des clés alphabétiques.
     * 
     * Input: cle
     *
     * Return: match
     *
     * auteur : 
     ***************************************************/
	public boolean soumettreCle(String cle) {
		
		boolean match = false;
		
		
		return match;
		
	}
	
	
	/*****************************************************
     * Nom de Fonction: soumettreCle
     * 
     * Type: boolean
     * 
     * Description:  valide que la clé soumise est celle 
     * 				utilisée par les algorithmes utilisant
     * 				 des clés numériques.
     * 
     * Input: 
     *
     * Return: match
     *
     * auteur : 
     ***************************************************/
	
	
	public boolean soumettreCle(int cle) {
		
		boolean match = false;
		
		
		return match;

		
	}
	
	

	
	
	
	
	
	
	
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
	
	public ArrayList<String>  Encodedictionnaire(int cle, ArrayList<String> texte){
		
		ArrayList<String> texteEncode = new ArrayList<String> ();
		return texteEncode;
		
	}
	
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
	
	public ArrayList<String>  EncodeouLogic(int cle, ArrayList<String> texte){
		
		ArrayList<String> texteEncode = new ArrayList<String> ();
		return texteEncode;
		
	}
	
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
	
	public ArrayList<String>  EncodedecaleEnColonne(int cle, ArrayList<String> texte){
		
		ArrayList<String> texteEncode = new ArrayList<String> ();
		return texteEncode;
		
	}

	
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
