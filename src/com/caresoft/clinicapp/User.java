package com.caresoft.clinicapp;

public class User {
    
	
	protected Integer id;
    protected int pin;
	
	
	
	// Implement a constructor that takes an ID 
    

    

    
    
    
    public boolean assignPin(int pin) {
    	if (pin > 999 && pin < 10000) {
    		this.pin = pin;
    		return true;
 	}
	else {
		return false;
    }
}
	
	
	public User(Integer id) {
		super();
		this.id = id;
	}


	// TO DO: Getters and setters
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public int getPin() {
		return pin;
	}
	
	public void setPin(int pin) {
		this.pin = pin;
	}
 
}
