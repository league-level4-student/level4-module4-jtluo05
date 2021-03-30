package _04_hospital;

import java.util.ArrayList;
import java.util.List;

import _03_polymorphs.Polymorph;

public class Hospital {
	ArrayList<Doctor> hospital;
	ArrayList<Patient> patient;
	Patient p = new Patient();

	Hospital() {
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
		int di=0;
		for (int i = 0; i < patient.size(); i++) {
			 try {
				 hospital.get(di).assignPatient(p);
				
			 } catch(DoctorFullException dfe){
				di++;
				i--;
			 }
		}

	}

}
