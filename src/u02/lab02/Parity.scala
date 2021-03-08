package u02.lab02

object Parity {

  object ParityController {

    def verifyParity (n: Int) : String = n match {
      case n if n % 2==0 => "even"
      case _ => "odd"
    }
  }
}
