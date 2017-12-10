package interfaceExample;

/**
 * Author Daniel M.Idrees enggdaniyal@hotmail.com
 */

public interface IOfficeRule {

//100% abstraction
//All methods should be abstract
//Interface is not a class! it is a contract/agreement
	
//constructor is not allowed since it isnt a class	
//	public IOfficeRule() {
//
//	}
	
	//any common behavior which will be present in all Offices.
	//Every office will have its own implementation of this behavior. But implementation is must. 
	public void setLunchTime();  //by default it is abstract 
	//or underneath is same
	//public abstract void setLunchTime();
	
	
	
}
