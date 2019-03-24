package steps

import base.StepsBase
import com.codeborne.selenide.Condition._
import com.codeborne.selenide.Selectors.byText
import com.codeborne.selenide.Selenide._
import org.scalatest.MustMatchers

class SampleSteps extends StepsBase with MustMatchers {

  Given("Googleトップページを開いてるとき") {
    () =>
      open("https://www.google.co.jp/")
  }

  When("検索窓に{string}と入力しENTERキーを押す") {
    keyword: String =>
      $("input[type=text]").setValue(keyword).pressEnter()
  }

  When("続いてSelenideの公式ページのリンクをクリックすると") {
    () =>
      $(byText("Selenide: concise UI tests in Java")).click()
  }

  Then("Selenideの公式ページに遷移する") {
    () =>
      $("body").shouldHave(text("What is Selenide?"))
  }

  Given("test") {

  }
}
