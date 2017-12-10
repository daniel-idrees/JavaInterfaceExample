package abstraction;

/**
 * Author Daniel M.Idrees enggdaniyal@hotmail.com
 */

public class Rectangle extends Shape {

	public Rectangle() {
		System.out.println("Constructor of Rectangle Class");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	//	Shape shape = new Shape();  abstract class object can not refer to itself
		Shape shape = new Rectangle(); //constructor of both rectangle and shape will be called
		Rectangle rectangle = new Rectangle(); //constructor of both rectangle and shape will be called
		
		shape.draw();
		rectangle.draw();

	}
	
	//since it extends an abstract class, it must implement the abstract methods
	@Override
	void draw() {
		System.out.println("Drawing Rectangle");
	}

}
