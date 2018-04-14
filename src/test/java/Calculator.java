
public class Calculator {
	
	public int evaluate(String expression) {
		int sum = 0;
		for(String summand : expression.split("\\+")) {
			sum += Integer.valueOf(summand);
		}
		
		return sum;
	}
/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c = new Calculator();
		System.out.print(c.evaluate("1+2+3"));
		

	}
*/
}
