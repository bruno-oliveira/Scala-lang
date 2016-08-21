def isSorted(arr:List[Int]):Boolean={
	def innerFunc(arr:List[Int]):Int={
		if( (arr.length==2 && (arr(0) <= arr(1))) || arr.length==1 ) 1 else
		if((arr(0) <= arr(1)) && arr.length>2) innerFunc(arr.tail) else -1
	}
	innerFunc(arr)==1
}
