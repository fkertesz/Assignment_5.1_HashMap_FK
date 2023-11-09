/**
 * HashDictionary class for creating a dictionary with hashing for archaic words
 * @author Fanni Kertesz
 * @version 11/9/23
 */

import java.util.*;
import java.io.*;
public class HashDictionary
{
	private HashMap<String, String> hashmap;//hashmap to contain keys and values
	
	/**
	 * empty-argument constructor
	 */
	public HashDictionary()
	{
		hashmap = new HashMap<String, String>();
	}//end constructor
	
	/**
	 * method for filling up the hashmap with the contents of a file
	 * @param fileString - name of the file or path
	 * @throws IOException - if error occurs with file
	 */
	public void fill(String fileString) throws IOException
	{
		//makes file scannable
		File file = new File(fileString);
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		Scanner scan = new Scanner(br);
		
		//scans each line
		while(scan.hasNext())
		{
			String line = scan.nextLine();
			String[] parts = line.split("\t");
			hashmap.put(parts[0],parts[1]);
		}//end while
		
		scan.close();
	}//end fill
	
	/**
	 * getter for key, value, and hashcode for a key
	 * @param key of desired pair and hashcode
	 * @return key, value, and hashcode
	 */
	public String get(String k)
	{
		String key = k;
		String value = hashmap.get(key);
		int hashkey = key.hashCode();
		String kvh = "word: " + key + "\ndefinition: " + value + "\nhashkey: " + hashkey;
		return kvh;
	}//end get
	
	/**
	 * @return hashmap as string
	 */
	public String toString()
	{
		return hashmap.toString();
	}//end toString
	
}//end class
