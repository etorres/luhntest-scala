package es.eriktorr.katas

import es.eriktorr.katas.NumberTokenizer.digitsFrom

object LuhnValidator {

  def isValidLuhn(number: String): Boolean = {
    val (oddDigits, evenDigits) = reverseDigitsFrom(number)
    totalSumEndsInZero(partialSumS1(oddDigits), partialSumS2(evenDigits))
  }

  private def partialSumS1(oddDigits: Seq[Int]): Int = {
    oddDigits.sum
  }

  private def partialSumS2(evenDigits: Seq[Int]): Int = {
    evenDigits.map(_ * 2)
      .map(d => digitsFrom(d.toString).sum)
      .sum
  }

  private def totalSumEndsInZero(s1: Int, s2: Int): Boolean = {
    (s1 + s2) % 10 == 0
  }

  private def reverseDigitsFrom(number: String): (Seq[Int], Seq[Int]) = {
    val (oddDigits, evenDigits) = digitsFrom(number)
      .reverse
      .zipWithIndex
      .partition {
        case (_, index) => index % 2 == 0
      }
    (withoutIndexes(oddDigits), withoutIndexes(evenDigits))
  }

  private def withoutIndexes(indexedDigits: Seq[(Int, Int)]): Seq[Int] = {
    indexedDigits.map {
      case (value, _) => value
    }
  }

}
