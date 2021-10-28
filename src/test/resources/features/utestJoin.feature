#Autor: Alejandro Tamayo
@stories
Feature: Utest Join
  As a new user, I want to learn how to automate in screenplay at the Utest Join new user
  @scenario1
  Scenario: Join to Utest Website has new user
    Given than alejandro wants to join in the Utest Website with the personal data
    When he register your personal information in the register form
    | strName         | strLastName       | strEmail            | strYearOfBirth  | strMonthOfBirth | strDayOfBirth | strCity   | strZipCode  | strCountry |
    | Alejandro       | Tamayo            | alejos17@gmail.com  | 1984            | February        | 17            | Manizales | 170002      | Colombia   |
    Then he wants to check the user has created correctly