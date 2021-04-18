package Lab3;
import java.util.*;

public class MainExercise {
	
	 public static void main(String[] args) {
			@SuppressWarnings("resource")
			Scanner s = new Scanner(System.in);
			while(true) {
				System.out.println("choose the option:");
				System.out.println("1)To enter the integers");
				System.out.println("2)To exit");
				
				switch(s.nextInt()) {
				case 1: System.out.println("Enter the numbers");
				         s.nextLine();
				         String string = s.nextLine();
				         System.out.println(string);
				         ExerciseA e = new ExerciseA();
				         StringTokenizer st = e.parsingString(string);
				         while(st.hasMoreElements()) {
				        	 System.out.println(st.nextElement());
				         }
				         int sum = 0;
				         System.out.println("sum of integers:"+sum);
				         break;
				case 2: System.exit(0);
				       
				}
			}
		}
}
