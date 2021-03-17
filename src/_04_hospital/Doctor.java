package _04_hospital;

import java.util.ArrayList;

public class Doctor extends Hospital {
	Doctor doctor = new Doctor();
	boolean ps = false;
boolean mhc=false;
ArrayList<Patient> dp;

Patient patient=new Patient();
	boolean performsSurgery() {

		return ps;
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
	patient.care=true;
		
	}

}
