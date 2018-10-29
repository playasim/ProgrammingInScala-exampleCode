package chapter11

/**
  **
@Author Martin Ma
  * @Date 2018/10/29
  **/
class Dollar(val amount: Int) extends AnyVal {
  override def toString() = "$" + amount
}
