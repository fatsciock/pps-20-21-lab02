package u02.lab02

object Parity {

  object ParityController {

    def verifyParity (x: Int) : String = x match {
      case n if n%2 == 0 => "even"
      case _ => "odd"
    }

    val verifyParityLiteral: Int => String = {
      case x if x%2 == 0 => "even"
      case _ => "odd"
    }
  }
}
