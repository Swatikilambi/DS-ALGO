@homepage
Feature: I want to use Home_Page feature in my project
  

  @Home @Home_TC_01
  Scenario: User launch home page of an dsalgo project
    Given The user opens DS Algo portal link
    When The user clicks the Get Started button
    Then The user should be redirected to homepage
    
  @Home @Home_TC_02
  Scenario Outline: User is on Home page and click getstarted link on  home page without sign in
    Given The user is on Home page
    When The user clicks on Get Started link on homepage "<option>" without login
    Then The user get warning message "You are not logged in"
    
    Examples: 
      | option         |
      | Datastructures |
      | Arrays         |
      | Linkedlist     |
      | Stack          |
      | Queue          |
      | Tree           |
      | Graph          |
    
        
  @Home @Home_TC_03
  Scenario Outline: User is on Home page and click on dropdown without sign in
    Given The user is on Home page
    When  The user clicks on dropdown "<option>" without login
    Then The user get warning message "You are not logged in"
      
  Examples: 
      | option         |
      | Datastructures |
      | Arrays         |
      | Linkedlist     |
      | Stack          |
      | Queue          |
      | Tree           |
      | Graph          | 
   
   @Home @Home_TC_04
  Scenario: User is on Home page and click on sign in
   
		When User clicks on Register link
    And User is redirected to Register page 
    Then User is navigated to Homepage  
    When  The user clicks "Sign in" and login with credentials
    And The user should be redirected to homepage after Sign in with credentials
    
  