Feature: Google検索で見たいページが閲覧できる

  Scenario: Google検索でSelenide公式ページを検索し閲覧できる
    Given Googleトップページを開いてるとき
    When 検索窓に"selenide"と入力しENTERキーを押す
    And 続いてSelenideの公式ページのリンクをクリックすると
    Then Selenideの公式ページに遷移する


  Scenario: default
    Given test

  @now
  Scenario: now
    Given test
