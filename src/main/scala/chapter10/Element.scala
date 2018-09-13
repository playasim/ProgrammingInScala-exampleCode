package chapter10

/**
  **
@Author Martin Ma
  * @Date 2018/9/12
  **/
abstract class Element {
  def contents: Array[String]
  //width & height也可以是val
  //val的访问会比方法快，但会占用额外空间
  def height: Int = contents.length
  def width: Int = if (height == 0) 0 else contents(0).length
  def above(that: Element) = {
    new ArrayElement(this.contents ++ that.contents)
  }
  def beside(that: Element) = {
    val contents = new Array[String](this.contents.length)//假设高度一样
    for (i <- 0 until this.contents.length)
      contents(i) = this.contents(i) + that.contents(i)
    new ArrayElement(contents)
  }

}
