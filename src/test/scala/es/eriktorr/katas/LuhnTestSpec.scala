package es.eriktorr.katas

import es.eriktorr.katas.LuhnValidator.isCreditCard

class LuhnTestSpec extends UnitSpec {

  "A valid credit card number" should "pass Luhn test" in {
    isCreditCard("49927398716") shouldBe true
  }

  "A random selection of digits" should "fail Luhn test" in {
    isCreditCard("12345678901") shouldBe false
  }

}
