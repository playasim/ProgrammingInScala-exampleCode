package chapter6
import chapter6.Rational
object ch6Test extends App {
  val a = new Rational(1,2)
  val b = new Rational(3,4)
  val c = 4
  val d = 0

  //implicit conversion
  implicit def intToRational(x: Int): Rational = {
    new Rational(x, 1)
  }
  println(a + b)
  println(a - b)
  println(a * b)
  println(a / b)
  println(a * 2)
  println(2 * b)
}
