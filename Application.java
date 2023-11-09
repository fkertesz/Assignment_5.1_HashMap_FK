import java.io.IOException;
/**
 * Application class for creating a HashDictionary object
 * for hashing the archaic words and testing methods
 * @author Fanni Kertesz
 * @version 11/9/23
 */
public class Application
{
	public static void main(String[] args) throws IOException
	{
		//new HashDictionary created
		HashDictionary archaicWords = new HashDictionary();
		
		//fill up hashmap with the words and meanings through a file
		archaicWords.fill("keysAndValues.txt");
		
		//print hashmap
		System.out.println("The archaic words dictionary:\n" + archaicWords.toString() + "\n");
		
		//print 5 keys, values, hashcodes
		System.out.println(archaicWords.get("shrift") + "\n");
		
		System.out.println(archaicWords.get("sea coal") + "\n");
		
		System.out.println(archaicWords.get("repulsive") + "\n");
		
		System.out.println(archaicWords.get("virtue") + "\n");
		
		System.out.println(archaicWords.get("meat"));
	}//end main
}//end class
