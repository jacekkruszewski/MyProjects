Feature: jakis test

  Scenario: to mój scenariusz
    Given jestem w aplikacji
    When coś tam
    And mam więcej o
    Then nic sie nie zmienilo
    And moje haslo to "haselko" a user to "userek"
    And a tutaj inna metoda
      | Haslo  | User   |
      | pawel  | gawel  |
      | tomek  | jacek  |
      | tomek1 | jacek2 |

  Scenario Outline: to mój scenariusz przy użyciu Scenario Outline
    Given jestem w aplikacji
    When coś tam
    And mam więcej o
    Then nic sie nie zmienilo
    And moje haslo to <haslo> a user to <user>
     Examples:
      | haslo  | user   |
      | pawel1  | gawel2  |
      | tomek1  | jacek2  |
      | tomek11 | jacek2 |