Feature: login test

Scenario Outline: TO DO DATA DRIVEN TESTING ON LOGIN FUNCTIONALITY
	Given User is on login page
	When user enters username as "<Username>" & password as "<Password>" & click on login
	Then login "<Logintype>" be happen
	
		Examples: 
		| Username | Password | Logintype |
		| demouser | password | should    |
		| admin    | admin123 | shouldNot |
		|  hr      | hr123 		| shouldNot |
		| demo     | demo123  | shouldNot |
		