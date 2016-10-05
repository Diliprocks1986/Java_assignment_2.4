// Program to find the highest among the given 3 numbers

import java.util.Scanner;
 
class HighestNum {
	
   public static void main(String[] args){
	   // Three variable Assigned
      int a, b, c;
      System.out.println("Enter any three Numbers ");
	  // Scanner object for input integers
      Scanner in = new Scanner(System.in);
      // Saving integers value in variable
      a = in.nextInt();
      b = in.nextInt();
      c = in.nextInt();
      // Conditions for checkin which one is the Highest Number and Printing the same
      if ( a > b && a > c )
         System.out.println(a+" is the largest number.");
      else if ( b > a && b > c )
         System.out.println(b+" is the largest number.");
      else if ( c > a && c > b )
         System.out.println(c+" is the largest number.");
      else   
         System.out.println("All Numbers Are Same");
   }
}