package com.cg.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AnalyzerController {


	@RequestMapping(value = "analyzeApp", method = RequestMethod.GET)
	public String welcome(Map<String, Object> model) {
		return "abc";
	}

	@RequestMapping(value = "form", method = RequestMethod.GET)
	public String form(Map<String, Object> model) {
		return "form";
	}

	@RequestMapping(value = "ques", method = RequestMethod.GET)
	public String ques(Map<String, Object> model) {
		return "ques";
	}

	@RequestMapping(value = "costestimation", method = RequestMethod.GET)
	public String costestimation(Map<String, Object> model) {
		return "costestimation";
	}
	
	@RequestMapping(value = "v2", method = RequestMethod.GET)
	public String v2(Map<String, Object> model) {
		return "tabs";
	}

}
