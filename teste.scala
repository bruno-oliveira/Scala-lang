import scala.collection.mutable.ListBuffer

def rep(n: Int, arg: Int) = for (i <- List.range(0, n)) yield arg
def f(num:Int,arr:List[Int]):List[List[Int]] = for (i <- arr) yield rep(num,i)
val times = scala.io.StdIn.readInt()
var list = new ListBuffer[Int]()
io.Source.stdin.getLines().foreach {line => list+=line.toInt}

f(times,list.toList).flatten.foreach(println)
