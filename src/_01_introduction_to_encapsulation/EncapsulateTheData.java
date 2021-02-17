package _01_introduction_to_encapsulation;

/*
 * Encapsulation is a way of protecting the data in a class from being
 * unintentionally altered from another class.
 * 
 * To encapsulate a member variable, follow these three steps:
 * 
 * 1. Make the member variable private (or protected)
 * 
 * 2. Make a getter and setter method (accessor and mutator) for the variable.
 * 
 * 3. Add restrictions to the setter method so the member variable cannot be 
 * 	  adversely altered
 * 
 * */


public class EncapsulateTheData {
	//1. Encapsulate the member variables.
	//   Add restrictions to the setters according to the comment.
	
	//2. Create a new JUnit Test case and write tests to verify that 
	//   the member variables' getters and setters are working
	
	protected int itemsReceived; //must not be negative. All negative arguments get set to 0.
	protected float degreesTurned; //must be locked between 0.0 and 360.0 inclusive.
	protected String nomenclature = " "; //must not be set to a blank string. Blank Strings get set to a space
	protected Object memberObj;  //must not be a String.  If it is a String, set it equal to a new Object();

	
	void setIR(int ir) {
		if (ir<0) {
			ir=0;
	itemsReceived=ir;
		}
	}
	int getIR() {
		return this.itemsReceived;
	}
	void setDT(float dt) {
		if (dt>=0&&dt<=360) {
	degreesTurned=dt;
		}
	}
	double getDT() {
		return this.degreesTurned;
	}
	void setN(String n) {
		if (n.equals("")) {
			n=" ";
		}
		nomenclature=n;
	}
	String getN() {
		return this.nomenclature;
	}

	void setMO(Object mo) {
		if (mo instanceof String) {
	mo =new Object();
		}
		memberObj=mo;
	}
	Object getMO() {
		return this.memberObj;
	}

}
