package base

import com.codeborne.selenide.{Configuration, WebDriverRunner}
import cucumber.api.Scenario
import cucumber.api.scala.{EN, ScalaDsl}
import org.openqa.selenium.remote.DesiredCapabilities

trait StepsBase extends ScalaDsl with EN {

  protected val isHealdress = true

  protected val browserSize = "1920x1024"

  protected val baseUrl = "https://localhost"

  protected val capabilities = {
    val capabilities = new DesiredCapabilities()
    capabilities.setAcceptInsecureCerts(true) // 認証外のSSLを許可
    capabilities
  }

  protected def show(scenario: Scenario): String = {
    s"${scenario.getUri}::${scenario.getName}"
  }

  Configuration.headless = isHealdress
  Configuration.reportsFolder = "target/reports"
  Configuration.browserSize = browserSize
  Configuration.baseUrl = baseUrl
  Configuration.timeout = 10000
  Configuration.savePageSource = false
  Configuration.browserCapabilities = capabilities
}
