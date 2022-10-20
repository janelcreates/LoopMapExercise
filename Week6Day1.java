import java.util.*;

public class Week6Day1 {
	
    public static void main (String[] args) {
        Scanner userInput = new Scanner(System.in);
        ArrayList<Integer> numArray = new ArrayList<Integer>(5);
  
        for (int i = 0; i < 5; i++) {
            System.out.printf("Give me number %d:\n", i + 1);
            numArray.add(Integer.parseInt(userInput.nextLine()));
            
        }
        
        int sum =0;
        for ( int userNum: numArray){
        sum += userNum;
        }
        
        int product=1;
        for (int userNum: numArray) {
        	product*= userNum;
        }
        
       int max = Collections.max(numArray);
       int min = Collections.min(numArray);
      
       
    
       
        System.out.println("The array is: " + numArray);
        System.out.println("The sum of the numbers are: " + sum);
        System.out.println("The product of the numbers are: " + product);
        System.out.println("Largest number: " + max);
        System.out.println("Smallest number: " + min);
         
    }
   
}
