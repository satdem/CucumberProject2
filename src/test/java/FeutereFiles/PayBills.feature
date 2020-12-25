Feature: Pay bill functionality

  Background:


    Given Navigate to basqar
    When Enter username and password and click Login button
    #Then User should login successfully
    #|loginControl|coatch|

  Scenario Outline:Click pay bill an

    Then Click on paybills and click on Add new Payee
      | payBills    |
      | addNewPayee |


    When Payying bills
      | payeeName    | <namesecenek>   |
      | payeeAddress | <adressSecenek> |
      | acount       | <hesapSecenek>  |
      | payeeDetails | <details>       |

    And  Click on paybills and click on Add new Payee
      | addButton |

    And User should login successfully
      | controlMsj | <mesajkontrolu> |
    Examples:
      | namesecenek | adressSecenek | hesapSecenek | details  | mesajkontrolu |
      | isim1       | adres1        | hesap1       | details1 | success       |
      | isim2       | adres3        | hesap2       | details2 | success       |
      | isim3       | adres2        | hesap3       | details3 | success       |








