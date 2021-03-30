package _04_hospital;

public class Surgeon extends Doctor {
	Doctor doctor=new Doctor();
	boolean performsSurgery() {
		
		return true;
	}

	boolean makesHouseCalls() {

		return doctor.mhc;
	}
}
