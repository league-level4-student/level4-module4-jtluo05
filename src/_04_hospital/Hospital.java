package _04_hospital;

import java.util.ArrayList;
import java.util.List;

import _03_polymorphs.Polymorph;

public class Hospital {
	ArrayList<Doctor> hospital;
	Doctor doc = new Doctor();
	ArrayList<Patient> patient;
	Patient p = new Patient();

	void Hostital() {
		hospital = new ArrayList<Doctor>();
		patient = new ArrayList<Patient>();
	}

	void addDoctor(Doctor doc) {
		hospital.add(doc);
	}

	ArrayList<Doctor> getDoctors() {

		return hospital;
	}

	void addPatient(Patient p) {
		patient.add(p);
	}

	public ArrayList<Patient> getPatients() {
		return patient;
	}

	public void assignPatientsToDoctors() throws DoctorFullException {
	for (int i = 0; i < hospital.size(); i++) {
		if (hospital.get(0).getPatients().size()<3) {
			hospital.get(i).assignPatient(p);
		}
		else {
			
			throw new DoctorFullException();
		}
	}
		
	}

}
