import java.util.ArrayList;
import java.util.Vector;

public class DemarrerCrypto {
	
	public static final int CAR = 1;
	public static final int NUM = 2;
	public static final int MIN = 1;
	public static final int MAX = 25;

	public static void main(String[] args) throws Exception {
		
		
		
				ExempleAlgo algo = new ExempleAlgo();
				
				String resultat = algo.encode("MONTEXTSECRET");
				
				System.out.println(resultat);
				
				resultat = algo.decode(resultat);
				
				System.out.println(resultat);
				
				Serveur message = new Serveur("Shakespeare.txt");
				
				//System.out.print (message.getMessage());
				
				ArrayList<String> textEncode = new ArrayList<String>();
				
				textEncode = message.obtenirFichierEncode(message.getMessage());
				
				message.afficherText(textEncode);
				
				
				
				
			}
		}


	


