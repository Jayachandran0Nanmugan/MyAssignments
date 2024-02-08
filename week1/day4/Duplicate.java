package week1.day4;

public class Duplicate {
        
        public static void Main(String[] args)  
        {  
             
            int [] arr = {2, 5, 7, 7, 5, 9, 2, 3};   
              
           System.out.println("Duplicate elements in given array: ");  
            
            for(int i =0; i < arr.length-1; i++)
            {  
                for(int j = i + 1; j < arr.length; j++) 
                {  
                    if(arr[i] == arr[j])  
                    	System.out.println(arr[j]);  
                }  
            }  }
        }  