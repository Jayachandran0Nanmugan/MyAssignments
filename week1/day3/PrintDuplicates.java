package week1.day3;

public class PrintDuplicates
{
        
        public static void Main(String[] args)  
        {  
             
            int [] arr = new int [] {2, 5, 7, 7, 5, 9, 2, 3};   
              
           System.out.println("Duplicate elements in given array: ");  
            
            for(int i =0; i < arr.length; i++)
            {  
                for(int j = i + 1; j < arr.length; j++) 
                {  
                    if(arr[i] == arr[j])  
                    	System.out.println(arr[j]);  
                }  
            }  }
        }  
    