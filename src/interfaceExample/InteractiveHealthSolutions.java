package interfaceExample;

/**
 * Author Daniel M.Idrees enggdaniyal@hotmail.com
 */

public class InteractiveHealthSolutions implements IOfficeRule{

	public InteractiveHealthSolutions() {
		System.out.println("Constructor of InteractiveHealthSolutions");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	//	IOfficeRule obj = new ... //not allowed. Instance/object of interface cant be made.
		InteractiveHealthSolutions interactiveHealthSolutions = new InteractiveHealthSolutions();
		interactiveHealthSolutions.setLunchTime();
	}
	
	//This method is necessary to be implemented. All abstract method defined in Interface will be implemented!
	@Override
	public void setLunchTime() {
		System.out.println("12:30pm to 2:30pm");
	}

}
