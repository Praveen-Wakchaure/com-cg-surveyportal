package com.cg.surveyportal.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.surveyportal.entities.Surveyor;
import com.cg.surveyportal.repositories.ISurveyorRepository;
import com.cg.surveyportal.services.ISurveyorService;
@Service
public class SurveyorServiceImpl implements ISurveyorService {

	@Autowired
	ISurveyorRepository surveyorRepository;
	
	@Override
	public void populateSurveyor() {
		Surveyor serveyor = new Surveyor();
		serveyor.setFirstName("David");
		serveyor.setLastName("Austin");
		serveyor.setUsername("dav_aus");
		//serveyor.setSurveys(null);
		surveyorRepository.save(serveyor);
		/*----------------------------------------------*/
		
		serveyor = new Surveyor();
		serveyor.setFirstName("Alex");
		serveyor.setLastName("Berk");
		serveyor.setUsername("berk_aleX");
		//serveyor.setSurveys(null);
		surveyorRepository.save(serveyor);
		/*----------------------------------------------*/
		serveyor = new Surveyor();
		serveyor.setFirstName("Christopher");
		serveyor.setLastName("Haywire");
		serveyor.setUsername("hayChristo");
		//serveyor.setSurveys(null);
		surveyorRepository.save(serveyor);
		/*----------------------------------------------*/
		serveyor = new Surveyor();
		serveyor.setFirstName("Monica");
		serveyor.setLastName("Williams");
		serveyor.setUsername("MonsWill");
		//serveyor.setSurveys(null);
		surveyorRepository.save(serveyor);
		/*----------------------------------------------*/
		serveyor = new Surveyor();
		serveyor.setFirstName("Irene");
		serveyor.setLastName("Nayer");
		serveyor.setUsername("IMnayer");
		//serveyor.setSurveys(null);
		surveyorRepository.save(serveyor);
		/*----------------------------------------------*/
		serveyor = new Surveyor();
		serveyor.setFirstName("David");
		serveyor.setLastName("Lee");
		serveyor.setUsername("Dlee");
		//serveyor.setSurveys(null);
		surveyorRepository.save(serveyor);
		/*----------------------------------------------*/
		serveyor = new Surveyor();
		serveyor.setFirstName("Oliver");
		serveyor.setLastName("Bell");
		serveyor.setUsername("BellO");
		//serveyor.setSurveys(null);
		surveyorRepository.save(serveyor);
		/*----------------------------------------------*/
		serveyor = new Surveyor();
		serveyor.setFirstName("Kelly");
		serveyor.setLastName("Jones");
		serveyor.setUsername("JonesK");
		//serveyor.setSurveys(null);
		surveyorRepository.save(serveyor);
		/*----------------------------------------------*/
	}

	@Override
	public List<Surveyor> getAllSurveyor() {
		return surveyorRepository.findAll();
	}

	@Override
	public Surveyor getSurveyorDetails(String userName) {
		return surveyorRepository.findByUsername(userName);
	}
	
	public Surveyor getSurveyorDetails(long id) {
		return surveyorRepository.findById(id).get();
	}

	@Override
	public void removeById(long id) {
		Surveyor surveyor = surveyorRepository.findById(id).get();
		surveyor.setSurveys(null);
		surveyorRepository.deleteById(id);
	}

	@Override
	public void addSurveyor(String firstName, String lastName, String username) {
			Surveyor serveyor = new Surveyor();
			serveyor.setFirstName(firstName);
			serveyor.setLastName(lastName);
			serveyor.setUsername(username);
			serveyor.setSurveys(null);
			surveyorRepository.save(serveyor);
	}


}
