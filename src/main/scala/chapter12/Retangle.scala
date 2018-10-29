package chapter12

/**
  **
@Author Martin Ma
  * @Date 2018/10/29
  **/
class Retangle(val topLeft: Point, val bottomRight: Point) extends Rectangular {
  override def bottomRIght: Point = bottomRight
}
