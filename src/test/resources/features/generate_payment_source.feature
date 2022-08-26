Feature: as a RentingColombia project's i need created a source payment


  Background:
    Given the project gets token


  Scenario: Created payment source

    When the project called ProxyWompi's API for create a payment source whit the information

      | transactionReference | bussinessName | costumerEmail              | paymentSourceType | paymentSourceToken                              |
      | Test121              | Localiza      | cisaza@rentingcolombia.com | CARD              | tok_test_16324_b73a250c3e2A7e6b464283451bc829FF |

    Then he should see the encrypted token



