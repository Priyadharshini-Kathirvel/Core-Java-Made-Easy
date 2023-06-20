package abstractclasses;

public abstract class BMW {
	
	public void commonFunc() {
		System.out.println("Inside commonFunc()");
	}
	
	abstract void accelerate();
	abstract void brake();
	
	public static void main(String[] args) {
		System.out.println("Inside main method");
	}
}
