package com.hms.DAO;

import java.util.List;
import java.util.Map;

import com.hms.model.Doctor;

public interface DoctorDAO {
	public List<Doctor> allDoctors();
	public Doctor createDoctor(Doctor doctor);
	public Doctor updateDoctor(Doctor doctor);
	public void deleteDoctor(long id);
	public Doctor searchDoctorById(long id);
}
