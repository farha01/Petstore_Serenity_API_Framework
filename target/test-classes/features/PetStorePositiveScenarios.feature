@PetStorePositive
Feature: Automation Suite for PetStore API Testing 
  
  	Scenario: Verify Service Add Pet to the PetStore with Valid Data
    	Given Add Pet to the PetStore With Valid Data
    
    Scenario: Verify Service Get Pet from PetStore with Valid Data
    	Given Get Pet from PetStore with Valid Data
  	
  	Scenario: Verify Service Delete Pet from PetStore with Valid Data
    	Given Delete Pet from PetStore with Valid Data
    	
  	Scenario: Verify Sevice Place the Order with Valid Data
		Given Place the Order with Valid Data
    
    Scenario: Verify Sevice Get the Order with Valid Data
		Given Get the Order with Valid Data
    
    Scenario: Verify Sevice Delete the Order with Valid Data
		Given Delete the Order with Valid Data
		
	Scenario: Verify Sevice Get the Order with Valid Data
		Given Get Store Inventory with Valid Data
    
  	Scenario: Verify Service Create the User with Valid Data
  		Given Create the User with Valid Data
	
	Scenario: Verify Service User Logs into System with Valid Data
  		Given User Logs into System with Valid Data
	
	Scenario: Verify Service Get User with valid User Name
  		Given Get User with valid User Name 
	
	Scenario: Verify Service Update User with valid User Name
  		Given Update User with valid User Name 
	
	Scenario: Verify Service Delete User with valid User Name
  		Given Delete User with valid User Name 
	
	Scenario: Verify Service Creates list of users with Valid input Array
  		Given Creates list of users with Valid input Array 
	    
  	    