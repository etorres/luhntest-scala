package es.eriktorr.katas

import es.eriktorr.katas.NumberTokenizer.digitsFrom

class NumberTokenizerSpec extends UnitSpec {

  "Number tokenizer" should "extract digits from credit card number" in {
    digitsFrom("49927398716") shouldBe Seq(4, 9, 9, 2, 7, 3, 9, 8, 7, 1, 6)
  }

}
