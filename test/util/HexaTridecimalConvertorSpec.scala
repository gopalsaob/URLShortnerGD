package util

import org.scalatest.{FreeSpec, Matchers}

class HexaTridecimalConvertorSpec extends FreeSpec with Matchers {

  "HexaTridecimalConvertor.toDecimal should convert HexaTridecimal to Decimal " in {
    HexaTridecimalConvertor.toDecimal("abcd") should be (481261L)
  }

  "HexaTridecimalConvertor.toHexaTridecimal should convert Decimal to HexaTridecimal " in {
    HexaTridecimalConvertor.toHexaTriDecimal(481261L) should be ("abcd")
  }

}
