package u02.lab02

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class ParityTest {

  import u02.lab02.Parity._

  val parity = ParityController
  val even = "even"
  val odd = "odd"

  @Test
  def testEvenMethod(){
    assertEquals(even, parity.verifyParity(2))
  }

  @Test def testOddMethod(){
    assertEquals(odd, parity.verifyParity(1))
  }

  @Test
  def testEvenLiteral(){
    assertEquals(even, parity.verifyParityLiteral(2))
  }

  @Test def testOddLiteral(){
    assertEquals(odd, parity.verifyParityLiteral(1))
  }
}
