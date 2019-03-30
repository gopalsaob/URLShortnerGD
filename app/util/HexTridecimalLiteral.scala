package util

object HexTridecimalLiteral {
  private val AsciiValueOfZero = 48
  private val AsciiValueOfNine = 57
  private val AsciiValueOfA = 65
  private val AsciiValueOfZ = 90

  def toHexaTridecimal(s: String): Seq[HexTridecimalLiteral] = {
    s.map(HexTridecimalLiteral(_))
  }

  def apply(char: Char): HexTridecimalLiteral = {
    val value =
      char.toUpper.toInt match {
        case a if isLetterAtoZ(a) => (a - AsciiValueOfA) + 10
        case a if isLetterZeroToNine(a) => a - AsciiValueOfZero
        case _ => throw new IllegalArgumentException(s"$char is not a Base36 character")
    }
    new HexTridecimalLiteral(value)
  }

  private def isLetterZeroToNine(a: Int) = a >= AsciiValueOfZero && a <= AsciiValueOfNine

  private def isLetterAtoZ(a: Int) = a >= AsciiValueOfA && a <= AsciiValueOfZ
}

class HexTridecimalLiteral(val value: Int) extends AnyVal
