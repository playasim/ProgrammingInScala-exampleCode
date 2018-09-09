
var more = 1 //free variable
val addMore = (x: Int) => x + more //closure

val someNumbers = List(1,2,3,4,5,6,7)
var sum = 0
someNumbers.foreach(sum += _)

def makeIncreaser(more: Int) = (x: Int) => x + more
val inc1 = makeIncreaser(1)
inc1(10)