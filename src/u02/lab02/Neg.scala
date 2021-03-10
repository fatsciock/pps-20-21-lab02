package u02.lab02

object Neg {

  val neg : (String => Boolean) => (String => Boolean) = f => (s => !f(s))

  val empty = (s: String) => (s=="")
  val notEmpty = neg(empty)

  def negMethod (f: String => Boolean) : (String => Boolean) = {
    s => !f(s)
  }
}
