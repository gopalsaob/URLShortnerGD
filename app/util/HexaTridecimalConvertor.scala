package util

object HexaTridecimalConvertor {

  private val Base36 = 36

  def toDecimal(hexaTridecimals: String): Long = {
    java.lang.Long.parseLong(hexaTridecimals, Base36)
  }

  def toHexaTriDecimal(n: Long): String = {
    java.lang.Long.toString(n, Base36)
  }

}