package com.iproximus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.iproximus.dao.ServiceStationRepo;
import com.iproximus.model.servicestation;

@Controller

public class ServiceStationController {
	@Autowired
	ServiceStationRepo repo;

	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}

	@RequestMapping("/servicestation")
	public String addservicestation(servicestation servicestation) {
		repo.save(servicestation);
		return "home.jsp";

	}

	@RequestMapping("/getservice")
	public ModelAndView getservicestation(@RequestParam String name) {
		ModelAndView mv = new ModelAndView("showservice.jsp");
		servicestation servicestation = repo.findByName(name);
		System.out.println(repo.findByAddress("Coimbatore"));
		System.out.println(repo.findByIdGreaterThan(102));
		System.out.println(repo.findByAddressSorted("Coimbatore"));
		mv.addObject(servicestation);
		return mv;

	}
}
