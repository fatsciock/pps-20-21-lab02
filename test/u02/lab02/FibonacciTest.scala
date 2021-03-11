package u02.lab02

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class FibonacciTest {

  val fibonacciObj = Fibonacci

  @Test
  def testFibonacci(){
    assertEquals(0, fibonacciObj.fib(0))
    assertEquals(1, fibonacciObj.fib(1))
    assertEquals(1, fibonacciObj.fib(2))
    assertEquals(2, fibonacciObj.fib(3))
    assertEquals(3, fibonacciObj.fib(4))

  }

}
