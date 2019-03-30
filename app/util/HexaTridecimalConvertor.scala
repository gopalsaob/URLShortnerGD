package util

import scala.math.pow

object HexaTridecimalConvertor {

  private val Base36 = 36

  def toDecimal(hexaTridecimals: Seq[HexTridecimalLiteral]): Long = {
    // We do a reverse because the computation is commutative in nature
    hexaTridecimals.reverse.zipWithIndex.foldLeft(0L) {
      case (sum: Long, (l: HexTridecimalLiteral, index: Int)) =>
        sum + (l.value * pow(Base36,index).toLong)
    }
  }

}