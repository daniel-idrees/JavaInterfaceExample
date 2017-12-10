package abstraction;

/**
 * Author Daniel M.Idrees enggdaniyal@hotmail.com
 */

public class Circle extends Shape {

	public Circle() {
		System.out.println("Constructor of Circle");
	}
	
	public void newMethod() {
		System.out.println("This is a new method of Circle");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	//	Shape shape = new Shape(); // abstract class object can not refer to itself
	//	shape.draw(); 
		
		Shape shape = new Circle(); //constructor of both circle and shape will be called
		Circle circle = new Circle(); //constructor of both circle and shape will be called
			
	//	shape.newMethod();
		circle.newMethod();
		
	//	shape.draw();
	//	circle.draw();

	}
	
	//since it extends an abstract class, it must implement the abstract methods
	@Override
	void draw() {
		System.out.println("Drawing Circle");
	}

}
