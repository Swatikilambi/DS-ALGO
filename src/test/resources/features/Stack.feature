@STACK
Feature: Stack feature

Scenario: User launch DS_Algo and redirect to HomePage after login
    Given The user opens DSAlgo portal link stack
    And The user clicks the Get Started button stack
    When user redirected to homepage stack
    And User is on Home page and click on signIn stack
    Then The user should be redirected to Homepage after login stack
    
@Stack_01
  Scenario: The user is directed to "Stack" Page
    Given The user is on the home page after logged in
    When The user select stack item from the drop down menu
    Then The user should be directed to Stack Page

@Stack_02
  Scenario: The user is able to navigate to "Operations in Stack" page
    Given The user is on the Stack page after selecting Stack from dropdown after logged in
    When The user clicks on the Operations in Stack link
    Then The user should then be redirected to Operations in Stack Page
    
	@Stack_03
  Scenario: The user is able to navigate to a page having an tryEditor
    When The user clicks Try Here button in stack page
    Then The user should be redirected to a page having an tryEditor in stack
    
  @Stack_04
  Scenario: The user is able to run code in tryEditor
    When The user gets valid python input in stack
    And The user clicks on Run button after Entering valid python code in stack tryEditor
    Then The user should be presented with Run output in stack
    
  #@Stack_05
  #Scenario: The user is able to get the error message for invalid syntax
    #When The user gets invalid python input in stack
   #And The user clicks on Run button after Entering invalid python code in stack tryEditor
    #Then The user should get the error message in stack
  
	@Stack_06
  Scenario: The user is able to navigate to "Implementation" Page
    And User is navigated to Stack page
    When The user clicks on the Implementation button on Stack Page
    Then The user should then be redirected to Implementation Page
  
 	@Stack_07
  Scenario: The user is able to navigate to Implementation page having an tryeditor
    When The user clicks Try Here button in stack page
    Then The user should be redirected to a page having an tryEditor in stack
    
    
  @Stack_08
  Scenario: The user is able to run code in tryEditor
    When The user gets valid python input in stack
    And The user clicks on Run button after Entering valid python code in stack tryEditor
    Then The user should be presented with Run output in stack
   	 
#	@Stack_09
  #Scenario: The user is able to get the error message for invalid syntax
   # Given The user is in stack page having an tryEditor with a Run button to test implementation
    #When The user gets invalid python input in stack
    #And The user clicks on Run button after Entering invalid python code in stack tryEditor
    #Then The user should get the error message in stack
       
  @Stack_10
  Scenario: The user is able to navigate to "Applications" in stack Page
   #Given The user is on the TryEditor page of Stack Implementaion.
    And User is navigated to Stack page
    When The user clicks on the Applications button
    Then The user should be redirected to Applications Page
        
  @Stack_11
  Scenario: The user is able to navigate to Applications page having an tryEditor
    When The user clicks Try Here button in stack page
    Then The user should be redirected to a page having an tryEditor in stack
        
  @Stack_12
  Scenario: The user is able to run code in tryEditor
    When The user gets valid python input in stack
    And The user clicks on Run button after Entering valid python code in stack tryEditor
    Then The user should be presented with Run output in stack
	  
 #	@Stack_13
  #Scenario: The user is able to get the error message for invalid syntax
  #  Given The user is in stack page having an tryEditor with a Run button to test in Application
    #When The user gets invalid python input in stack
    #And The user clicks on Run button after Entering invalid python code in stack tryEditor
    #Then The user should get the error message in stack
    
  @Stack_14
  Scenario: The user is able to navigate to "Practice Questions" in stack Page
    Given The user is on the Try Editor page Stack Application 
    And User Navigates to previous page
    When The user clicks on the Practice Questions button
    Then The user should be redirected to Practice Questions page
    
   @Stack_15
   Scenario: The user is able to navigate to HomePage
   When The User is on Practice Questions Page
   Then The User should be redirected to HomePage
  
	