def f(x:Float):Double=
{
     1+(for (i <- (1 to 9).toList) yield Math.pow(x,i))
	.zipWithIndex
	.map({case(x,y)=>(x,y+1)})
	.map({case(x,y)=>x/(1 to y.toInt)
	.toList
	.foldLeft(1)(_ * _)})
	.sum  
}
