package com.caresoft.clinicapp;


import java.util.ArrayList;
//
//public class Physician {
//	
//	import java.util.ArrayList;
	import java.util.Date;

	public class Physician extends User implements HIPAACompliantUser {
		
		private ArrayList<String> patientNotes;
		
//		private Integer pin;
        // Implement a constructor that takes an ID	

		
        // Implement a constructor that takes an ID		
//		private int pin;
		

		public Physician(Integer id) {
			super(id);		
		}
		
		
		
		
		
		

		public boolean assignPin(int pin) {
			if (pin > 999 && pin < 10000) {
		this.pin = pin;
    	return true;
 	}
	else {
		return false;
    }
}
    
		
		public boolean accessAuthorized(Integer confirmedAuthID) {
			if (confirmedAuthID.equals(this.getId())) {
				return true;
			}
		else {
				return false;
			}
		}
		

 

		
	    public void newPatientNotes(String notes, String patientName, Date date) {
	        String report = String.format(
	            "Datetime Submitted: %s \n", date);
	        report += String.format("Reported By ID: %s\n", this.id);
	        report += String.format("Patient Name: %s\n", patientName);
	        report += String.format("Notes: %s \n", notes);
	        this.patientNotes.add(report);
	    }

	    
	    
	    // TO DO: Setters & Getters
		public ArrayList<String> getPatientNotes() {
			return patientNotes;
		}

		public void setPatientNotes(ArrayList<String> patientNotes) {
			this.patientNotes = patientNotes;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}
		
}
