#Feature: Search something on on google and print its title.
  #Scenario: Search something on google and print its title on Android chrome
    #Given Open "Chrome" on "Android" and open google.com
    #Then Search for "Appium" and verify the title "Appium"
    
Feature: Search something on on google and print its title.
  Scenario: Search something on google and print its title on Android chrome
    Given Open "Chrome" on "Windows" and open google.com
    Then Search for "Appium" and verify the title "Appium"