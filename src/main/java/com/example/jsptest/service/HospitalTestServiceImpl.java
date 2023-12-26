package com.example.jsptest.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jsptest.model.HospitalTest;
import com.example.jsptest.repository.HospitalTestRepo;

@Service
public class HospitalTestServiceImpl implements HospitalTestService{

	@Autowired
	HospitalTestRepo hospitaltestrepo;
	
	@Override
	public List<HospitalTest> getAllData() {
		// TODO Auto-generated method stub
		return hospitaltestrepo.findAll();
	}

	@Override
	public void save(HospitalTest hospitaltest) {
		// TODO Auto-generated method stub
		hospitaltestrepo.save(hospitaltest);
	}

	@Override
	public void delete(long hId) {
		// TODO Auto-generated method stub
		hospitaltestrepo.deleteById(hId);
	}

	@Override
	public Map<String, Object> edit(long id) {
		// TODO Auto-generated method stub
		HospitalTest h = hospitaltestrepo.findById((long) id).get();
		
		Map<String, Object> students = new HashMap<String, Object>();
		students.put("id", h.gethId());
		students.put("name", h.getName());
		students.put("city", h.getCity());
		students.put("speciality", h.getSpeciality());
		students.put("numofdoc", h.getNumDoctor());
		
		return students;
	}
}