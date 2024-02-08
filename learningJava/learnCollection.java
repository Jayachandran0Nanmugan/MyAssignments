package learningJava;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class learnCollection {

	public static void main(String[] args) {
		
		// Declare a String array and add the Strings values as (HCL, Wipro,  Aspire Systems, CTS)		

		List<String> obj = new ArrayList<String>();

obj.add("HCL");
obj.add("Wipro");
obj.add("Aspire Systems");
obj.add("CTS");

		// get the length of the array		
//for (int i = 0; i < obj.size(); i++) {
	//obj.add(obj[i]);
	
//}
		// sort the array	
  Collections.sort(obj);

		// Iterate it in the reverse order
 Collections.reverse(obj);
		// print the array

System.out.println(obj);	
		// Required Output: Wipro, HCL , CTS, Aspire Systems

		

	}

}
