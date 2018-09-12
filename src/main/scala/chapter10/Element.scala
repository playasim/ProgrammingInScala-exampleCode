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

}
