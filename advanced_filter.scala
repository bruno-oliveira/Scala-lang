//Filters elements in even odd positions
def f(arr:List[Int]):List[Int] = for (i <- (1 to arr.size - 1 by 2).toList) yield arr(i)
