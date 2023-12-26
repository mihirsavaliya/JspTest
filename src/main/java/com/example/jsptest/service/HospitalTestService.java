package com.example.jsptest.service;

import java.util.List;
import java.util.Map;

import com.example.jsptest.model.HospitalTest;

public interface HospitalTestService 
{
	List<HospitalTest> getAllData();
	
	void save(HospitalTest hospitaltest);
	
	void delete(long hId);
	
	public Map<String, Object> edit(long id);
}
