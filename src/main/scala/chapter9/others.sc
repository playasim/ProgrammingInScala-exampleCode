def containNeg(list: List[Int]) = list.exists(_ < 0)
def containsOdd(list: List[Int]) = list.exists( _ % 2 == 1)

//currying
def plainOldSum(x: Int, y: Int) = x + y
def curriedSum(x: Int)(y: Int) = x + y
plainOldSum(1,2)
curriedSum(1)(2)

//below is the curring process
def first(x: Int) = (y: Int) => x + y
val secend = first(1)
secend(2)
//
val onePlus = curriedSum(1)(_)
onePlus(3)
