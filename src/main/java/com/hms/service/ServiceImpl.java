package com.hms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.hms.DAO.DoctorDAO;
import com.hms.DAO.HosipitalDAO;
import com.hms.DAO.PatientDAO;
import com.hms.model.Doctor;
import com.hms.model.Hospital;
import com.hms.model.Patient;
@org.springframework.stereotype.Service
@Transactional
public class ServiceImpl implements Service {
	@Autowired
    private DoctorDAO doctorDAO;
	@Autowired
	private PatientDAO patientDAO;
	@Autowired
	private HosipitalDAO hosipitalDAO;
	
	@Transactional
	public List<Doctor> allDoctors() {
	
		return doctorDAO.allDoctors();
	}
@Transactional
	public Doctor createDoctor(Doctor doctor) {
		return doctorDAO.createDoctor(doctor);
	}
@Transactional
	public Doctor updateDoctor(Doctor doctor) {
		return doctorDAO.updateDoctor(doctor);
	}
@Transactional
	public void deleteDoctor(long id) {
	  doctorDAO.deleteDoctor(id);
	}
@Transactional
	public Doctor searchDoctorById(long id) {
		
		return doctorDAO.searchDoctorById(id);
	}
@Transactional
	public List<Hospital> getHospital() {
		return hosipitalDAO.getHospital();
	}
@Transactional
	public List<Patient> allPatients() {
		return patientDAO.allPatients();
	}
@Transactional
	public Patient createPatient(Patient patient) {
		return patientDAO.createPatient(patient);
	}
@Transactional
	public void updatePatient(Patient patient) {
		patientDAO.updatePatient(patient);
	}
@Transactional
	public void deletePatient(long id) {
	patientDAO.deletePatient(id);

	}
@Transactional
	public Patient searchPatientById(long id) {
		
		return patientDAO.searchPatientById(id);
	}
	public void setDoctorDAO(DoctorDAO doctorDAO) {
		this.doctorDAO = doctorDAO;
	}
	public void setPatientDAO(PatientDAO patientDAO) {
		this.patientDAO = patientDAO;
	}
	public void setHosipitalDAO(HosipitalDAO hosipitalDAO) {
		this.hosipitalDAO = hosipitalDAO;
	}

}
