package Lab3;

import java.util.Scanner;

public class ExerciseF {
	
  public static void main(String[] args) {
	ExerciseF e = new ExerciseF();
	@SuppressWarnings("resource")
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the word:");
	String str = s.next();
	if(e.isPositive(str))
	System.out.println("word is positive string");
	else
	System.out.println("word is not a positive string");
}
  
  public boolean isPositive(String s) {
	   s = s.toLowerCase();
	  for(int i = 0; i < s.length()-1; i++) {
		  if((int)(s.charAt(i)) > (int)(s.charAt(i+1))) 
			  return false;
			  
	  }
	  return true;
  }
}
