@Queue
Feature: Implement Queue feature in DS_ALgo Project

  Scenario: User redirect to HomePage after login
    Given The user navigates to signIn page
    When The user enters login credentials and clicks Login button
    Then The user should be redirected to Homepage after logged in

  @Queue_01
  Scenario: The user is directed to "Queue" Page
    Given The user is on the home page after login
    When The user select Queue item from the drop down menu
    Then The user should be directed to Queue Page

  #Updated
  @Queue_02
  Scenario: The user is able to navigate to "Implementation of Queue in Python" page
    Given The user is on the Queue page after selecting Queue from dropdown after logged in
    When The user clicks on the Implementation of Queue in Python link
    Then The user should then be redirected to Implementation of Queue in Python Page

  #Updated
  @Queue_03
  Scenario: The user is able to navigate to a page having an tryEditor
    Given The user is on the Implementation of Queue in Python page after logged in
    When The user clicks Try Here button Implementation of Queue page and Navigated to page having an tryEditor
    Then The user should be redirected to a page having an tryEditor of Implementation of Queue with a Run button

  @Queue_04
  Scenario: The user is able to run code in tryEditor
    Given The user is in the Queue page after having an tryEditor with a Run button to test Implementation of Queue in Python
    When The user gets input from sheet Sheetname and RowNumber for Implementation of Queue in Python
    And The user clicks on Run button after Entering valid python code in Queue tryEditor of Implementation of Queue in Python
    Then The user should be presented with Run output for Implementation of Queue in Python 

  #Added
  #@Queue_05
  #Scenario: The user is able to get the error message for invalid syntax
    #Given The user is in Queue page having an tryEditor with a Run button to test Implementation of Queue in Python
    #When The user gets invalid input from sheet Sheetname and RowNumber Implementation of Queue in Python
    #And The user clicks on Run button after Entering invalid python code in Queue tryEditor Implementation of Queue in Python
    #Then The user should get the error message Implementation of Queue in Python
#
  #Added
  @Queue_06
  Scenario: The user is able to navigate to "Implementation using collections.deque" Page
    Given The user is on the TryEditor page of Implementation of Queue in Python in Queue
    And The User is navigated to Queue page from Implementation of Queue in Python in Queue
    When The User Clicks on Implementation using collections link
    Then The user should then be redirected to Implementation using collections.deque Page
    
  #Updated
  @Queue_07
  Scenario: The user is able to navigate to Implementation using collections.deque page having an tryeditor
    Given The user is on the Implementation using collections.deque page after logged in
    When The user clicks Try Here button in Implementation using collections.deque page
    Then The user should be redirected to a page having an tryEditor Implementation using collections.deque with a Run button

  #Updated
  @Queue_08
  Scenario: The user is able to run code in tryEditor
    Given The user is in the Implementation using collections.deque page after having an tryEditor with a Run button to test
    When The user gets input from sheet Sheetname and RowNumber for Implementation using collections.deque
    And The user clicks on Run button after Entering valid python code in Implementation using collections.deque tryEditor for implementation
    Then The user should be presented with Run output for Implementation using collections.deque

  #Added
  #@Queue_09
  #Scenario: The user is able to get the error message for invalid syntax
    #Given The user is in queue page having an tryEditor with a Run button to test Implementation using collections.deque
    #When The user gets invalid input from sheet Sheetname and RowNumber in Implementation using collections.deque
    #And The user clicks on Run button after Entering invalid python code in stack tryEditor in Implementation using collections.deque
    #Then The user should get the error message on queue Implementation using collections.deque
#
  #Added
  @Queue_10
  Scenario: The user is able to navigate to "Implementation using array" in queue Page
    Given The user is on the TryEditor page of Implementation using collections.deque.
    And User is navigated to Queue page after logged in Implementation using collections
    When The user clicks on the Implementation using array button
    Then The user should be redirected to Implementation using array Page
#
  #Updated
  @Queue_11
  Scenario: The user is able to navigate to Implementation using array page having an tryEditor
    Given The user is on the Implementation using array page after logged in
    When The user clicks Try Here button in Implementation using array page
    Then The user should be redirected to a page having an tryEditor Implementation using array with a Run button
#
  #Updated
  @Queue_12
  Scenario: The user is able to run code in tryEditor
    Given The user is in the Implementation using array page after having an tryEditor with a Run button to test
    When The user gets input from sheet Sheetname and RowNumber in Implementation using array
    And The user clicks on Run button after Entering valid python code in stack tryEditor in Implementation using array
    Then The user should be presented with Run output in Implementation using array
#
  #Added
  #@Queue_13
  #Scenario: The user is able to get the error message for invalid syntax
    #Given The user is in stack page having an tryEditor with a Run button to test in Implementation using array
    #When The user gets invalid input from sheet Sheetname and RowNumber in Implementation using array
    #And The user clicks on Run button after Entering invalid python code in stack tryEditor in Implementation using array
    #Then The user should get the error message in Implementation using array
#
  #Added
  @Queue_14
  Scenario: The user is able to navigate to "Queue Operations" in queue Page
    Given The user is on the TryEditor page of Implementation using array.
    And User is navigated to Queue page after logged in
    When The user clicks on the Queue Operations button
    Then The user should be redirected to Queue Operations Page
#
  #Updated
  @Queue_15
  Scenario: The user is able to navigate to Queue Operations page having an tryEditor
    Given The user is on the Queue Operations page after logged in
    When The user clicks Try Here button in Queue Operations
    Then The user should be redirected to a page having an tryEditor Queue Operations with a Run button
#
  #Updated
  @Queue_16
  Scenario: The user is able to run code in tryEditor
    Given The user is in the Queue Operations after having an tryEditor with a Run button to test
    When The user gets input from sheet Sheetname and RowNumber in Queue Operations
    And The user clicks on Run button after Entering valid python code in stack tryEditor in Queue Operations
    Then The user should be presented with Run output in Queue Operations
#
  #Added
  #@Queue_17
  #Scenario: The user is able to get the error message for invalid syntax
    #Given The user is in Queue page having an tryEditor with a Run button to test in Queue Operation
    #When The user gets invalid input from sheet Sheetname and RowNumber in Queue Operations
    #And The user clicks on Run button after Entering invalid python code in stack tryEditor in Queue Operations
    #Then The user should get the error message in Queue Operations
#
  #Added
  @Queue_18
  Scenario: The user is able to navigate to "Practice Questions" in Queue Page
    Given The user is on the Try Editor page Queue Operations
    And User Navigates to previous page of Queue Operations
    When The user clicks on the Practice Questions button of Queue
    Then The user should be redirected to Practice Questions page of Queue
#
  #Updated
  @Queue_19
  Scenario: The user is able to navigate to HomePage
    When The User is on Practice Questions Page of Queue Operations
    Then The User should be redirected to HomePage from Queue Operations Practice questions page
