package learningJava;


import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
	String name = "google";
	char[] charArray = name.toCharArray();
	
	Set<Character> name1 = new LinkedHashSet<Character>();
	List<Character> name2 = new ArrayList<Character>();
	
	for (int i = 0; i < charArray.length; i++)
	{
		name1.add(charArray[i]);
		//char dup = charArray[i];
		
				System.out.println(name1);
	}
	
	}
}
