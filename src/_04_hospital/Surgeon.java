package _04_hospital;

public class Surgeon extends Doctor {
	Doctor doctor=new Doctor();
	boolean performsSurgery() {
		doctor.ps = false;
		return ps;
	}

	boolean makesHouseCalls() {

		return doctor.mhc;
	}
}
