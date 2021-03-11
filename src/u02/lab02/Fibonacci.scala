package u02.lab02

object Fibonacci {

  def fib(n: Int): Int = n match {
    case 0 => 0
    case 1 => 1
    case n => fib(n-1) + fib(n-2)
  }

  /*
  * La ricorsione non è tail, e per esserne sicuro si può utilizzare
  * l'annotazione @annotation . tailrec che lo verifica restituendo
  * un errore.
  * */
}
