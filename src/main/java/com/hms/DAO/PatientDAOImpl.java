package com.hms.DAO;

import java.util.List;

import java.util.Map;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hms.model.Patient;
@Repository
public class PatientDAOImpl implements PatientDAO {
	@Autowired
	private SessionFactory sessionFactory;
@SuppressWarnings("unchecked")
	public List<Patient> allPatients() {
		return sessionFactory.getCurrentSession().createQuery("from Patient").list();
	}

	public Patient createPatient(Patient patient) {
		sessionFactory.getCurrentSession().saveOrUpdate(patient);
		return patient;
	}

	public void updatePatient(Patient patient) {
		sessionFactory.getCurrentSession().update(patient);

	}

	public void deletePatient(long id) {
		Patient patient=(Patient)sessionFactory.getCurrentSession().load(Patient.class, id);
if(null!=patient)
{
	this.sessionFactory.getCurrentSession().delete(patient);
}
	}

	
	public Patient searchPatientById(long id) {
		
		return (Patient)sessionFactory.getCurrentSession().get(Patient.class, id);
	}

}
