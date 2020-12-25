
Feature: Login Functionality

  Background:


    Given Navigate to basqar
    When Enter username and password and click Login button
    #Then User should login successfully
    #|loginControl|coatch|

  Scenario:Click pay bill an

    Then Click on paybills and click on Add new Payee
      | payBills    |
      | addNewPayee |


    When Payying bills
      | payeeName    | elektrik       |
      | payeeAddress | okul caddesi 4 |
      | acount       | acount1        |
      | payeeDetails | details        |

    And  Click on paybills and click on Add new Payee
    |addButton|

    And User should login successfully
      |controlMsj|success|






