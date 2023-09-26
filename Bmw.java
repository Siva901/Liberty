package week3.day2;

public class Bmw extends Car {
	@Override
	public void carEngine() {
		System.out.println("Bmw Engine Secerat");
	}
	@Override
	public void carVault() {
		System.out.println("Bmw vault Secerat");
	}
	

	public static void main(String[] args) {
		Car c1= new Bmw();
		c1.carEngine();
		c1.carVault();
		c1.Employee();
		c1.Employee1();
	}

}
