package com.hms.DAO;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hms.model.Hospital;

@Repository
public class HospitalDAOImpl implements HosipitalDAO {
	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public List<Hospital> getHospital() {

		return sessionFactory.getCurrentSession().createQuery("from Hospital").list();
	}

}
