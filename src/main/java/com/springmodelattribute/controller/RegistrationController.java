package com.springmodelattribute.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springmodelattribute.model.UserRegistrationDTO;

@Controller
public class RegistrationController {

	@RequestMapping("/register")
	public String showRegistrationPage(@ModelAttribute("userregdto") UserRegistrationDTO userregdto) {
		// userregdto.setName("Nandu");
		// userregdto.setUserName("bachi");
		// userregdto.setPassword();
		return "user_registration_page";
	}

	@RequestMapping("/registration_success")
	public String showResultPage(@ModelAttribute("userregdto") UserRegistrationDTO userregdto) {

		return "Result_Page";

	}
}
