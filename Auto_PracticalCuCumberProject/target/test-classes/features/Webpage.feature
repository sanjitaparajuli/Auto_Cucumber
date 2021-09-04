@WebelementFeature 
Feature: TechFios webelement functionality validation 

Background: 
	Given User is on the TechFios page 
	
@Smoke 
Scenario: varify Set_skyBlue_Background and Set_White_Background buttons exists 
	Given Set SkyBlue Background button exists 
	When I click on first button 
	Then the background color will change to sky blue 
	Given Set SkyWhite Background button exists 
	When I click on second button 
	Then the background color will change to white 
	
	
	
	
	
	
	
	