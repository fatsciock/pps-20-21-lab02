package u02.lab02

object Compose {

  def compose(f: Int => Int, g: Int => Int): Int => Int = {
    func => f(g(func))
  }

  def genericCompose[A](f: A => A, g: A => A): A => A = {
    func => f(g(func))
  }
}
