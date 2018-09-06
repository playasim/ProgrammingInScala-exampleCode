package chapter8

import scala.io.Source

object LongLines {
  def processFile(filename: String, width: Int) = {
    def processFile(line: String) = {
      if (line.length > width)
        println(filename + ": " + line.trim)
    }
    val source = Source.fromFile(filename)
    for (line <- source.getLines())
      processFile(line)
  }

}
