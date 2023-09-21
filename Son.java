package week2.day3;

public class Son extends Parents {
	
	@Override
	public void marriage() {
		System.out.println("My life my rules :");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parents p1 = new Son();//parent class ref to create child class obj
		p1.prop();
		p1.marriage();
	}

}
