package u02.lab02

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class CurryingTest {

  val curryingObj = Currying

  @Test
  def testP1(){
    assertTrue(curryingObj.p1(1)(2)(3))
    val tmp = curryingObj.p1(1)(2)
    assertTrue(tmp(3))
    assertFalse(curryingObj.p1(10)(2)(3))
    assertFalse(curryingObj.p1(1)(10)(3))
  }

  @Test
  def testP2(){
    assertTrue(curryingObj.p2(1, 2, 3))
    assertFalse(curryingObj.p2(10,2,3))
    assertFalse(curryingObj.p2(1,10,3))
  }
}