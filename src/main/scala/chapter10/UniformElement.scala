package chapter10

/**
  **
@Author Martin Ma
  * @Date 2018/9/12
  **/
class UniformElement(ch: Char, override val width: Int, override val height: Int)
  extends Element {
  private val line = ch.toString * width

  override def contents = Array.fill(height)(line)
}
