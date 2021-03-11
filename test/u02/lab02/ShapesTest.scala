package u02.lab02

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class ShapesTest {

  val shapesObj = Shapes

  @Test
  def testRectanglePerimeter(){
    val rect = shapesObj.Rectangle(5, 12.7)
    assertEquals(35.4, shapesObj.perimeter(rect))
  }

  @Test
  def testCirclePerimeter(){
    val circle = shapesObj.Circle(5.5)
    assertEquals(34, shapesObj.perimeter(circle).intValue())
  }

  @Test
  def testSquarePerimeter(){
    val circle = shapesObj.Square(7.3)
    assertEquals(29.2, shapesObj.perimeter(circle))
  }




  @Test
  def testRectangleArea(){
    val rect = shapesObj.Rectangle(5, 12.7)

  }

  @Test
  def testCircleArea(){
    val circle = shapesObj.Circle(5.5)
  }

  @Test
  def testSquareArea(){
    val circle = shapesObj.Square(7.3)
  }
}
