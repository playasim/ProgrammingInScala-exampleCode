package chapter6

class Rational(n: Int, d: Int) {
  //分母不能为0，否则报错
  require(d != 0) //precondition
  //最大公约数g
  private val g = gcd(n.abs, d.abs)
  //分子
  val number: Int = n / g
  //分母
  val denom: Int = d / g
  //辅助构造方法
  def this(n: Int) = this(n, 1)
  //重写toString
  override def toString: String = {
    if(number % denom != 0) number + "/" + denom
    else (number / denom).toString
  }
  //定义有理数加法
  def add(that: Rational): Rational = {
    new Rational(number * that.denom + that.number * denom, denom * that.denom )
  }
  def +(that: Rational): Rational = {
    new Rational(number * that.denom + that.number * denom, denom * that.denom )
  }
  def +(that: Int): Rational = {
    new Rational(that * denom + number, denom)
  }
  def -(that: Rational): Rational = {
    new Rational(number * that.denom - that.number * denom, denom * that.denom)
  }
  def -(that: Int): Rational = {
    new Rational(number - that * denom, denom)
  }
  def *(that: Rational): Rational = {
    new Rational(number * that.number, denom * that.denom)
  }
  def *(that: Int): Rational = {
    new Rational(number * that, denom)
  }
  def /(that: Rational): Rational = {
    new Rational(number * that.denom, denom * that.number)
  }
  def /(that: Int): Rational = {
    require(that != 0)
    new Rational(number, denom * that)
  }
  //定义小于方法
  def lessThan(that: Rational) = {
    this.number * that.denom - that.number * this.denom < 0
  }
  //定义max方法
  def max(that: Rational) = {
    if (this.lessThan(that)) that else this
  }
  //欧几里得算法求最大公约数
  private def gcd(a: Int, b: Int): Int = {
    if (b == 0) a else gcd(b, a % b)
  }



}
