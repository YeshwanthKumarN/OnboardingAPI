package com.rest.training;

import com.model.home.NewHireDetails;

public class ResponseBuilder {

	//initialize an instance of newhire details
	private NewHireDetails hireDetails;
	
	//instance of current class which holds the final response
	private static ResponseBuilder currentInstance = new ResponseBuilder();
	
	//a method used by callers to consume the result
	public static ResponseBuilder getInstance() {
		return currentInstance;
	}
	
	public ResponseBuilder(){
		hireDetails = new NewHireDetails();
		hireDetails.setName("Yesh");
		hireDetails.setAddress("Hyd, India");
		hireDetails.setId("654365a");
		hireDetails.setPhoneNumber("699999999");
	}
	
	public NewHireDetails getHireDetails() {
		System.out.println(hireDetails);
		return hireDetails;
	}
}
