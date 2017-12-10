package interfaceExample;

/**
 * Author Daniel M.Idrees enggdaniyal@hotmail.com
 */

public class SkillOrbit implements IOfficeRule{

	public SkillOrbit() {
		System.out.println("Constructor of SkillOrbit");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//	IOfficeRule obj = new ... //not allowed. Instance/object of interface cant be made.
		SkillOrbit skillOrbit = new SkillOrbit();
		skillOrbit.setLunchTime();

	}
	
	//This method is necessary to be implemented. All abstract method defined in Interface will be implemented!
	@Override
	public void setLunchTime() {
		System.out.println("1pm to 2pm");
	}

}
