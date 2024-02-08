package learningJava;

public class RevString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "madam";
		String text1 = "";
		
		char[] charArray = text.toCharArray();
		
				{
			
			for (int i = charArray.length-1;i>=0; i--) {
				
				//System.out.println(charArray[i]);
				
				text1 = text1+charArray[i];
			}
				if(text.equals(text1)) 
						{
					System.out.println("Palindrome");
				}
				else
				{
					System.out.println("no");
				}
			}
	}}


