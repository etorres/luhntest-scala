package es.eriktorr.katas

import es.eriktorr.katas.NumberTokenizer.digitsFrom

object LuhnValidator {

  def isCreditCard(number: String): Boolean = {
    val (oddDigits, evenDigits) = digitsFrom(number)
      .reverse
      .zipWithIndex
      .partition(_._2 % 2 == 0)
    val oddDigitsSum = oddDigits.map(_._1).sum
    val evenDigitsSum = evenDigits
      .map(_._1 * 2)
      .map(d => digitsFrom(d.toString).sum)
      .sum
    (oddDigitsSum + evenDigitsSum) % 10 == 0
  }

}
