package com.cg.surveyportal.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.surveyportal.entities.Surveyor;
import com.cg.surveyportal.services.ISurveyorService;

@RestController
@RequestMapping("/surveyor")
public class SurveyorController {

	@Autowired
	ISurveyorService surveyorService;
	
	@GetMapping("/populate")
	private void populate()
	{
		surveyorService.populateSurveyor();
	}
	
	@GetMapping("/allsurveyors")
	private List<Surveyor> getAllSurveyors()
	{
		return surveyorService.getAllSurveyor();
	}
	
	@GetMapping("/findbyid/{id}")
	private Surveyor getSurveyorById(@PathVariable("id") long id)
	{
		return surveyorService.getSurveyorDetails(id);
	}
	
	@GetMapping("/findbyusername/{username}")
	private Surveyor getSurveyorById(@PathVariable("username") String username)
	{
		return surveyorService.getSurveyorDetails(username);
	}
	
	@DeleteMapping("/delete/{id}")
	private void deleteById(@PathVariable("id") long id)
	{
		surveyorService.removeById(id);
	}
	
	@PostMapping("/add/{fname}/{lname}/{uname}")
	private void addSurveyor(@PathVariable("fname") String fname, @PathVariable("lname") String lname, @PathVariable("uname") String uname)
	{
		surveyorService.addSurveyor(fname, lname, uname);
	}
 }
