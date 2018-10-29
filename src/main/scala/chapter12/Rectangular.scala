package chapter12

trait Rectangular {
  def topLeft:Point
  def bottomRIght:Point
  def left = topLeft.x
  def right = bottomRIght.x
  def width = right - left
}
