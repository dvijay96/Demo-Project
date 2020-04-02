package com.hms.service;

import com.hms.DAO.DoctorDAO;

import com.hms.DAO.HosipitalDAO;
import com.hms.DAO.PatientDAO;

public interface Service extends DoctorDAO, HosipitalDAO, PatientDAO {

}
