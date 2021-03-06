Feature: Test the calculator app on andriod using apium
  Scenario: Test Calculator on Andriod using apium
    Given Calculator is opened on the emulator "emulator-5554"
    Then add "5" and "4"
    Then result should be "9"