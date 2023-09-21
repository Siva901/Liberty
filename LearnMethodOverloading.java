package week2.day3;

public class LearnMethodOverloading {
	
	public int add(int a, int b) {
		return a+b;
	}
	public int add(int a, int b,int c) {
		return a+b+c;
	}
	public float add(float a, float b) {
		return a+b;
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LearnMethodOverloading ov = new LearnMethodOverloading();
		System.out.println("Sum of two numbers: " + ov.add(5, 6));
		System.out.println("Sum of Three numbers: " + ov.add(2, 3, 4));
		System.out.println("Sum of Float numbers: " + ov.add(2.1f, 4.4f));
		 
		

	}

}
