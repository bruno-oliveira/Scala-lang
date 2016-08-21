def fib(n:Int):Int={
     def fib_helper(a:Int, b:Int, n:Int):Int ={
	if(n > 0) fib_helper(b,a+b,n-1) else a
    }
    fib_helper(0,1,n)
}

