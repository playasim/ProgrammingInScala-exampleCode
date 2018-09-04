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

  val List1 = (1,2,3)
  val List2 = (4,5,6)
 /* val combineList = List1:::List2
  print(combineList)*/
  def formatArgs(args: Array[String]) = args.mkString("\\")
  val res = Array("zero", "one", "two")
  println(formatArgs(res))
}
