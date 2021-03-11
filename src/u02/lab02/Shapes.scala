package u02.lab02

sealed trait Shapes

object Shapes {

  case class Rectangle(l1: Double, l2: Double) extends Shapes
  case class Circle(r: Double) extends Shapes
  case class Square(l: Double) extends Shapes

  def perimeter(shape: Shapes): Double = shape match{
    case Rectangle(l1, l2) => (l1*2) + (l2*2)
    case Circle(r) => 2*r*Math.PI
    case Square(l) => l*4
  }

  def area(shape: Shapes): Double = shape match{
    case Rectangle(l1, l2) => l1*l2
    case Circle(r) => r*r*Math.PI
  }
}
