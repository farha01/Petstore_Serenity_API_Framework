@PetStoreServices
Feature: Automation Suite for PetStore API Testing 
  
	Scenario: Adding Pet to the Store
    Given Adding Pet to PetStore
    Then Getting Pet From Store
  	Then Delete Added Pet
	   
	Scenario: Place the Order
	Given Place the Order
    Then Getting the Order
  	Then Delete the Placed Order
  	Then Get Store Inventory
  	
  	Scenario: Create User Operations
  	Given Create the User
	Then User Logs into System
	Then Get user by user name
    Then Update the user
	Then Delete the user
	Then Creates list of users with given input array      
  	    