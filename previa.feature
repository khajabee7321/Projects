Feature: Vital

Background: 
  Given the Open Vital page is displayed
  
#@vittalmile
#Scenario Outline: Contact Us form submission
  #Given I click on the contact us button
 # When I enter the first name "<firstname>" and last name "<lastname>"
 # And I enter the email "<email>" and message "<message>"
 # Then I click on the submit button

#Examples:
#  | firstname | lastname | email                | message               |
 # | John      | Doe      | john.doe@gmail.com    | This is a test message|
#  | Jane      | Smith    | jane.smith@gmail.com  | Another test message  |
  #| test |     Testing    | test@gmail.com     |  This is 3rd testing |
  

  @Career
  Scenario:  Career page
  When Click on Career link
  When Enter Firstname
  When Enter Contact Number
  When Upload resume 
  When Click on submit button
  Then Close application3
