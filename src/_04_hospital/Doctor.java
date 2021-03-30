package _04_hospital;

import java.util.ArrayList;

public class Doctor  {
	
boolean mhc=false;
ArrayList<Patient> dp=new ArrayList <Patient>();

Patient patient=new Patient();
	boolean performsSurgery() {

		return false;
	}

	boolean  makesHouseCalls() {

		return mhc;
	}

	void assignPatient(Patient patient) throws DoctorFullException {
		if (dp.size() < 3) {
			dp.add(patient);
		} else {
			throw new DoctorFullException();
		}
	}
	 public ArrayList<Patient> getPatients() {
			return dp;
		}

	public void doMedicine() {
	for (int i = 0; i < dp.size(); i++) {
		dp.get(i).care=true;
	}
		
	}

}
