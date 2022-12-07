package com.marketingapp.controller;

import org.springframework.web.client.RestTemplate;

import com.marketingapp.dto.Lead;

public class LeadRestClient {
	public Lead showLeadData(long id) {
		try {
			RestTemplate restTemplate = new RestTemplate();
			Lead lead = restTemplate.getForObject("http://localhost:8080/marketingapp/lead/"+id, Lead.class);
			return lead;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
