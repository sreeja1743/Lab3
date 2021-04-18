package Lab3;

import java.util.Scanner;

public class ExerciseE {
  public static void main(String[] args) {
	ExerciseE e = new ExerciseE();
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the sentence");
	//sc.nextLine();
	String s = sc.nextLine();
	System.out.println("No of words:"+e.noOfWords(s));
	System.out.println("No of Lines:"+e.noOfLines(s));
	System.out.println("No of characters:"+e.noOfChar(s));
	
	
}
  public int noOfWords(String s) {
	  int words;
	  String str[] = s.split(" ");
	  words = str.length;
	  return words;
  }
  
 public int noOfLines(String s) {
	  int lines;
	  String str[] = s.split("[.]");
	  lines = str.length;
	  return lines;
  }
 public int noOfChar(String s) {
	  	 int chars = s.length();
	  return chars;
 }
}
