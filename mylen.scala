//len of array
def f(arr:List[Int]):Int = if(arr.tail.length > 0) {1 + f(arr.tail)} else 1
