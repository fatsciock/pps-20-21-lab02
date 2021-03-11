package u02.lab02

sealed trait Shapes

object Shapes {

  case class Rectangle(l1: Double, l2: Double) extends Shapes
  case class Circle(r: Double) extends Shapes
  case class Square(l: Double) extends Shapes

}
