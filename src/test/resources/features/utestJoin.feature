#Autor: Alejandro Tamayo
@stories
Feature: Utest Join
  As a new user, I want to learn how to automate in screenplay at the Utest Join new user
  @scenario1
  Scenario: Join to Utest Website has new user
    Given than alejandro wants to join in the Utest Website with the personal data
    When he register your personal information in the register form
    | strName         | strLastName       | strEmail            | strYearOfBirth  | strMonthOfBirth | strDayOfBirth | strCity   | strZipCode  | strCountry |  strComputer | strVersion    | strLanguage | strMobileDevice | strModel  | strOs   | strPassword   |
    | Alejandro       | Tamayo            | alecarcatsan@gmail.com  | 1984            | February        | 17            | Manizales | 170002      | Colombia   |  macOS       | Big Sur 11.6  | Spanish     | Apple           | iPhone 7  | iOS 14.8| 6W#FXe92k9dx  |
    Then he wants to check the user has created correctly
    | strMessage      |
    | We are excited that you have found your way to uTest - home of the largest community of digital freelance software testers in the world! |