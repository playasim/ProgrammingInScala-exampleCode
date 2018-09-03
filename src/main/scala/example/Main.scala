package example

import scala.collection.mutable

object Main extends App {
  /*
  val treasureMap = mutable.Map[Int, String]();
  treasureMap += (1 -> "Go to isLand")
  treasureMap += (2 -> "Find big X on the ground")
  treasureMap += (3 -> "Dig.")
  println(treasureMap(2))*/

  def printArgs(args: Array[String]): Unit = {
    args.foreach(arg => println(arg))
  }

  def formatArgs(args: Array[String]) = args.mkString("\\")
  val res = Array("zero", "one", "two")
  println(formatArgs(res))
}
