package util

import org.scalatest.{FreeSpec, Matchers}

class HexaTridecimalConvertorSpec extends FreeSpec with Matchers {

  "HexaTridecimalConvertor.toDecimal should convert HexaTridecimal to Decimal " in {
    HexaTridecimalConvertor.toDecimal(HexTridecimalLiteral.toHexaTridecimal("abcd")) should be (481261L)
  }

}
