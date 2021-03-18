@PetStoreNegitive
Feature: Automation Suite for PetStore API Testing 
  
  	Scenario: Verify Adding Pet to the Store with Invalid Input
    	Given Adding Pet to PetStore with Invalid Input
  
  	Scenario: Verify Getting Pet from the Store with Invalid Input
  		Then Getting Pet From Store with Invalid Pet ID
  
  	Scenario: Verify Deleting the Pet with Invalid Pet ID
  		Given Delete Added Pet with Invalid pet ID
  	
	Scenario: Verify Delete the Purchase order by Invalid ID 
		Given Delete the Order with Invalid Order ID
    
    Scenario: Verify Getting the User with Invalid UserName
		Given Get the user with Invalid UserName
		
  	Scenario: Verify Deleting the User with Invalid UserName
		Given Delete the user with Invalid UserName   
  	    