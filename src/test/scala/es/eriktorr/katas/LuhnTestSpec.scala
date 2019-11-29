package es.eriktorr.katas

import es.eriktorr.katas.LuhnValidator.isValidLuhn

class LuhnTestSpec extends UnitSpec {

  "A valid credit card number" should "pass Luhn test" in {
    isValidLuhn("49927398716") shouldBe true
  }

  "A random selection of digits" should "fail Luhn test" in {
    isValidLuhn("12345678901") shouldBe false
  }

}
