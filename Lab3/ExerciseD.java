package Lab3;

import java.util.Scanner;

public class ExerciseD {
   public static void main(String[] args) {
	ExerciseD e = new ExerciseD();
	@SuppressWarnings("resource")
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the number:");
	System.out.println("New number is:"+e.modifyNumber(s.nextInt()));
	
}
   public int modifyNumber(int n) {
	   int number2, temp, p, i = 0;
	   p = n%10;
	   number2 = p;
	   n/= 10;
	   while(n!= 0) {
		   i++;
		   temp = n%10;
		   p = Math.abs(p-temp);
		   number2 += Math.pow(10,i)*p;
		   p = temp;
		   n/= 10;
	   }
	   return number2;
   }
}
