package Lab3;

import java.util.StringTokenizer;

public class ExerciseA {
	private StringTokenizer p;
	private int sum = 0;

	
	
	
	public int getSum() {
		return sum;
	}




	public void setSum(int sum) {
		this.sum = sum;
	}




	public StringTokenizer parsingString(String s) {
    	this.p = new StringTokenizer(s," ");
    	while(p.hasMoreTokens()) {

     		sum += Integer.parseInt(p.nextToken());
     	}
    	return this.p;
    }
   
}
