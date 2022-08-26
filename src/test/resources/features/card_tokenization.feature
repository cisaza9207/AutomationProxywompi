Feature: as a RentingColombia project's i need tokenize a card for created a source payment


  Scenario: Card tokenization

  Given the project gets the publickey of Rentingcolombia for Wompi

    When he called wompi's API whit the information
      | number           | cvc | exp_month | exp_year | card_holder |
      | 4242424242424242 | 789 | 02        | 26       | Eliana      |

    Then he should see the token in the API´s response



