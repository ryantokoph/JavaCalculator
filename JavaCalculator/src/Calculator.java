
public class Calculator {
	
	public int add(int a, int b) {
		return a + b;
	}
	
	public int subtract(int a, int b) {
		return a - b;
	}
	
	public int multiply(int a, int b) {
		return a * b;
	}
	
	public int divide(int a, int b) {
		return a / b;
	}
	
	public int sqaure(int a) {
		return a * a;
	}
	
	public class MagicCalculator extends Calculator {
		
		public double squareRoot(double a) {
			return Math.sqrt(a);
		}
		
		public double sin(double a) {
			return Math.sin(a);
		}
		
		public double cosine(double a) {
			return Math.cos(a);
		}
		
		public double tangent(double a) {
			return Math.tan(a);
		}
		
		public int factorial(int a) {
			int fac = 1;
			for(int i = 1; i <= a; i++) {
				fac *= 1;
			}
			return fac;
		}
	}
}
