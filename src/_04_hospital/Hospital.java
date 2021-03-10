package _04_hospital;

import java.util.ArrayList;
import java.util.List;

import _03_polymorphs.Polymorph;

public class Hospital {
	ArrayList<Doctor> hospital;
	Hospital doc = new Doctor();
	ArrayList<Patient> patient;

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

}
