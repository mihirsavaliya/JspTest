package com.example.jsptest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.jsptest.model.HospitalTest;
import com.example.jsptest.service.HospitalTestService;

@Controller
public class FirstController 
{
	@Autowired
	HospitalTestService hospitaltestservice;
	
	/* @GetMapping(value= {"","/"}) */
	@GetMapping("/home") 
	public ModelAndView index()
	{
		ModelAndView modelandview = new ModelAndView();
		modelandview.setViewName("HomePage");
		modelandview.addObject("name", "Mihir Savaliya");
		modelandview.addObject("hospitals", hospitaltestservice.getAllData());
		return modelandview;
	}

	/* for Add the Data */
	@GetMapping("/add")
	public ModelAndView add()
	{
		ModelAndView modelandview = new ModelAndView("AddHospital");
		return modelandview;
	}
	
	@PostMapping("/addhospital")
	public ModelAndView addHospital(@ModelAttribute("hospital") HospitalTest hospitaltest, BindingResult result)
	{
		if(result.hasErrors())
		{
			return new ModelAndView("redirect:/home");
		}
		hospitaltestservice.save(hospitaltest);
		return new ModelAndView("redirect:/home");
	}
	
	@GetMapping("/delete")
	public ModelAndView delete(@RequestParam("hId") long hId)
	{
		hospitaltestservice.delete(hId);
		return new ModelAndView("redirect:/home");
	}
	
	@GetMapping("/edit")
	public ModelAndView edit(@RequestParam("hId") long hId)
	{
		ModelAndView edit = new ModelAndView();
		edit.setViewName("EditHospital");
		edit.addObject("data",hospitaltestservice.edit(hId));
		return edit;
	}
	
}
