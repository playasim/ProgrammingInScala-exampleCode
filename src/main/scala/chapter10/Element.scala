package chapter10

import Element.elem
/**
  **
  */
abstract class Element {
  def contents: Array[String]
  //width & height也可以是val
  //val的访问会比方法快，但会占用额外空间
  def height: Int = contents.length
  def width: Int = if (height == 0) 0 else contents(0).length
  def above(that: Element) = {
    elem(this.contents ++ that.contents)//++拼接两个数组
  }
  def beside(that: Element) = {
    for (
      (line1, line2) <- this.contents zip that.contents
    ) yield line1 + line2
    def toString = contents mkString("\n")
  }

  def widen(w: Int): Element = {
    if (w <= width) this
    else {
      val left = elem(' ', (w - width) / 2, height)
      val right = elem(' ', w - width - left.width, height)
      (left beside this) beside (right)
    }
  }

}
