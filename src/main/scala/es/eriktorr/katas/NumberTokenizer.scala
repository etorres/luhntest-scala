package es.eriktorr.katas

object NumberTokenizer {

  def digitsFrom(number: String): Seq[Int] = number.toList.map(_.asDigit)

}
