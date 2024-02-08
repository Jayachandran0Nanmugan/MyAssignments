package learningJava;


import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicate2 {

	public static void main(String[] args) {
        String input = "programming";
       
		
		 char[] characters = input.toCharArray();
		        int length = characters.length;
        //Set<Character> input1 = new LinkedHasSet<Character>
		         System.out.print("Duplicate Characters using Two Loops: ");
		        for (int i = 0; i < length; i++) {
		            for (int j = i + 1; j < length; j++) {
		                if (characters[i] == characters[j]) {
		                    System.out.print(characters[i] + " ");
		                    break;
		                }
		            }
		        }
		    }

		  	}