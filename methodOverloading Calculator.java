package methodOverloading;

public class Calculator {
	
	public int add(int a,int b) {
		return a+b;
		
	}
	public double add(double a,double b) {
		return a+b;
	}
	public int add(int a,int b,int c) {
		return a+b+c;
	}
	
	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println("sum of 2 and 3 ="+c.add(2,3));
		System.out.println("sum of 2.4 and 3.45= "+c.add(2.4,3.45));
		System.out.println("sumof 2,3,4= "+c.add(12, 13,34));
		
	
		
	}

}