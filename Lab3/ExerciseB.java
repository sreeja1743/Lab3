package Lab3;
import java.util.*;

public class ExerciseB {
   public static void main(String[] args) {
	ExerciseB e = new ExerciseB();
	@SuppressWarnings("resource")
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the string:");
	String str = s.next();
	StringBuffer string = new StringBuffer(str);
	str = str+"|"+e.getImage(string);
	System.out.println(str);
}
   
   public StringBuffer getImage(StringBuffer s) {
	   s = s.reverse();
	   return s;
   }
}
