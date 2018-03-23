package com.sam.restmaven.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/act")
public class LoginController {
	
	@RequestMapping(value="/get",method=RequestMethod.GET)
	public String getFirstCall() {
		return "Request received";
	}

}
