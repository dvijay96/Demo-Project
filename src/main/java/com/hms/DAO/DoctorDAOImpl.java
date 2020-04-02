package com.hms.DAO;

import java.util.List;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hms.model.Doctor;
@Repository
public class DoctorDAOImpl implements DoctorDAO {
	@Autowired
	private SessionFactory sessionFactory;
@SuppressWarnings( "unchecked" )
	public List<Doctor> allDoctors() {
		return sessionFactory.getCurrentSession().createQuery("from Doctor").list();
	}

	public Doctor createDoctor(Doctor doctor) {
		sessionFactory.getCurrentSession().saveOrUpdate(doctor);
		return doctor;
	}

	public Doctor updateDoctor(Doctor doctor) {
		sessionFactory.getCurrentSession().update(doctor);
		return doctor;
	}

	public void deleteDoctor(long id) {
		Doctor doctor=(Doctor)sessionFactory.getCurrentSession().load(Doctor.class,id);
		if(null!=doctor)
		{
			this.sessionFactory.getCurrentSession().delete(doctor);
		}
	}



	public Doctor searchDoctorById(long id) {

		return (Doctor)sessionFactory.getCurrentSession().get(Doctor.class, id);
	}

}
