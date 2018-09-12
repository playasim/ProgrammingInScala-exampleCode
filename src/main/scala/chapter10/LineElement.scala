package chapter10

/**
  **
@Author Martin Ma
  * @Date 2018/9/12
  **/
class LineElement(s: String) extends ArrayElement(Array(s)){
  override val height = 1
  override val width = s.length
}
