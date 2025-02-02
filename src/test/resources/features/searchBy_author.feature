Feature: Search by Author

  @Author
  Scenario: Searching for 'author'
    Given user is researching books on the Book Store API
    When he looks up "Richard"
    Then he should see books authored by "Richard"


Feature: Add new item to TODO list
  Scenario: Add buying milk to the list
    Given Rama is looking at his TODO list
    When he adds "Buy some milk" to the list
    Then he sees "Buy some milk" as an item in the TODO list