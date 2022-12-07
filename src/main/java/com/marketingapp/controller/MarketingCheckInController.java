package com.marketingapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.marketingapp.dto.Lead;

@Controller
public class MarketingCheckInController {
	@RequestMapping("/viewcheckinpage")
	public String viewCheckInPage() {
		
		return "marketing_checkin_app";
	}
	@RequestMapping("/verifyCheckIn")
	public String verifyCheckIn(@RequestParam("id") long id,ModelMap model) {
		LeadRestClient client = new LeadRestClient();
		Lead lead = client.showLeadData(id);
		if(lead!=null) {
			model.addAttribute("lead", lead);
			return "showLeads";
		}else {
			model.addAttribute("error", "<h1>No record is found</h1>");
			return "showLeads";
		}
		
	}

}
