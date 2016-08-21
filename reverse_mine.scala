//reverse list
def myrev(arr:List[Int]):List[Int] = if (arr.tail.length > 0) { myrev(arr.tail) :+ arr.head } else arr
