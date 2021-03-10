package u02.lab02

object Currying {

  val p1 : Double => Double => Double => Boolean = x => y => z => {
    (x <= y) && (y <= z)
  }

  val p2 : (Double, Double, Double) => Boolean = (x,y,z) => {
    (x <= y) && (y <= z)
  }

}
