Feature: Addition

Scenario: Addition of two numbers
	Given I have two numbers as "9" & "12"
	When I do addition 
	Then Result should display in console
	
	Scenario: Addition of two numbers with list
	Given Ihave two numbers as below List
	|8|
	|9|
	When I do addition
  Then Result should display in console
	
	
Scenario: Addition of two numbers with Map
	Given Ihave two numbers as below Map
	|num1| 8|
	|num2| 10|
	When I do addition
	Then Result should display in console