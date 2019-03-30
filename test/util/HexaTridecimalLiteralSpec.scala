package util

import org.scalatest.{FreeSpec, Matchers}

class HexaTridecimalLiteralSpec extends FreeSpec with Matchers {

  "HexaTridecimalLiteral A should have value 10" in {
    HexTridecimalLiteral('A').value should be (10)
  }

  "HexaTridecimalLiteral Z should have value 35" in {
    HexTridecimalLiteral('Z').value should be (35)
  }

  "HexaTridecimalLiteral numeral should have same value as numeral" in {
    HexTridecimalLiteral('2').value should be (2)
  }

  "HexaTridecimalLiteral should be case-insensitive" in {
    HexTridecimalLiteral('a').value should be (10)
  }

}
