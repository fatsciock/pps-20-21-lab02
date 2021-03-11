package u02.lab02

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class ComposeTest {

  val composeObj = Compose

  @Test
  def testCompose(){
    assertEquals(9, composeObj.compose(_-1,_*2)(5))

    assertNotEquals(10, composeObj.compose( _+1, x => x*x)(5))
    assertEquals(26, composeObj.compose( _+1, x => x*x)(5))
  }

  @Test
  def testGenericCompose(){
    testCompose()

    assertEquals("Ciao Andrea !", composeObj.genericCompose[String](s2 => s2.concat(" !"),s1 => "Ciao ".concat(s1))("Andrea"))
    assertFalse(composeObj.genericCompose[Boolean](b2 => b2 && true, b1 => !b1)(true))
  }
}
