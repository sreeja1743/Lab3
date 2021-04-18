package Lab3;

import java.util.Scanner;

public class ExerciseC {
  public static void main(String[] args) {
	ExerciseC e = new ExerciseC();
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the string");
	System.out.println("Altered string is :"+e.alterString(sc.next()));
}
  public StringBuffer alterString(String str) {
	  String str1 = str.toLowerCase();
	  StringBuffer s = new StringBuffer(str1);
	  int index = 0;
	  for(int i = 0; i < s.length(); i++) {
		  char p;
		  if(str1.charAt(i) != 'a' && s.charAt(i) != 'e' && s.charAt(i) != 'i' && s.charAt(i) != 'o' && s.charAt(i) != 'u') {
		    p = (char)(s.charAt(i)+1);
		    
		  }
		  else
			  p = s.charAt(i);
			  
		   s.setCharAt(index++, p);
	  }
	 
	  return s;
  }
}
