package com.safeKnee.core.controllers;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.safeKnee.core.service.AdvertisementService;
import com.safeKnee.core.service.HospitalService;
import com.safeKnee.core.service.LoginService;
import com.safeKnee.core.service.SurgeryService;

@RestController
public class TestRestController {
	ObjectMapper mapperObj = new ObjectMapper();
	
	@Autowired
	   AdvertisementService advService;
		
	@Autowired
	HospitalService hosService;
	
	@Autowired
	SurgeryService surService;
	
	@Autowired
	LoginService loginService;
	
	
	@RequestMapping(path={"/api/hi"},method=RequestMethod.GET)
	   public String sayHi(Model model) {
		
		String jsonStr="" ;
		try {
			jsonStr= mapperObj.writeValueAsString(advService.findAll());
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(jsonStr);
	      return jsonStr;
	   }
	
	
	
	
	@RequestMapping(path={"/api/findAllHospitals"},method=RequestMethod.GET)
	   public String findHospitals(Model model) {
		
		String jsonStr="" ;
		try {
			jsonStr= mapperObj.writeValueAsString(hosService.findAll());
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(jsonStr);
	      return jsonStr;
	   }
	
	
	@RequestMapping(path={"/api/findAllSurgeries"},method=RequestMethod.GET)
	   public String findSurgeries(Model model) {
		
		String jsonStr="" ;
		try {
			jsonStr= mapperObj.writeValueAsString(surService.findAll());
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(jsonStr);
	      return jsonStr;
	   }
	
	@RequestMapping(path={"/api/findAllLogins"},method=RequestMethod.GET)
	   public String findLogins(Model model) {
		
		String jsonStr="" ;
		try {
			jsonStr= mapperObj.writeValueAsString(loginService.findAll());
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(jsonStr);
	      return jsonStr;
	   }
}
