package abstraction;

/**
 * Author Daniel M.Idrees enggdaniyal@hotmail.com
 */

public abstract class Shape {

	public Shape() {
		System.out.println("Constructor of Shape Class");
	}
	
	public void func() {
		System.out.println("An implemented Function of an Abstract class");
	}
	
	abstract void draw();  //it will be implemented in the child class

}
