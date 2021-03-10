package u02.lab02

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class NegTest {

  val negObj = Neg

  @Test
  def testEmpty(){
    assertTrue(negObj.empty(""))
    assertFalse(negObj.empty("a"))
  }

  @Test
  def testNonEmpty(){
    assertFalse(negObj.notEmpty(""))
    assertTrue(negObj.notEmpty("foo"))
    assertTrue(negObj.notEmpty("foo") && !negObj.notEmpty(""))
  }

  @Test
  def testNonEmptyMethod(){
    assertFalse(negObj.negMethod(negObj.empty)(""))
    assertTrue(negObj.negMethod(negObj.empty)("foo"))
    assertTrue(negObj.negMethod(negObj.empty)("foo") && !negObj.negMethod(negObj.empty)(""))
  }
}
