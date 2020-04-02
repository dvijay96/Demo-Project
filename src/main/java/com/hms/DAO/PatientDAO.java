package com.hms.DAO;

import java.util.List;
import java.util.Map;

import com.hms.model.Patient;

public interface PatientDAO {
public List<Patient> allPatients();
public Patient createPatient(Patient patient);
public void updatePatient(Patient patient);
public void deletePatient(long id);

public Patient searchPatientById(long id);

}
